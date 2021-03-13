import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Напишете програма, която спрямо времето от денонощието и градусите да препоръчва какви дрехи да облечем.
        От конзолата се четат точно два реда:
•	Градусите - цяло число в интервала [10…42]
•	Текст, време от денонощието - с възможности - "Morning", "Afternoon", "Evening"
Да се отпечата на конзолата на един ред: "It's {градуси} degrees, get your {облекло} and {обувки}."*/

    int temperature = Integer.parseInt(scanner.nextLine());
    String dayTime = scanner.nextLine();
    String outfit = "";
    String shoes = "";
        switch (dayTime) {
            case "Morning":
                if (temperature >= 10 && temperature <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    //System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
                } else if (temperature > 18 && temperature <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                  //  System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
                } else if (temperature >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                   // System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
                }
                break;
            case "Afternoon":
                if (temperature >= 10 && temperature <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                   // System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
                } else if (temperature > 18 && temperature <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                  //  System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
                } else if (temperature >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                 //   System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
                }
                break;
            case "Evening":
                if (temperature >= 10) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                  //  System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
                }
                break;

        }
        System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
    }

}


