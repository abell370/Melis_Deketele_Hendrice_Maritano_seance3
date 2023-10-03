package visitor;

import components.*;

public class Visitor implements ComponentVisitor{
    @Override
    public String visit(Cpu cpu){
        System.out.println("Marque du CPU est " + cpu.getMarque());
        return "Visitor for cpu";
    }

    @Override
    public String visit(Memory memory){
        System.out.println("Espace pris de la mémoire est " + memory.getEspacePris());
        return "Visitor for memory";
    }
}