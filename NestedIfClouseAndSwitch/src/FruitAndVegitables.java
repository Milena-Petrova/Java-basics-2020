import java.util.Scanner;

public class FruitAndVegitables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Да се напише програма, която чете име на продукт, въведено от потребителя, и проверява дали е плод или зеленчук.
•	Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
•	Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
•	Всички останали са "unknown"
Да се изведе "fruit", "vegetable" или "unknown" според въведения продукт.
*/
        String name = scanner.nextLine();
        if ("banana".equals(name) || "apple".equals(name) || "kiwi".equals(name) || "cherry".equals(name) || "grapes".equals(name) || "lemon".equals(name)) {
            System.out.println("fruit");
        } else if ("tomato".equals(name) || "cucumber".equals(name) || "pepper".equals(name) || "carrot".equals(name)) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
