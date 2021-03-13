import java.util.Scanner;

public class FitnessCardExam28March {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Да се напише програма, която проверява дали първоначално налична сума е достатъчна,
        за да се заплати карта за месечен достъп във фитнес.

Пол	        Gym	        Boxing	        Yoga	    Zumba	    Dances	    Pilates
мъж	        $42	         $41	        $45	        $34	        $51     	$39
жена	    $35         $37	            $42	        $31	        $53     	$37
Всички цени на карти за ученици (възраст под 19 години вкл.) са с 20% намаление.
ВХОД: •	Сумата, с която разполагаме - реално число в интервала [10.00…1000.00]
•	Пол - символ ('m' за мъж и 'f' за жена)
•	Възраст - цяло число в интервала [5…105]
•	Спорт - текст (една от възможностите в таблицата
ИЗХОД:•	Ако сумата е достатъчна:"You purchased a 1 month pass for {sport}."
       Ако сумата не е достатъчна :
"You don't have enough money! You need ${money} more."
до втория знак след десетичната запетая
*/
        //1.проверяваме дали парите са повече и дали имаме отстъпка за всеки пол и за всеки спорт
        //2. ако не са достатъчни, изчисляваме колко са нужни още
        double money = Double.parseDouble(scanner.nextLine());//парите, които имаме
        String gender = scanner.nextLine();//пол
        int age = Integer.parseInt(scanner.nextLine());//възраст
        String sport = scanner.nextLine();//вид спорт/активност
        double price = 0;
        if (gender.equals("m")) {
            switch (sport) {
                case "Gym":
                    price = 42;
                    break;
                case "Boxing":
                    price = 41;
                    break;
                case "Yoga":
                    price = 45;
                    break;
                case "Zumba":
                    price = 34;
                    break;
                case "Dances":
                    price = 51;
                    break;
                case "Pilates":
                    price = 39;
                    break;
            }
        }else if (gender.equals("f")) {
            switch (sport) {
                case "Gym":
                    price = 35;
                    break;
                case "Boxing":
                    price = 37;
                    break;
                case "Yoga":
                    price = 42;
                    break;
                case "Zumba":
                    price = 31;
                    break;
                case "Dances":
                    price = 53;
                    break;
                case "Pilates":
                    price = 37;
                    break;
            }
        }
                if (age <= 19) {
                    price = price- 0.20 * price;
                }
                if (money >= price) {
                    System.out.printf("You purchased a 1 month pass for %s.", sport);
                } else {
                    double needMoney = price - money;
                    System.out.printf("You don't have enough money! You need $%.2f more.", needMoney);
                }
            }
        }

