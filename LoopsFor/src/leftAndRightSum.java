
import java.util.Scanner;

public class leftAndRightSum {
    public static void main(String[] args) {
        /*Да се напише програма, която чете 2*n-на брой цели числа, подадени от потребителя,
        и проверява дали сумата на първите n числа (лява сума) е равна на сумата на вторите n числа (дясна сума).
         При равенство печата " Yes, sum = " + сумата; иначе печата " No, diff = " + разликата.
         Разликата се изчислява като положително число (по абсолютна стойност).
         */
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= 2 * n; i++) {//броя числа за вход е 2 пъти по-голям от въведеното число n по условие
            int all = Integer.parseInt(scanner.nextLine());
            if (i <= n) {
                leftSum += all;
            } else {
                rightSum += all;
            }
        }
        if (rightSum == leftSum) {
            System.out.println("Yes, sum = " + leftSum);
        } else {
            int diff = leftSum - rightSum;
            System.out.printf("No, diff = %d", Math.abs(diff));

        }
    }
}
