import java.util.Scanner;

public class numberSequence {
    public static void main(String[] args) {
        //въвеждаме на входа число N и следва на конзолата да въведем N на брой числа, измежду които търсим минималното
        // или максималното
        //на изхода излизат съответно мин и макс числа от въведените

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int min = Integer.MAX_VALUE;//първоначално слагаме най-голямата стойност и обратно за минималното число
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {//правим цикъл за въвеждане на N бр.числа от конзолата

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber < min) {
                min = currentNumber;
            }
            if (currentNumber > max) {
                max = currentNumber;
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);

    }
}

