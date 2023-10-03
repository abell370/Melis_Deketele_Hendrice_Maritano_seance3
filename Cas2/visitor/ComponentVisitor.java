package visitor;

import components.*;

//interface visitor
public interface ComponentVisitor{
    String visit(Cpu cpu);
    String visit(Memory memory);
}