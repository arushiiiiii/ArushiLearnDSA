import java.util.Scanner;

public class NestedSwitch {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int empID = sc.nextInt();
        String department = sc.next();

        switch (empID) {
            case 1:
                System.out.println("Kunal Kushwaha");
                break;
            case 2:
                System.out.println("Arushi Gupta");
                break;
            case 3:
                System.out.println("Mr. X");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Entered correct EmpID");
        }


        // Better way to write
        switch (empID) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Arushi Gupta");
            case 3 -> {
                System.out.println("Mr. X");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Entered correct EmpID");
        }
    }
}
