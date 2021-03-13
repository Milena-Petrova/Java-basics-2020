import java.util.Scanner;

public class house {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n % 2 == 0) {//цикъл при четно число
            for (int i = 1; i <= (n + 1) / 2; i++) {
                for (int j = 1; j <= (n + 1) / 2 - i; j++) {
                    System.out.print("-");
                }
                for (int j = 0; j <= 2 * i - 1; j++) {//започва от 0, защото първият ред трябва да е с 2 звездички
                    System.out.print("*");
                }
                for (int j = 1; j <= (n + 1) / 2 - i; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        } else {//при нечетно число
            for (int i = 1; i <= (n + 1) / 2; i++) {
                for (int j = 1; j <= (n + 1) / 2 - i; j++) {
                    System.out.print("-");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= (n + 1) / 2 - i; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
        for (int i = 0; i <= n / 2 - 1; i++) {//цикъл за основа на къщичката
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {
                    System.out.print("|");
                } else {
                    System.out.print("*");
                }
              }
            System.out.println();
        }
    }
}




