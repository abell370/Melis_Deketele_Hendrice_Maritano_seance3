import components.Component;
import components.Cpu;
import components.Memory;
import visitor.ComponentVisitor;
import visitor.Visitor;

public class Cas2{

    public static void main(String[] args) throws Exception {
        Component cpu = new Cpu(50, "Intel", 600);
        Component memory = new Memory(78, 300);

        System.out.println(cpu.getPrice());
        System.out.println(memory.getPrice());

        ComponentVisitor myVisitor = new Visitor();

        cpu.accept(myVisitor);
        memory.accept(myVisitor);
    }
    
}