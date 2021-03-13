import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int dog = Integer.parseInt(scanner.nextLine());
                int pets = Integer.parseInt(scanner.nextLine());
                double dogFoods = dog * 2.50;
                double petsFood = pets * 4;
                double sum = dogFoods + petsFood;
                System.out.println(sum + " lv.");
                //"{крайната сума} lv."
                //28.5 lv.
    }
}
