import java.util.Scanner;

public class SpecialNumbers {/*Да се напише програма, която чете едно цяло число N, въведено от потребителя,
и генерира всички възможни "специални" числа от 1111 до 9999. За да бъде "специално" едно число,
то трябва да отговаря на следното условие:
•	N да се дели на всяка една от неговите цифри без остатък.
Пример: при N = 16, 2418 е специално число:
•	16 / 2 = 8 без остатък
•	16 / 4 = 4 без остатък
•	16 / 1 = 16 без остатък
•	16 / 8 = 2 без остатък
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int num = 1111; num <= 9999; num++) {
            int digit1 = num / 1000;
            int digit2 = num / 100 % 10;
            int digit3 = num / 10 % 10;
            int digit4 = num % 10;
            if (digit2 != 0 && digit3 != 0 && digit4 != 0) {
              //  String currentDigit1 = "" + digit1;
             //   String currentDigit2 = "" + digit2;
              //  String currentDigit3 = "" + digit3;
              //  String currentDigit4 = "" + digit4;
                if (number % digit1 == 0 && number % digit2 == 0 && number % digit3 == 0 && number % digit4 == 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
