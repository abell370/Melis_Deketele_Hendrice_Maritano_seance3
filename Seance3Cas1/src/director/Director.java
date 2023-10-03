package director;

import builder.Builder;

public class Director {
    private final Builder builder;

    public Director(Builder builder) { this.builder = builder; }

    public void setRam() {
        this.builder.setRam();
    }

    public void setInOut() {
        this.builder.setInOut();
    }

    public void setName() {
        this.builder.setName();
    }

    public void setCPU() {
        this.builder.setCPU();
    }

    @Override
    public String toString() {
        return this.builder.toString();
    }

}
