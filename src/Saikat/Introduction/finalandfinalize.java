package Saikat.Introduction;

public class finalandfinalize {
    public static void main(String[] args) {

        final A obj = new A("Saikat Nayek");
        System.out.println(obj.name);
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
