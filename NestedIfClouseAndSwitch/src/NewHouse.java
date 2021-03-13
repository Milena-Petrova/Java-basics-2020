import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*да напишете програма която да изчисли колко  ще струва, да сe засадят определен брой цветя
         и дали наличния бюджет ще е достатъчен.
цвете	    Роза	    Далия	    Лале	    Нарцис	    Гладиола
Цена
бр/лева	    5	        3.80	        2.80	    3	        2.50

Conditions:
•	повече от 80 Рози - 10% отстъпка от крайната цена
•	повече от 90  Далии - 15% отстъпка от крайната цена
•	повече от 80 Лалета - 15% отстъпка от крайната цена
•	по-малко от 120 Нарциса - цената се оскъпява с 15%
•	по-малко от 80 Гладиоли - цената се оскъпява с 20%
ВХОД:
•	Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
•	Брой цветя - цяло число в интервала [10…1000]
•	Бюджет - цяло число в интервала [50…2500]
ИЗХОД:
•	Ако бюджета им е достатъчен
 "Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left."
•	Ако бюджета им е НЕ достатъчен - "Not enough money, you need {нужната сума} leva more."
Сумата да бъде форматирана до втория знак след десетичната запетая.
*/
        String flower = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
       /*
       1. пари за цветя = numberOfFlowers*price
       2. проверка на цени
       3. проверка, дали стигат парите
        */
        double sum = 0;
        switch (flower){
            case "Roses":
                if(numberOfFlowers>80){
                    sum = 0.90*numberOfFlowers*5;//10 % discount
                }else{
                    sum = numberOfFlowers*5;
                }
                break;
            case "Dahlias":
                if(numberOfFlowers>90){
                    sum = 0.85*numberOfFlowers*3.80;//15 % discount
                }else{
                    sum = numberOfFlowers*3.80;
                }
                break;
            case "Tulips":
                if(numberOfFlowers>80){
                    sum = 0.85*numberOfFlowers*2.80;//15 % discount
                }else{
                    sum = numberOfFlowers*2.80;
                }
                break;
            case "Narcissus":
                if(numberOfFlowers<120){
                    sum = 1.15*numberOfFlowers*3.00;//15 % more expensive
                }else{
                    sum = numberOfFlowers*3.00;
                }
                break;
            case "Gladiolus":
                if(numberOfFlowers<80){
                    sum = 1.20*numberOfFlowers*2.50;//20 % more expensive
                }else{
                    sum = numberOfFlowers*2.50;
                }
                break;
        }
        if(sum<=budget){
            double rest = budget - sum;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numberOfFlowers,flower,rest);
        }else{
            double needmoney = sum-budget;
            System.out.printf("Not enough money, you need %.2f leva more.",needmoney);
        }
    }
}
