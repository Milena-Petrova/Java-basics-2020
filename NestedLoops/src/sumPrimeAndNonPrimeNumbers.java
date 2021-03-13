import java.util.Scanner;

public class sumPrimeAndNonPrimeNumbers {
    /*ВХОД от конзолата цели числа в диапазона от -2,147,483,648 до 2,147,483,647,
    докато не се получи команда "stop". Да се намери сумата на всички въведени прости и сумата на всички въведени непрости числа.
    Ако на входа се подаде отрицателно число да се изведе следното съобщение "Number is negative.".
    В този случай въведено число се игнорира и не се прибавя към нито една от двете суми,
    а програмата продължава своето изпълнение, очаквайки въвеждане на следващо число.
    На ИЗХОДА да се отпечатат на два реда двете намерени суми в следния формат:
    "Sum of all prime numbers is: {prime numbers sum}"
    "Sum of all non prime numbers is: {nonprime numbers sum}"*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int sumPrime = 0;//сума на простите числа(тези, които се делят само на 1 и на себе си без остатък
        int sumNonPrime = 0;//сума на непростите числа(нулата също не е просто число)
        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);//вх.команда е стринг и затова го парсваме в число
            //Преди дазапочнем да проверяваме числото, правим проверка дали е отрицателно.
            //2 варианта: с continiue и с условна конструкция
            if (number < 0) {
                //        System.out.println("Number is negative.");
                //          input = scanner.nextLine();-> четем командата и се връщаме горе в цикъла
                //          continue;
                //    }
                System.out.println("Number is negative.");
                input = scanner.nextLine();//задължително даваме команда, иначе безкрайно върти цикъла
            } else {
                int countDiv = 0;//брояч, който брои колко делителя има всяко числo

                for (int i = 1; i <= number; i++) {//проверяваме колко делителя има всяко число
                    if (number % i == 0) {
                        countDiv++;
                    }
                }
                if (countDiv == 2) {//просто число
                    sumPrime += number;

                } else if (countDiv > 2) {//числотое съставно или непросто
                    sumNonPrime += number;
                }

                input = scanner.nextLine();//след всяка итерация въвеждаме нова команда
            }
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);
    }
}
