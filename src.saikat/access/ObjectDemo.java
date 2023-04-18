package access;

public class ObjectDemo {
    int num;
    float cgpa;

    public ObjectDemo(int num, float cgpa) {
        this.num = num;
        this.cgpa = cgpa;

    }
    //hashcode gets generated when garbage value hits.
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;          //will only check num
//        return this.cgpa == (ObjectDemo)obj).cgpa;       //this return would have checked if the cgpa is equall or not.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(12,99.8f);
//        System.out.println(obj.num);
        ObjectDemo obj2 = new ObjectDemo(12,88.0f);

//        if(obj.num > obj2.num){
//            System.out.println(obj.num);
//        }

//        if(obj.num == obj2.num){    //checking the address of the object
//            System.out.println("obj is same as obj2");
//        }

        if(obj.equals(obj2)){       //checking the num or gpa of the object
            System.out.println("obj is same as obj2");
        }
    }
}
