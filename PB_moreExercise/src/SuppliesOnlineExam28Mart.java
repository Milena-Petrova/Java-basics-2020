import java.util.Scanner;

public class SuppliesOnlineExam28Mart {
    public static void main(String[] args) {
       /* •	Пакет химикали - 5.80 лв
          •	Пакет маркери - 7.20 лв
          •	Препарат - 1.20 лв (за литър)
          От конзолата се четат 4 числа:
•	Първи ред - брой пакети химикали. Цяло число в интервала [0...100]
•	Втори ред - брой пакети маркери. Цяло число в интервала [0...100]
•	Трети ред - литър препарат за почистване на дъска. Реално число в интервала [0.00…50.00]
•	Четвърти ред - процентът намаление. Цяло число в интервала [0...100]
OUTPUT: Резултатът да се ФОРМАТИРА до третия знак след десетичната запетая.
        */
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());//бр. пакети химикалки
        int markers = Integer.parseInt(scanner.nextLine());//бр. пакети маркери
        double cleanLiquid = Double.parseDouble(scanner.nextLine());//бр./л почистващи препарати
        int discountPercentage = Integer.parseInt(scanner.nextLine());//отстъпка

        double pensPrise =  pens * 5.80;// сума на химикалките
        double markersPrise = markers * 7.20;
        double cleanLiquidPrise = cleanLiquid * 1.20;
        double sum = pensPrise + markersPrise + cleanLiquidPrise;
        double sumWithDiscount = sum - discountPercentage * sum/100;// discount/100 , за да стане %
        System.out.printf("%.3f",sumWithDiscount);

    }
}
