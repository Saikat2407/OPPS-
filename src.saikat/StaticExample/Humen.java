package StaticExample;

public class Humen {
    int Age;
    boolean married;
    String name;
    long salary;
    static long population;

    public Humen(int age, boolean married, String name, long salary) {
        Age = age;
        this.married = married;
        this.name = name;
        this.salary = salary;
        Humen.population += 1;
    }
}

