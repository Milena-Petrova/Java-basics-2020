import java.util.Scanner;

import static java.lang.Math.pow;

public class EvenPowerOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //   int a = 1;
        for (int i = 0; i <= n; i += 2) {
            System.out.println((int) (pow(2, i)));
        }
    }
}
