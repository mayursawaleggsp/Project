public class case1 {
    public static void main(String[] args) {
        int n = 8;
        int clo = 8;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < clo; j++) {
                if (i == 0 && j == 0 || i == 0 && j == 7) {
                    System.out.print("*");
                } else if (i == 1 && j == 0 || i == 1 && j == 1 || i == 1 && j == 6 || i == 1 && j == 7) {
                    System.out.print("*");
                } else if (i == 2 && j == 0 || i == 2 && j == 1 || i == 2 && j == 2 || i == 2 && j == 7 || i == 2 && j == 6 || i == 2 && j == 5) {
                    System.out.print("*");
                } else if (i == 3) {
                    System.out.print("*");
                } else if (i == 4) {
                    System.out.print("*");
                } else if (i == 5 && j == 0 || i == 5 && j == 1 || i == 5 && j == 2 || i == 5 && j == 7 || i == 5 && j == 6 || i == 5 && j == 5) {
                    System.out.print("*");
                } else if (i == 6 && j == 0 || i == 6 && j == 1 || i == 6 && j == 6 || i == 6 && j == 7) {
                    System.out.print("*");
                } else if (i == 7 && j == 0 || i == 7 && j == 7) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }
    }
}
