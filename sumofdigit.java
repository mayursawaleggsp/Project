public class sumofdigit {

    public static int digit(int num) {

        int sum = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            num = num / 10;
            sum += lastdigit;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = digit(4567);
        System.out.println(a);
    }
}
