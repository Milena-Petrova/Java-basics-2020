import java.util.Scanner;

public class Godzila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countStatist = Integer.parseInt(scanner.nextLine());
        double pricePerStatist = Double.parseDouble(scanner.nextLine());

        double decorPrice = 0.10 * budget;
        double clothesPrice = countStatist * pricePerStatist;
        if(countStatist > 150){
            clothesPrice = clothesPrice - 0.10 * clothesPrice;
        }
        double expenses = decorPrice + clothesPrice;
        if (budget >= expenses){
            System.out.println("Action");
            double leftMoney = budget - expenses;
            System.out.printf("Wingard starts filming with %.2f leva left.",leftMoney);
        }else
            System.out.println("Not enough money!");
        double needMoney = expenses - budget;
        System.out.printf("Wingard needs %.2f leva more.",needMoney);
    }
}

