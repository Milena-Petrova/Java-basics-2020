import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*правоъгълна кинозала столовете са наредени в  R реда и C колони.
•	Premiere – премиерна прожекция, на цена 12.00 лева.
•	Normal – стандартна прожекция, на цена 7.50 лева.
•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.
Вход: тип прожекция (стринг),
брой редове и брой колони в залата (цели числа),
 Изход: изчислява общите приходи от билети при пълна зала.
 Резултатът да се отпечата във формат като в примерите по-долу, с 2 знака след десетичната точка.
         */
        String typeProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int coloumns = Integer.parseInt(scanner.nextLine());
        double income = 0.00;

        switch (typeProjection) {
            case "Premiere":
                income = rows * coloumns * 12.00;
                break;
            case "Normal":
                income = rows * coloumns * 7.5;
                break;
            case "Discount":
                income = rows * coloumns * 5.0;
                break;
        }
        System.out.printf("%.2f leva", income);



    }
}
