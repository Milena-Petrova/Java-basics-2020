import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Conditions:
        1)
    Ако групата е до 6 човека включително  –  отстъпка от 10%.
 •	Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
•	Ако групата е от 12 нагоре  –  отстъпка от 25%.
 2)•
 Цената за наем на кораба през пролетта е  3000 лв.
•Цената за наем на кораба през лятото и есента е  4200 лв.
•Цената за наем на кораба през зимата е  2600 лв.

допълнителнa 5% отстъпка ако са четен брой рибари,освен ако не е есен - тогава нямат допълнителна отстъпка.
ВХОД: Бюджет – цяло число в интервала [1…8000]•	Сезон –  текст : "Spring", "Summer", "Autumn", "Winter"
•	Брой рибари – цяло число в интервала [4…18]
Изход
Да се отпечата на конзолата един ред:
•	Ако бюджетът е достатъчен: "Yes! You have {останалите пари} leva left."
•	Ако бюджетът НЕ Е достатъчен:"Not enough money! You need {сумата, която не достига} leva."
Сумите трябва да са форматирани с точност до два знака след десетичната запетая.
 */
int budget = Integer.parseInt(scanner.nextLine());
String season = scanner.nextLine();
int fishingMen = Integer.parseInt(scanner.nextLine());
double rentShip = 0;
switch (season) {
    case "Spring":
        rentShip = 3000;
        break;
    case "Summer":
    case "Autumn":
        rentShip = 4200;
        break;
    case "Winter":
        rentShip = 2600;
        break;
}
if(fishingMen<=6) {
    rentShip = 0.9 * rentShip;//10% discount
}else if((fishingMen>=7)&&(fishingMen<=11)) {
    rentShip = 0.85*rentShip;//15% discount
}else if(fishingMen>12) {
    rentShip = 0.75*rentShip; //25% discount
}
//проверка дали са четен брой
if(fishingMen % 2==0 && !season.equals("Autumn")) {
    rentShip = rentShip * 0.95;
}
if (budget>=rentShip){
    double leftMoney = budget - rentShip;
    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
}else if(budget<rentShip){
    double needMoney = rentShip - budget;
    System.out.printf("Not enough money! You need %.2f leva.",needMoney);
}
    }
}
