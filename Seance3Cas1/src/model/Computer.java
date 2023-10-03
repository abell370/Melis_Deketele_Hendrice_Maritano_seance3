package model;

import builder.Builder;
import builder.GraphicCard;
import builder.NetworkCard;

import java.util.Scanner;

public class Computer implements Builder {

    private CPU[] cpuList = {new CPU("Intel core I7", 12, 399.99), new CPU("AMD Ryzen 7 5700X", 8, 189.00), new CPU("Intel Xeon Gold", 24,1648.99)};
    public String name;
    int ramNumber;
    CPU cpu;
    int portInOutNumber;
    GraphicCard graphicCard = new GraphicCard();
    NetworkCard networkCard = new NetworkCard();
    Scanner scanner = new Scanner(System.in);

    public Computer(){}

    @Override
    public void setName() {
        System.out.print("Nouveau nom : ");
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
        this.portInOutNumber = scanner.nextInt();
    }

    @Override
    public double getPrice() {
        if(this.cpu != null)
            return this.cpu.price + (this.portInOutNumber * 10.99) + (this.ramNumber * 3.10) + this.graphicCard.getPrice() + this.networkCard.getPrice();
        return (this.portInOutNumber * 10.99) + (this.ramNumber * 3.10) + this.graphicCard.getPrice() + this.networkCard.getPrice();
    }

    public void addGraphicCard(GraphicCard card) {
        this.graphicCard = card;
    }

    public void addNetworkCard(NetworkCard card) {
        this.networkCard = card;
    }

    @Override
    public String toString(){
        String str = String.format("Le %s comporte en ce moment :\n -%d barrettes de RAM\n -%d entrées/sorties\n -CPU : %s \n", this.name, this.ramNumber, this.portInOutNumber, this.cpu.toString());
        if(this.graphicCard != null)
            str += this.graphicCard.toString();
        if(this.networkCard != null)
            str += this.networkCard.toString();
        return str;
    }
}
