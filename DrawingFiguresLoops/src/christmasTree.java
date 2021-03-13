import java.util.Scanner;

public class christmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {//принтва празните места
            for (int j = 1; j <=n-i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)//принтва звездичките
                if (k == i) {
                    System.out.print(" | ");
                } else {
                    System.out.print("*");
                }
            for (int l = 0; l < n - i; l++)
                System.out.print(" ");
            System.out.println();
        }
    }
}








