package com.oops.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student A = new Student(2, 80.5f);
        Student B = new Student(18, 89.5f);
        Student C = new Student(24, 60f);
        Student D = new Student(33, 89f);
        Student E = new Student(41, 90.5f);
        Student F = new Student(57, 97.5f);

        Student[] list = {A, B, C, D, E, F};

        System.out.println(Arrays.toString(list));
//        Arrays.sort(list); // since we have provided the compareTo method for marks in student class, therefore it will compare on the basis of marks. If we remove that then there will be an error because we don't the basis on which we should compare

        // sorting can be done in another way also
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.marks - o2.marks);  // on adding - it will sort in descending order
//            }
//        });

        // we can replace the above function with lambda expression
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));

//        if (A.compareTo(B) < 1) {
//            System.out.println(A.compareTo(B));
//            System.out.println("B has more marks");
//        }
    }
}
