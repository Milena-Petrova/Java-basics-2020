import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        /*Напишете програма, която до получаване на командата "Stop", чете цели числа, въведени от потребителя,
        и намира най-малкото измежду тях. Въвежда се по едно число на ред.
         */
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;

        while (!command.equals("Stop")) {
            int number = Integer.parseInt(command);
            if (number < minNumber) {
                minNumber = number;
            }
            command = scanner.nextLine();
        }
        System.out.println(minNumber);

    }
}
