public class Main {
    public static void main(String[] args) {
        // Q: Store a roll number
        int a = 18;

        // Q: Store a person's name
        String name = "Arushi";

        // Q: Store 5 roll numbers
        int rno1 = 12;
        int rno2 = 15;
        int rno3 = 25;
        int rno4 = 36;
        int rno5 = 3;


        // Hence to avoid this lengthy process, Arrays are used
        // syntax
        // datatype[] variable_name = new datatype[size]

        // int[] ros = new int[5];
        // or
        // int[] ros = {12,34,23,67,3};

        int[] ros;  // declaration of array. ros is getting defined in the stack
        ros = new int[5];  // initialisation. actually here object is being created in the memory (heap).

        System.out.println(ros[1]);  // 0 value will be shown as no value is passed in the array

        String[] arr = new String[4];
        System.out.println(arr[0]);  // null value will be displayed

//        for (int i = 0; i < arr.length; i++){
//            String element = arr[i];
//            System.out.println(element);
//        }

        for (String element : arr) {
            System.out.println(element);
        }


    }
}