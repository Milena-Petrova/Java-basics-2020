import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*	"room for one person" – 18.00 лв. за нощувка
          	"apartment" – 25.00 лв. за нощувка
        	"president apartment" – 35.00 лв. за нощувка
Намаления според броя нощувки(престоя минус 1,пример: 11 дни = 10 нощувки):

помещение	        по-малко от 10 дни          между 10 и 15 дни	        повече от 15 дни

single room         не ползва намаление	            не ползва намаление	        не ползва намаление

apartment	    30% от крайната цена	        35% от крайната цена	    50% от крайната цена

president
apartment	    10% от крайната цена	      15% от крайната цена	         20% от крайната цена
оценката за услугите на хотела може да е позитивна (positive) или негативна (negative)
 Ако оценката  е позитивна, към цената с вече приспаднатото намаление добавя 25% от нея(бакшиш).
 Ако оценката  е негативна се приспада от цената 10%(плаща с 10% по-малко).
Вход
•	Първи ред - дни за престой - цяло число в интервала [0...365]
•	Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
•	Трети ред - оценка - "positive"  или "negative"
Изход : •	Цената за престоят му в хотела, форматирана до втория знак след десетичната запетая.
         */
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String review = scanner.nextLine();

        double nights = days - 1;
        double price = 0;

        switch (room) {
            case "room for one person":
                price = nights * 18.00;
                break;
            case "apartment":
                if (nights < 10) {
                    price = 0.70 * nights * 25.00;//30% discount
                } else if (nights >= 10 && nights < 15) {
                    price = 0.65 * nights * 25.00;//35% discount
                } else if (nights >= 15) {
                    price = 0.50 * nights * 25.00;//50% discount
                }
                break;
            case "president apartment":
                if (nights < 10) {
                    price = 0.90 * nights * 35;//10% discount

                } else if (nights >= 10 && nights < 15) {
                    price = 0.85 * nights * 35.00;//35% discount
                } else if (nights >= 15) {
                    price = 0.80 * nights * 35.00;//50% discount
                }
                break;
        }
                    if("positive".equals(review)) {
                        System.out.printf("%.2f", price * 1.25);//25% бакшиш
                    }else if("negative".equals(review)){
                    System.out.printf("%.2f", price * 0.90);//10% не плаща, не е доволен
                }
            }
        }
