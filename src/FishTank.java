import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height= Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volume = length * width * height; //обем на басейна в куб.см
        double volumeL = volume * 0.001;//превръщане от куб.см в литри 1л = 10х10х10см -> 0.001м
        double water = volumeL - (volumeL * percent/100);//литри вода в басейна без определения %
            System.out.printf("%.2f", water );
    }
}
