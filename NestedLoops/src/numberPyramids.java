import java.util.Scanner;

public class numberPyramids {
    /*Напишете програма, която чете цяло число n, въведено от потребителя,
     и отпечатва пирамида от числа като в примерите:
     вход	изход
    7	    1
            2 3
            4 5 6
            7
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int current = 0;
        boolean isBigger = false;
        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= row; column++) {
                current++;
                System.out.printf("%d ", current);
                if (current == number) {
                    isBigger = true;
                    break;
                }
            }
            System.out.println();
            if (isBigger) {
                break;
            }
        }
    }
}
