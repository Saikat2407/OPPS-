package access;

public class A {
    protected int num;
    String name;
    int[] arr;
    public int getNum() {
        return num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
