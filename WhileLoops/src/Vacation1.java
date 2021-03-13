
import java.util.Scanner;

public class Vacation1 {
    public static void main(String[] args) {
/*Събиране на пари за екскурзия.Всеки ден част от парите се спестяват или харчат.
 Ако се похарчат повече от наличните  пари -> ще останат 0 лева.
 Вход
•	Пари нужни за екскурзията - реално число в интервала [1.00…25000.00]
•	Налични пари - реално число в интервала [0.00...25000.00]
След това многократно се четат по два реда:
•	Вид действие - текст с възможности "spend" и "save".
•	Сумата, която ще спести/похарчи - реално число в интервала [0.01…25000.00]
ИЗХОД:Програмата приключва при следните случаи:
•	Ако 5 последователни дни Джеси само харчи, на конзолата да се изпише:
o	"You can't save the money."
o	"{Общ брой изминали дни}"
•	Ако Джеси събере парите за почивката на конзолата се изписва:
o	"You saved the money for {общ брой изминали дни} days."*/
        Scanner scanner = new Scanner(System.in);
        double needMoney = Double.parseDouble(scanner.nextLine());//необходими пари за екскурзията
        double currentMoney = Double.parseDouble(scanner.nextLine());//налични пари
        int spendDays = 0;//дни, в които харчи

        int currentDay = 0;//брояч на дните

        while (currentMoney< needMoney&&spendDays<5) {
            String command = scanner.nextLine();
            double input = Double.parseDouble(scanner.nextLine());//пари за деня
            currentDay++;
            switch (command) {
                case "spend":
                    currentMoney -= input;
                    if (currentMoney < 0) {
                        currentMoney = 0;
                    }
                    spendDays++;
                    break;
                case "save":
                    currentMoney += input;
                    spendDays=0;//нулираме дните , тоест в случая на "save" се "харчат" 0 дни
                    break;
            }
        }
            if (currentMoney>=needMoney) {
                System.out.printf("You saved the money for %d days.", currentDay);
            }
            if(spendDays==5){
                System.out.printf("You can't save the money.%n%d", currentDay);
            }

        }

    }








