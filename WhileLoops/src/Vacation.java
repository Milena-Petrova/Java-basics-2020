import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scan.nextLine());
        double availableMoney = Double.parseDouble(scan.nextLine());
        int daysCount = 0;
        int speningCount = 0;

        while (availableMoney < moneyNeeded && speningCount < 5){
            String command = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            daysCount++;
            if (command.equals("save")){
                availableMoney += money;
                speningCount = 0;
            }else if (command.equals("spend")){
                availableMoney -=money;
                speningCount++;
                if (availableMoney < 0){
                    availableMoney = 0;
                }
            }

        }
        if (speningCount == 5){
            System.out.println("You can't save the money.");
            System.out.println(daysCount);
        }
        if (availableMoney >= moneyNeeded){
            System.out.printf("You saved the money for %d days.", daysCount);
        }
    }
}