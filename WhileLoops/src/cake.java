import java.util.Scanner;

public class cake {
    public static void main(String[] args) {
        /*uslovie:     */
        Scanner scanner = new Scanner(System.in);
        int widthCake = Integer.parseInt(scanner.nextLine());
        int lengthCake = Integer.parseInt(scanner.nextLine());

        int pieces = widthCake * lengthCake;//площта на тортата определя колко парчета имаме 1х1см

        //стоп: команда стоп или когато свършат парчетата или pieces<=0

        while (pieces > 0) {
            String command = scanner.nextLine();//командата е или стоп или брой взети парчета
            if (command.equals("STOP")) {
                break;
            } else {
                //ako komandata e chìslo
                int takenPieces = Integer.parseInt(command);
                pieces -= takenPieces;
            }
        }
        if (pieces >= 0) {
            //ima ostanali parcheta
            System.out.printf("%d pieces are left.", pieces);
        } else {
            //njama ostanali
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
        }
    }
}
