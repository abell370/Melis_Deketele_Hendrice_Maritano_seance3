package expressions;

public class Plus extends Expression {
    Expression droite;
    Expression gauche;

    public Plus(Expression g, Expression d){
        gauche = g;
        droite = d;
    }

    @Override
    public int interpret(){
        return gauche.interpret() + droite.interpret();
    }
}
