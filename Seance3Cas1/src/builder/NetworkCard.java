package builder;

import model.CPU;

import java.util.Scanner;

public class NetworkCard implements Builder {

    private final CPU[] cpuList = {new CPU("Intel core I7", 12, 399.99), new CPU("AMD Ryzen 7 5700X", 8, 189.00), new CPU("Intel Xeon Gold", 24,1648.99)};
    String name;
    int ramNumber;
    CPU cpu;
    int intOutNumber;
    boolean hasBluetooth;
    Scanner scanner = new Scanner(System.in);

    public NetworkCard() {}

    @Override
    public void setName() {
        System.out.print("Nom carte réseau : ");
        this.name = scanner.next();
    }

    @Override
    public void setRam() {
        System.out.print("Combien de RAM voulez-vous : ");
        this.ramNumber = scanner.nextInt();
    }

    @Override
    public void setCPU() {
        CPU currentCPU;
        for(int i=0; i < cpuList.length; i++) {
            currentCPU = cpuList[i];
            System.out.println(i + 1 + ". " + currentCPU.name + " avec " + currentCPU.heartNumber + " coeurs à " + currentCPU.price + "€");
        }
        System.out.print("Votre choix : ");
        this.cpu = cpuList[scanner.nextInt()-1];
    }

    @Override
    public void setInOut() {
        System.out.print("Combien d'entrées/sorties voulez-vous : ");
        this.intOutNumber = scanner.nextInt();
    }

    @Override
    public double getPrice() {
        double price = 0.00;
        if(cpu != null)
            price =  (this.ramNumber * 3.10) + this.cpu.price + (this.intOutNumber * 10.99);
        else
            price = (this.ramNumber * 3.10) + (this.intOutNumber * 10.99);
        if(this.hasBluetooth)
            return price + 25.99;
        return price;
    }

    @Override
    public String toString() {
        return String.format(" -Carte réseau : %s (RAM: %d Go ; Entrées/Sorties: %d ; Prix: %f ; Bluetooth: %b; CPU: %s \n", this.name, this.ramNumber, this.intOutNumber, this.getPrice(), this.hasBluetooth, this.cpu.toString());
    }

}
