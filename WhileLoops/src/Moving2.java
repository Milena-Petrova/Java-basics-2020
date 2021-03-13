import java.util.Scanner;

public class Moving2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        //обемът на помещението, което ще се пълни с багаж с размер 1х1х1==бр. пакети, които побира стаята
        int room = width * length * height;
        //докато имам място в стаята, слагаме кашони, тоест вадим от V по един кашон на всяка итерация
        //или до получаване на команда
        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            int boxes = Integer.parseInt(command);
            room -= boxes;

            if (room < 0) {

                break;
            }
            command = scanner.nextLine();

        }
        if (room < 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(room));
        } else {
            System.out.printf("%d Cubic meters left.", room);
        }
    }
}