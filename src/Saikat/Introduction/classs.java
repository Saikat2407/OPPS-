package Saikat.Introduction;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class classs {
    public static void main(String[] args) {
        Student[] everything = new Student[5];

//        System.out.println(Arrays.toString(everything));
        Student saikat = new Student();

        Student nayek = new Student(12,"ankita", 99.0f);

        System.out.println(nayek.roll);
        System.out.println(nayek.name);
        System.out.println(nayek.marks);

//        saikat.ChangeName("nayek");
//
//        saikat.greeting();


//        System.out.println(saikat.roll);
//        System.out.println(saikat.name);
//        System.out.println(saikat.marks);
    }
}
//create a class
//will be used for every single student
class Student {
    int roll;
    String name;
    float marks;

    Student () {
        this.roll = 12;
        this.name = "saikat";
        this.marks = 88.5f;
    }

    void greeting (){
        System.out.println("Hello! my name is " + name);
    }

    void ChangeName (String newname){
        name = newname;
//        System.out.println(newname);
    }

    Student (int rno, String name, float marks) {
        this.roll = rno;
        this.name = name;
        this.marks = marks;
    }
}