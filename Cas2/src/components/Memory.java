package components;

import visitor.ComponentVisitor;

public class Memory implements Component{
    private int espacePris;
    private int prix;

    public Memory(int espacePris,int prix){
        this.espacePris = espacePris;
        this.prix = prix;
    }

    @Override
    public String accept(ComponentVisitor visitor){
        return visitor.visit(this);
    }

    public int getEspacePris(){
        return espacePris;
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