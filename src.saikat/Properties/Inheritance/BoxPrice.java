package Properties.Inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    public BoxPrice(){
        this.cost = -1;
    }

    public BoxPrice(double len, double wid, double high, double weight, double cost) {
        super(len, wid, high, weight);
        this.cost = cost;
    }

    public BoxPrice(double weight, double side, double cost) {
        super(weight, side);
        this.cost = cost;
    }
}
