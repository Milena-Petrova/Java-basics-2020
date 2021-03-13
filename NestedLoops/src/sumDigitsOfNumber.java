import java.util.Scanner;

public class sumDigitsOfNumber {
    //алгоритъм за сумиране на цифрите на многоцифрени числа, което не знаем колко е голямо
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        //примерно число 12345
        //1. Взимаме последната цифра -> 5 (12345 % 10)
        //2. Сумираме я; ( 5 )
        //3. Премахваме я от числото (1234 , тоест 12345/10
        while (number>0){
            int lastDigit = number%10;
            sum+=lastDigit;
            number=number/10;
        }
        System.out.println(sum);
    }
}
