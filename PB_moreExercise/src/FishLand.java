import java.util.Scanner;

public class FishLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Колко пари ще са му необходими, за да плати сметката си, ако цените на борсата са:
•	Паламуд – 60% по-скъп от скумрията
•	Сафрид – 80% по-скъп от цацата
•	Миди – 7.50 лв. за килограм
Вход:
•	Първи ред – цена на скумрията на килограм. Реално число в интервала [0.00…40.00]
•	Втори ред – цена на цацата на килограм. Реално число в интервала [0.00…30.00]
•	Трети ред – килограма паламуд. Реално число в интервала [0.00…50.00]
•	Четвърти ред – килограма сафрид. Реално число в интервала [0.00… 70.00]
•	Пети ред – килограма миди. Цяло число в интервала [0 ... 100]
ИЗХОД:
Колко пари ще са нужни , за да си плати сметката, закръглено до вторият знак след десетичната запетая (1.2457 -> 1.25).
*/
        double priceSkumria = Double.parseDouble(scanner.nextLine());//цена на скумрията
        double priceTsatsa = Double.parseDouble(scanner.nextLine());//цена на цаца
        double kgPalamud = Double.parseDouble(scanner.nextLine());//количество паламуд
        double kgSafrid = Double.parseDouble(scanner.nextLine());//количествосафрид
        double kgMussles = Double.parseDouble(scanner.nextLine());//количество мидите
        //1. колко струва всяка риба на борсата
        //2. общата сума е сбор от парите за всички риби

        double pricePalamud = 1.60*priceSkumria;// паламудът е с 60% по-скъп от скумрията
        double priceSafrid = 1.80*priceTsatsa;//сафридът е с 80% по-скъп от цацата
        double sumPalamud = pricePalamud*kgPalamud;
        double sumSafrid = priceSafrid*kgSafrid;
        double sumMussles = kgMussles*7.50;
        double total = sumPalamud+sumSafrid+sumMussles;
        System.out.printf("%.2f",total);
    }
}
