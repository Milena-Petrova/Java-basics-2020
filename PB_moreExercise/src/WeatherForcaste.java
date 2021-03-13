import java.util.Scanner;

public class WeatherForcaste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Напишете програма, която познава дали е топло или студено навън.
        При въвеждане на "sunny" трябва да се отпечата "It's warm outside!".
        Във всички останали случаи трябва да се отпечата "It's cold outside!".
        sunny	It's warm outside!
        cloudy	It's cold outside!
        snowy	It's cold outside!
         */
        String predictWord = scanner.nextLine();
        if ("sunny".equals(predictWord)) {
            System.out.println("It's warm outside!");
        } else if ("cloudy".equals(predictWord) || "snowy".equals(predictWord)) {
            System.out.println("It's cold outside!");
        } else {
            System.out.println("It's cold outside!");
        }
    }
}
