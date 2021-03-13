import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        /*Пренася се багаж на части в ограничено пространство с рвмери ШхВхД(вход).
        Пакетите багаж са с размери 1м х1м х1м
        Напишете програма, която изчислява свободния обем от жилището,
        който остава след като пренесе багажа си.
        ВХОД:
      1.  Д/Ш/В -> цели числа
        2.	На следващите редове (до получаване на команда "Done") - брой кашони, които се пренасят в квартирата - цели числа в интервала [1...10000]
Програмата трябва да приключи прочитането на данни при команда "Done" или ако свободното място свърши.
Изход:
-	Ако стигнете до командата "Done" и има още свободно място:
"{брой свободни куб. метри} Cubic meters left."
-	Ако свободното място свърши преди да е дошла команда "Done":
"No more free space! You need {брой недостигащи куб. метри} Cubic meters more."
         */
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        //обемът на помещението, което ще се пълни с багаж с размер 1х1х1==бр. пакети, които побира стаята
        int room = width * length * height;

        //докато имам място в стаята, слагаме кашони, тоест вадим от V по един кашон на всяка итерация
        //или до получаване на команда

        while (room > 0) {
            String command = scanner.nextLine();
            if (command.equals("Done")) {
                break;
            } else {
                int movingBox = Integer.parseInt(command);//ako komandata ne e DONE , значи е Бройка кашон
                room -= movingBox;//стаята намалява с обема на кашона
            }

        }
        if (room >= 0) {
            System.out.printf("%d Cubic meters left.", room);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(room));
        }
    }
}







