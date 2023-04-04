package Inheritance;

public class main {
    public static void main(String[] args) {
        Box box1 = new Box(23.4,67.8,55.0);

        BoxWeight box2 = new BoxWeight(23.0);
        System.out.println(box1.high + " " + box2.weight);

        BoxWeight box3 = new BoxWeight(12.9,99.0,89.0,4.9);
        System.out.println(box3.high + " " + box3.wid+ " " + box3.len + " " + box2.weight);


//        System.out.println(box1.len + " " + box1.wid + " " + box1.high);
    }
}
