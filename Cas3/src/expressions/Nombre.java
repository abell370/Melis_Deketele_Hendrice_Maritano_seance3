package expressions;

public class Nombre extends Expression {
    int valeur;
    
    public Nombre(int v){
        valeur = v;
    }

    public Nombre(String v){
        valeur = Integer.parseInt(v);
    }

    @Override
    public int interpret(){
        return this.valeur;
    }
}
