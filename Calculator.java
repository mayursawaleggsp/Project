import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Operation to be perform");
        String op = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (op.equalsIgnoreCase("Add")) {
            System.out.println("Performing Addition Operation");
            int sum = a+b;
            System.out.println("Value is = "+ sum);
        }else if (op.equalsIgnoreCase("Sub")) {
            System.out.println("Performing Substration Operation");
            int sum = a-b;
            System.out.println("Value is = "+ sum);
        }else if (op.equalsIgnoreCase("Multiply")) {
            System.out.println("Performing Multiplication Operation");
            int sum = a*b;
            System.out.println("Value is = "+ sum);
        }else if (op.equalsIgnoreCase("Divide")) {
            System.out.println("Performing Divide Operation");
            int sum = a/b;
            System.out.println("Value is = "+ sum);
        }else if (op.equalsIgnoreCase("Modulo")) {
            System.out.println("Performing Modulo or remainder Operation");
            int sum = a%b;
            System.out.println("Value is = "+ sum);
        }else {
            System.out.println("wrong input");
        }
    }
}
