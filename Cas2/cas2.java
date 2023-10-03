public interface Component {
    double getPrice();
    boolean validateConfiguration();
    String accept(ComponentVisitor visitor);
}

public class Cpu implements Component{
    private int pourcent;
    private String marque;
    public Cpu(int pourcent, String marque){
        this.pourcent = pourcent;
        this.marque = marque;
    }
    public String accept(ComponentVisitor visitor){
        return visitor.visitCPU(this);
    }
}

public class Memory implements Component{
    private int espace_pris;
    private int prix;
    public Memory(int espace_pris,int prix){
        this.espace_pris = espace_pris;
        this.prix = prix;
    }
    public String accept(ComponentVisitor visitor){
        return visitor.visitMemory(this);
    }
}

//interface visitor
public interface ComponentVisitor{
    String visitCPU(Cpu cpu);
    String visitMemory(Memory memory);
}

//class implementant le visitor
public class Visitor implements ComponentVisitor{
    public String visitCPU(Cpu cpu){
        return "Visitor for cpu";
    }
    public String visitMemory(Memory memory){
        return "Visitor for memory";
    }
}
