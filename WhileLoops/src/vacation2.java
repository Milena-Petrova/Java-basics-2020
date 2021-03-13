import java.util.Scanner;

public class vacation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double needMoney = Double.parseDouble(scanner.nextLine());//необходими пари за екскурзията
        double money = Double.parseDouble(scanner.nextLine());//налични пари
        int spendDays = 0;//дни, в които харчи
        int currentDay = 0;//брояч на дните


        while (money < needMoney && spendDays < 5) {
            String command = scanner.nextLine();//save or spend
            double input = Double.parseDouble(scanner.nextLine());//пари за деня
            currentDay++;
            if (command.equals("save")) {
                money += input;
                spendDays=0;
            } else if (command.equals("spend")) {
                money -= input;
                spendDays++;
                if (money <= 0) {
                    money = 0;
                }
            }
        }
        if (spendDays == 5) {
           // System.out.printf("You can't save the money.%n%d", spendDays);
            System.out.println("You can't save the money.");
            System.out.println(currentDay);
        }
        if (money >= needMoney) {
            System.out.printf("You saved the money for %d days.", currentDay);
        }
    }
}

