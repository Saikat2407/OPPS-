package Inheritance;

public class main {
    public static void main(String[] args) {
        Box box1 = new Box(23.4,67.8,55.0);

        BoxWeight box2 = new BoxWeight(23.0);
        System.out.println(box1.high + " " + box2.weight);

        BoxWeight box3 = new BoxWeight(12.9,99.0,89.0,4.9);
        System.out.println(box3.high + " " + box3.wid+ " " + box3.len + " " + box2.weight);

        //Box box5 = new BoxWeight(2, 3, 4, 8);
        //System.out.println(box5.w);

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
        //BoxWeight box6 = new Box(2, 3, 4);
        //System.out.println(box6);


        //System.out.println(box1.len + " " + box1.wid + " " + box1.high);
    }
}
