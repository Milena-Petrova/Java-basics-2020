import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Магазин за плодове през работните дни работи на следните цени:
плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
цена	2.50	1.20	0.85	1.45	   2.70	    5.50	    3.85

Събота и неделя магазинът работи на по-високи цени:
плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
цена	2.70	1.25	0.90	1.60	   3.00	     5.60	     4.20
Напишете програма, която чете от конзолата плод (banana / apple / orange / grapefruit / kiwi / pineapple / grapes),
ден от седмицата (Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday) и количество (десетично число) ,
 въведени от потребителя, и пресмята цената според цените от таблиците по-горе. При невалиден ден от седмицата или
 невалидно име на плод да се отпечата "error".
         */
        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        Double quantity = Double.parseDouble(scanner.nextLine());

        if ("Monday".equals(dayOfWeek) || "Tuesday".equals(dayOfWeek) || "Wednesday".equals(dayOfWeek) || "Thursday".equals(dayOfWeek) || "Friday".equals(dayOfWeek)) {
            switch (fruit) {
                case "banana":
                    System.out.printf("%.2f", quantity * 2.50);
                    break;
                case "apple":
                    System.out.printf("%.2f", quantity * 1.20);
                    break;
                case "orange":
                    System.out.printf("%.2f", quantity * 0.85);
                    break;
                case "grapefruit":
                    System.out.printf("%.2f", quantity * 1.45);
                    break;
                case "kiwi":
                    System.out.printf("%.2f", quantity * 2.70);
                    break;
                case "pineapple":
                    System.out.printf("%.2f", quantity * 5.50);
                    break;
                case "grapes":
                    System.out.printf("%.2f", quantity * 3.85);
                    break;
                default:
                    System.out.println("error");

            }

        } else if ("Saturday".equals(dayOfWeek) || "Sunday".equals(dayOfWeek)) {
            switch (fruit) {
                case "banana":
                    System.out.printf("%.2f", quantity * 2.70);
                    break;
                case "apple":
                    System.out.printf("%.2f", quantity * 1.25);
                    break;
                case "orange":
                    System.out.printf("%.2f", quantity * 0.90);
                    break;
                case "grapefruit":
                    System.out.printf("%.2f", quantity * 1.60);
                    break;
                case "kiwi":
                    System.out.printf("%.2f", quantity * 3.00);
                    break;
                case "pineapple":
                    System.out.printf("%.2f", quantity * 5.60);
                    break;
                case "grapes":
                    System.out.printf("%.2f", quantity * 4.20);
                    break;
                default:
                    System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}

