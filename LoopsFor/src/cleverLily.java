
import java.util.Scanner;

public class cleverLily {
    public static void main(String[] args) {
        /*Лилие на N години. За всеки  нечетен рожден -> подарък получава играчки,
        а за всеки четен (2, 4, 6...n) -> пари.
        За втория рожден ден получава 10.00 лв, като сумата се увеличава с 10.00 лв.,
        за всеки следващ четен рожден ден (2 -> 10, 4 -> 20, 6 -> 30...и т.н.).
        През годините Лили тайно е спестявала парите. Братът на Лили, в годините, които тя получава пари,
        взима по 1.00 лев от тях. Лили продала играчките получени през годините, всяка за P лева и добавила
        сумата към спестените пари. С парите искала да си купи пералня за X лева.
        Напишете програма, която да пресмята, колко пари е събрала и дали ѝ стигат да си купи пералня.
        ВХОД
        •	Възрастта на Лили - цяло число в интервала [1...77]
        •	Цената на пералнята - число в интервала [1.00...10 000.00]
        •	Единична цена на играчка - цяло число в интервала [0...40]
ИЗХОД:
•	Ако парите на Лили са достатъчни:
o	“Yes! {N}” - където N е остатъка пари след покупката
•	Ако парите не са достатъчни:
o	“No! {М}“ - където M е сумата, която не достига
•	Числата N и M трябва да за форматирани до вторият знак след десетичната запетая.
         */

        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());//cena na peralnata
        int toysPrice = Integer.parseInt(scanner.nextLine());//cena na 1 igrachka

        double sumMoney = 0;//сумата на събраните пари * 10лв за всяка четна година
        double saveMoney = 0;
        int yearsToy = 0;
        int moneySteel = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                sumMoney = sumMoney + 10;//всяка четна година сумата нараства с 10лв
                saveMoney = saveMoney + sumMoney;//спестените пари  през четните години
                moneySteel++;//парите, които взима брат и всяка четна година
            } else {
                yearsToy = yearsToy + 1;
            }
        }//общата събра сума пари вкл. продажбата на играчките и взетите от брат и
        double money = saveMoney + yearsToy * toysPrice - moneySteel;
        if (money >= price) {
            double restSum = money - price;
            System.out.printf("Yes! %.2f", restSum);
        } else {
            double needMoney = price - money;
            System.out.printf("No! %.2f", needMoney);
        }
    }
}




