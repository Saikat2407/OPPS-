package Saikat.Introduction;

public class finalandfinalize {
    public static void main(String[] args) {

        final A obj = new A("Saikat Nayek");
        final int num = 12;  //final keyword doesn't let you manipulate once you assigned.
        System.out.println(obj.name);
        System.out.println(obj.num);
    }
}

class A {
    final int num = 10;

    String name;

    public A(String name) {
        this.name = name;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println();
//    }
}
