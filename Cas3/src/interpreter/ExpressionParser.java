package interpreter;

import java.util.Stack;

import expressions.Expression;
import expressions.Moins;
import expressions.Nombre;
import expressions.Plus;

public class ExpressionParser {
    private boolean isOperator(String str){
        return str.equals("+") || str.equals("-");
    }

    private Expression parseOperator(Expression gauche, Expression droite, String operatorSymbol){
        if(operatorSymbol.equals("+")){
            return new Plus(gauche, droite);
        }else{
            return new Moins(gauche, droite);
        }
    }

    public int parse(String str){
        Stack<Expression> expressionStack = new Stack<>();
        String[] tokens = str.split(" ");

        for (String token : tokens) {
            if(!isOperator(token)){
                Nombre nombre = new Nombre(token);
                expressionStack.push(nombre);
                System.out.println("Added number " + token);
            }else{
                Expression gauche = expressionStack.pop();
                Expression droite = expressionStack.pop();
                Expression operator = parseOperator(gauche, droite, token);
                expressionStack.push(operator);

                System.out.println(String.format("Added operator %s , result : %d", token, operator.interpret()));
            }
        }
        
        return expressionStack.pop().interpret();
    }

    public int parseClassic(String str) throws Exception{
        String[] tokens = str.split(" ");
        Expression lastExpression = null;

        if(tokens.length % 2 == 0){
            throw new Exception("Invalid mathematical expression");
        }

        if(tokens.length == 1){
            return new Nombre(tokens[0]).interpret();
        }

        for (int i = 0; i < tokens.length; ++i) {
            if(isOperator(tokens[i])){
                Expression gauche = lastExpression != null ? lastExpression : new Nombre(tokens[i-1]);
                Expression droite = new Nombre(tokens[i+1]);
                lastExpression = parseOperator(gauche, droite, tokens[i]);
            }
        }

        return lastExpression.interpret();
    }
}
