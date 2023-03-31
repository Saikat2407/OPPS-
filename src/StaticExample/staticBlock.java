package StaticExample;

public class staticBlock {
    static int a = 5;
    static int b;

    //will run only once when the first obj is created i.e. when the class is loaded in main.
    static {
        System.out.println("I am in Static Block");
        b = a * 5;
    }

    //main function.
    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);

        staticBlock haha = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);

    }
}
