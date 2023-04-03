package Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double len, double wid, double high, double weight) {
        super(len, wid, high);
        this.weight = weight;
    }
}
