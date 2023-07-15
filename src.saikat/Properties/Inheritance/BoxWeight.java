package Properties.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(double weight) {
        this.weight = weight;
    }


    BoxWeight (double weight, double side){
        super(side);
        this.weight = weight;
    }
//    @Override  //this is called as annotation
    //static method can't be overridin
    static void greeting(){
        System.out.println("Hey, Greeting is in BoxWeight!");
    }

    public BoxWeight(double len, double wid, double high, double weight) {

        //used to initialize values, present in parent class.
        super(len, wid, high);  //What is this ?? --> call the parent class constructor.
        // System.out.println(super.high);
        this.weight = weight;
    }


}
