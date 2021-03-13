import java.util.Scanner;

public class travelling {
    /*1. Избира си дестинация, 2. Започва да спестява, докато събере сумата
От конзолата всеки път ще се четат първо дестинацията и минималния бюджет, който ще е нужен за пътуването, реално число.
След това ще се четат няколко суми, реални числа, които Ани спестява като работи и когато успее да събере достатъчно за пътуването,
 ще заминава, като на конзолата трябва да се изпише:
 "Going to {дестинацията}!"
Когато е посетила всички дестинации, които иска, вместо дестинация ще въведе "End" и програмата ще приключи.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());//нужния бюджет за дестинацията
            double money = 0;//пари, които Ани събира
            while (true) {
                double saveMoney = Double.parseDouble(scanner.nextLine());//реални числа, които Ани спестява като работи
                money += saveMoney;
                if(money>=budget){
                    break;
                }
            }
            System.out.printf("Going to %s!%n",destination);
            destination = scanner.nextLine();
        }
    }
}


