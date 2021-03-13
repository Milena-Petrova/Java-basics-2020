import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //1.повтарящо действие е четене на променливата input
        //2. до кога->докато входа не стане stop
        while (!input.equals("Stop")) {
            System.out.println(input);
            input = scanner.nextLine();//на всяка итерация трябва да се въвежда
        }
    }
}
