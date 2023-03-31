package StaticExample;

public class Main {
    public static void main(String[] args) {
        Humen saikat = new Humen(12,false,"saikat", 78999);
        Humen nayek = new Humen(14,true,"nayek", 78999);

//        System.out.println(saikat.Age);
        System.out.println(Humen.population);
    }
    //This is not dependent on object
    static void fun(){
        //cannot access non-static stuff into static stuff.
//        greeting();

        //you can't access non-static stuff without referencing their
        // instance in a static context.

        Main obj = new Main();
        obj.greeting();
    }

    //we know that something which is non-static belongs to an obejct..
    void greeting() {
        System.out.println("hehe!");
    }
}
