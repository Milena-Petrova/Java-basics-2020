import java.util.Scanner;

public class SpecialNum2 {
    /*Да се напише програма, която чете едно цяло число N, въведено от потребителя,
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
        for (int num1 = 1; num1 <= 9; num1++) {
            for (int num2 = 1; num2 <= 9; num2++) {
                for (int num3 = 1; num3 <= 9; num3++)
                    for (int num4 = 1; num4 <= 9; num4++) {
                        boolean check1 = number % num1 == 0;
                        boolean check2 = number % num2 == 0;
                        boolean check3 = number % num3 == 0;
                        boolean check4 = number % num4 == 0;
                        if (check1 && check2 && check3 && check4) {
                            System.out.printf("%d%d%d%d ", num1, num2, num3, num4);
                        }
                    }
            }

        }
    }
}

