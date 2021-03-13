import java.util.Scanner;
public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceForTrip = Double.parseDouble(scanner.nextLine());//сума з аекскурзията
        int numberOfpuzzles = Integer.parseInt(scanner.nextLine());
        int numberOfdolls = Integer.parseInt(scanner.nextLine());
        int numberOfbears = Integer.parseInt(scanner.nextLine());
        int numberOfminions = Integer.parseInt(scanner.nextLine());
        int numberOftrucks = Integer.parseInt(scanner.nextLine());
        /*•	Пъзел - 2.60 лв.
•	Говореща кукла - 3 лв.;
•	Плюшено мече - 4.10 лв.
•	Миньон - 8.20 лв.
•	Камионче - 2 лв.
. при играчки>=50бр. -> отстъпка 25% от общата сума на покупката
. 10% от спечелените пари = наем на магазин
Изход(до втори знак след запетаята):
•	Ако парите са достатъчни се отпечатва:	"Yes! {оставащите пари} lv left."(rentShop
•	Ако парите НЕ са достатъчни се отпечатва: "Not enough money! {недостигащите пари} lv needed."
         */
        double puzzleProfit = numberOfpuzzles * 2.60; //сумите в лв , събрани за всяка изграчка
        double dollsProfit = numberOfdolls * 3.00;
        double bearsProfit = numberOfbears * 4.10;
        double minionsProfit = numberOfminions * 8.2;
        double trucksProfit = numberOftrucks * 2.00;
        double toysNumber = numberOfpuzzles + numberOfdolls + numberOfbears + numberOfminions + numberOftrucks;//oбщ брой играчки
        //ako toysNumber>=50 -> toysProfit = 0.75 * toysProfit (25% discount)
        double toySumLv = puzzleProfit + dollsProfit + bearsProfit + minionsProfit + trucksProfit;//сума в лв на всички закупени играчки
        double rentShop = 0.10 * toySumLv;//разноски за наем на магазин
        double toysProfit = toySumLv - rentShop;//печалба
        // ако priceForTrip <=toysProfit -> парите са достатъчни, ходя на екскурзия
        //if priceForTrip > toysProfit -> екскурзия, ако не -> няма
        if (toysNumber < 50) {

            if (priceForTrip <= toysProfit) {
                double restMoney = toysProfit - priceForTrip;
                System.out.printf("Yes! %.2f lv left.", restMoney);
            } else {//Not enough money! {недостигащите пари} lv needed.
                double needMoney = priceForTrip - toysProfit;
                System.out.printf("Not enough money! %.2f lv needed.", needMoney);
            }
        } else if (toysNumber >= 50) {
            toySumLv = 0.75 * toySumLv;
            rentShop = 0.10 * toySumLv;
            toysProfit = toySumLv - rentShop;
            if (priceForTrip <= toysProfit) {
                double restMoney = toysProfit - priceForTrip;
                System.out.printf("Yes! %.2f lv left.", restMoney);
            } else {
                double needMoney = priceForTrip - toysProfit;
                System.out.printf("Not enough money! %.2f lv needed.", needMoney);
            }
        }

    }
}

