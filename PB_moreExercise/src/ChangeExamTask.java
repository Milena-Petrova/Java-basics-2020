import java.util.Scanner;

public class ChangeExamTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoin = Integer.parseInt(scanner.nextLine());
        double cny = Double.parseDouble(scanner.nextLine());//китайски юан
        double comision = Double.parseDouble(scanner.nextLine());
        /*•	1 биткойн = 1168 лева.
•	1 китайски юан = 0.15 долара.
•	1 долар = 1.76 лева.
•	1 евро = 1.95 лева.
Обменното бюро има комисионна от 0 до 5 процента от крайната сума в евро.
*/
        int bitcoinToLv = bitcoin*1168;
        double cnyToUsdToLv = cny*0.15*1.76;//китайски юани в долари и после в лева
        double money = (bitcoinToLv + cnyToUsdToLv)/1.95;//всички пари конвертирани в евро
        comision = money * comision/100;
        double moneySum = money - comision;//сума без комисионната в лева
        System.out.printf("%.2f", moneySum );



    }
}

