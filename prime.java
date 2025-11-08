//import java.util.Scanner;
//
//public class prime {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean isPrime = true;
//
//        for (int i=2; i<=(n-1); i++){
//            if(n%i==0){
//                isPrime = false;
//                break;
//            }
//            if(isPrime){
//                System.out.println("Prime Number");
//            }
//            else{
//                System.out.println("Not a Prime Number");
//            }
//        }
//    }
//}

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

            for (int i = 2; i <= (n-1); i++) {  // check from 2 to n-1
                if (n % i == 0) {
                    isPrime = false;
                    break;   // stop as soon as a divisor is found
                }
            }

        if (isPrime) {
            System.out.println("Input number is a prime No");
        } else {
            System.out.println("Input number is not a prime No");
        }
    }
}
