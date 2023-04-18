package ExceptionHandling;

import access.A;

public class Main {
    public static void main(String[] args) {
        int a = 9;
        int b = 0;

        try {
//            int c = a / b;
            divide(a, b);
        } catch (ArithmeticException e){  //it will execute if it catches any exception
            System.out.println(e.getMessage());
        } finally {             //finally keyword always execute
            System.out.println("this will always execute ");
        }
    }
 
    static int divide(int a, int b) throws ArithmeticException {
//        return a / b;
        if (b == 0) throw new ArithmeticException("don't divide by zero");
        return a / b;
    }
}