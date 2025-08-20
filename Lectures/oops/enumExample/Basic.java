package com.oops.enumExample;

public class Basic{
    // enum can implement as many interfaces as it wants, but it cannot extends classes.
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public, static and final
        // since its final you can create child enums
        // type is week

        Week() {
            System.out.println("Constructor called for " + this);
        }
        // this is not public or protected, only private or default
        // why? we don't want to create new objects
        // this is not the enum concept, thats why

        // internally : public static final Week Monday = new Week();

        @Override
        public void hello() {
            System.out.println("Heyaa");
        }
    }


    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));  // returning the value of enum constant
//        System.out.println(week);
//        System.out.println(week.ordinal());
//
//        for (Week day : Week.values()) {
//            System.out.println(day);
//        }
    }
}
