package StaticExample;

public class InnnerClasses {
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test haha = new Test("saikat");
        Test Rahul = new Test("Ragulll");

        System.out.println(haha.name);
        System.out.println(Rahul.name);
    }
}
