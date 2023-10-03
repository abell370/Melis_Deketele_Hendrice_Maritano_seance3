package components;

import visitor.ComponentVisitor;

public class Cpu implements Component{
    private int pourcent;
    private String marque;
    private int prix;

    public Cpu(int pourcent, String marque, int prix){
        this.pourcent = pourcent;
        this.marque = marque;
        this.prix = prix;
    }

    @Override
    public String accept(ComponentVisitor visitor){
        return visitor.visit(this);
    }

    public String getMarque(){
        return marque;
    }

    @Override
    public double getPrice() {
        return prix;
    }
    @Override
    public boolean validateConfiguration() {
        return true;
    }
}