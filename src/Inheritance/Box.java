package Inheritance;

import java.util.Arrays;

public class Box {
    double len;
    double wid;
    double high;

    public Box () {
        this.len = 1;
        this.high = 1;
        this.wid = 1;
    }

    public Box(double len, double wid, double high) {
        this.len = len;
        this.wid = wid;
        this.high = high;
//        System.out.println(this.len + " " + this.high);
    }

    public static void main(String[] args) {
        Box haha = new Box(34.6,67.0,22.4);
        Box haha1 = new Box();

//        System.out.println(haha);
    }
}