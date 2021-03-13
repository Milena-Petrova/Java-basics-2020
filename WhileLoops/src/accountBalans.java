import java.util.Scanner;

public class accountBalans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //повтарящо се действие:въвеждане на пари и добавяне към сметката
        //докато не въведат NoMore moneey
        //докато се въведе отрицателно число
        String input = scanner.nextLine();//Money || число
        double totalMoney = 0;
        while (!input.equals("NoMoreMoney")) {
            double currentAmount = Double.parseDouble(input);//текущата сума, парсната, заото входът е стринг
            if(currentAmount<0){
                System.out.println("Invalid operation!");
                break;
            }
            totalMoney += currentAmount;
            System.out.printf("Increase: %.2f%n", currentAmount);

            input = scanner.nextLine();//винаги задаваме нов вход->промяната
        }
        System.out.printf("Total: %.2f", totalMoney);
    }

}

