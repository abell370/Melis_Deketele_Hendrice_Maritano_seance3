package expressions;

public class Moins extends Expression{
    Expression droite;
    Expression gauche;

    public Moins(Expression g, Expression d){
        gauche = g;
        droite = d;
    }

    @Override
    public int interpret(){
        return gauche.interpret() - droite.interpret();
    }
}