package model;

public class CPU {

    public String name;
    public int heartNumber;
    public double price;

    public CPU(String name, int heartNumber, double price) {
        this.name = name;
        this.heartNumber = heartNumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s avec %d de coeurs au prix de %.2f €", this.name, this.heartNumber, this.price);
    }

}
