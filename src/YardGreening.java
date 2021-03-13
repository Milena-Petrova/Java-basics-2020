import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double areaYard = Double.parseDouble(scanner.nextLine());
        double price = areaYard * 7.61;
        double discount = 0.18 * price;
        double endUserPrice = price - discount;
        //The final price is: 3432.11 lv.
        //The discount is: 753.39 lv.
        System.out.println("The final price is: " + endUserPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
