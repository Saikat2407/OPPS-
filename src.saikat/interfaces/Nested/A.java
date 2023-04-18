package interfaces.Nested;

public class A {
    public interface NestedInterface{
        boolean isodd(int num);
    }
}

class B implements A.NestedInterface{

    @Override
    public boolean isodd(int num) {
        return (num & 1) == 1;
    }
}
