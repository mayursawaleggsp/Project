public class case2 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // place stars based on row/col relationship
                if (i == 0 || i == 4)  {       // left & right border
                    System.out.print("* ");
                } else if (i == 1 && j == 0 || i== 2 && j == 0 || i==3 && j == 0) {
                    System.out.print("*");
                }
                else if (i == 1 && j == cols - 1 || i== 2 && j == cols - 1 || i==3 && j == cols - 1) {
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");           // spaces otherwise
                }
            }
            System.out.println();
        }
    }
}