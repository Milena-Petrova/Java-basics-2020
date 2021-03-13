import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //even or odd number
        //дали е по-голямо от 5 и четно
        int number = Integer.parseInt(scanner.nextLine());
        if (number > 5) {
            if (number % 2 == 0) {
                System.out.println("Even and Bigger than 5.");
            }
        }
    }
}