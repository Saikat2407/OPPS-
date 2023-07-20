package access;

public class Subclass extends A {

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(22, "nana");
        String n = obj.name;
        System.out.println(n);
//    }
    }

    class subsubclass extends Subclass {

        public subsubclass(int num, String name) {
            super(num, name);
        }

//    public static void main(String[] args) {
//        subsubclass obj = new subsubclass(22,"sikay");
//        int n = obj.num;
//        System.out.println(n);
//    }
    }
}
