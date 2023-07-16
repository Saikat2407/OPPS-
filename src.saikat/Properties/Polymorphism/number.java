package Properties.Polymorphism;

public class number {
    int num;

    public number(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        number num1 = new number(23);
        System.out.println(num1);
    }

    @Override
    public String toString() {
        return "number{" +
                "num=" + num +
                '}';
    }
}
