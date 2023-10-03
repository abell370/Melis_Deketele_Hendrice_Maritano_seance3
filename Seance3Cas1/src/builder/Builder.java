package builder;

public interface Builder {
    void setName();
    void setRam();
    void setCPU();
    void setInOut();
    double getPrice();
    String toString();
}
