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
            }else{
                Expression gauche = expressionStack.pop();
                Expression droite = expressionStack.pop();
                Expression operator = parseOperator(gauche, droite, token);
                expressionStack.push(operator);
            }
        }
        
        return expressionStack.pop().interpret();
    }
}
