import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int termMonths = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

      // 1. изчисляваме натрупаната лихва: 200 * 5.7% = 11.4лв.
       // 2. изчисляваме лихвата за 1 месец: 11.4лв./12 месеца = 0.95лв
       // 3. общата сума е 200лв депозит + (3 (срок на депозита) * 0.95 лв)

        double interest = (deposit * percent)/100;//natrupanata lihva; delim na 100, zashtoto imame procent!!!
        //превръщане от % (от входни данни) в число(в кода) => делим на 100
        //превръщане на число (от вх. данни) в процент (в кода) => умножаваме по 100
        double interestPerMonth = interest/12;//lihva na mesec
        double sum = deposit + termMonths*interestPerMonth;
        System.out.println(sum);
    }
}
