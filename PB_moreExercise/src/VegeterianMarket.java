import java.util.Scanner;

public class VegeterianMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //От конзолата се четат 4 числа, по едно на ред: BGN
        //output :EURO
        //•	Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
        //•	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
        //•	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
        //•	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]
        double vegyPrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        double vegyKG =Double.parseDouble(scanner.nextLine());
        double fruitKG = Double.parseDouble(scanner.nextLine());

        double vegySum = vegyPrice*vegyKG;
        double fruitSum = fruitKG*fruitPrice;
        double sum = (vegySum+fruitSum)/1.94;//suma v EURO
        System.out.printf("%.2f", sum);

    }
}
