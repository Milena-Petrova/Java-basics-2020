import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        /*ВХОД: цяло число от конзолата и на всеки следващ ред цели числа,
         докато тяхната сума стане по-голяма или равна на първоначалното число.
         След приключване на четенето да се отпечата сумата на въведените числа.
         */
        Scanner scanner = new Scanner(System.in);
        int requiredSum = Integer.parseInt(scanner.nextLine());

        int currentNumbersSum = 0;
        while(currentNumbersSum<requiredSum){
            int currentNumber = Integer.parseInt(scanner.nextLine());
            currentNumbersSum+=currentNumber;
        }
        System.out.println(currentNumbersSum);
    }
}
