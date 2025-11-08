import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int multiple = calfac(n);
        System.out.println(multiple);
    }
    public static int calfac(int n){
        int sum = 1;
        for (int i=1;i<=n;i++){
            sum *= i;
        }
        return sum;
    }
}
