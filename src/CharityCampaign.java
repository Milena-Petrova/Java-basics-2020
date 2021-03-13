import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int Cookers = Integer.parseInt(scanner.nextLine());
        int cakesPerDayPerCook = Integer.parseInt(scanner.nextLine());
        int wafflePerDayPerCook = Integer.parseInt(scanner.nextLine());
        int panCakesPerDayPerCook = Integer.parseInt(scanner.nextLine());
        //•	Торта - 45 лв.
        //•	Гофрета - 5.80 лв.
        //•	Палачинка - 3.20 лв.
        //Торти: 14 * 45 = 630 лв.;
        //Гофрети: 30 * 5.80 = 174 лв.;
        //Палачинки: 16 * 3.20 = 51.20 лв.
        //Обща сума за един ден от всички сладкари: (630 + 174 + 51.20) * 8 = 6841.60 лв.
        //Сума събрана от цялата кампания: 6841.60 * 23 = 157356.8лв.
        //Сума след покриване на разходите: 157356.8 - 1/8 от 157356.8 = 137687.2 лв.

        double cakesSum = cakesPerDayPerCook *45.0;// сумата от торти на ден
        double waffleSum = wafflePerDayPerCook * 5.80;//вафли
        double pancakeSum = panCakesPerDayPerCook * 3.20;//палачинки на ден
        double sumPerCookPerDay = (cakesSum + waffleSum + pancakeSum) * Cookers;//сумата от продажбите на ден от 1 сладкар
        double sumPerAllDays = sumPerCookPerDay*days;//sumata sybrana za perioda
        double sum = sumPerAllDays - sumPerAllDays * 1/8;
        System.out.printf("%.2f",sum);


    }
}
