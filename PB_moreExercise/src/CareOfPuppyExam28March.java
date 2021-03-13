import java.util.ArrayList;
import java.util.Scanner;

public class CareOfPuppyExam28March {
    public static void main(String[] args) {
        /*Кученце изяжда дневно определено количество храна. Да се напише програма, която проверява дали количеството храна,
        което е закупено за кученцето, ще е достатъчно докато кученцето бъде осиновено.
        Вход
•	Закупеното количество храна за кученцето в килограми – цяло число в интервала [1 …100]
•	На всеки следващ ред до получаване на команда Adopted -> колко грама изяжда кученцето на всяко хранене - цяло число в интервала [10 …1000]
Изход
•	Ако количеството храна е достатъчно да се отпечата:
 	"Food is enough! Leftovers: {останала храна} grams."
•	Ако количеството храна не е достатъчно да се отпечата:
 	"Food is not enough. You need {нужно количество храна} grams more."
*/
        Scanner scanner = new Scanner(System.in);
       int food = Integer.parseInt(scanner.nextLine());
        String stop = scanner.nextLine();
        int eat=0;
        while (!stop.equals("Adopted")) {

            int grFood = Integer.parseInt(stop);//парсвана стойност на стринга, тоест става пак число

            eat +=grFood;

            stop = scanner.nextLine();
        }

        if(eat<=food*1000){
            int leftovers = food*1000-eat;
            System.out.printf("Food is enough! Leftovers: %d grams.", leftovers);
        }else{
            int needMore = eat - food*1000;
            System.out.printf("Food is not enough. You need %d grams more.", needMore);
        }
    }
}