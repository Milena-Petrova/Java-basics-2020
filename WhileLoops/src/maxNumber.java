import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        /*Напишете програма, която до получаване на командата "Stop", чете цели числа, въведени от потребителя,
         и намира най-голямото измежду тях. Въвежда се по едно число на ред.Izhod naj-golqmoto wywedeno ìslo
         */
        Scanner scanner = new Scanner(System.in);
        //   int numbers = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int maxNumber = Integer.MIN_VALUE;
        while (!command.equals("Stop")) {
            int input = Integer.parseInt(command);
            if (input >= maxNumber) {
                maxNumber = input;
            }
            command = scanner.nextLine();
        }
        System.out.println(maxNumber);

    }
}
