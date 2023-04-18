package enumExample;

public class BasicEnum {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        //these are enum constants
        //public, static, final.
    }

    public static void main(String[] args) {
        Day day = Day.MONDAY;

//        for (Day day1 : Day.values()){
//            System.out.println(day1);
//        }
        System.out.println(day);
    }

}
