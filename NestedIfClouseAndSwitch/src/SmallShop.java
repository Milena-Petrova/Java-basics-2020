import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*продукт, град, количество
                coffee  water   beer   sweets  peanuts
        Sofia	0.50	0.80	1.20	1.45	1.60
        Plovdiv	0.40	0.70	1.15	1.30	1.50
        Varna	0.45	0.70	1.10	1.35	1.55
        Напишете програма, която чете продукт (низ), град (низ) и количество (десетично число),
        въведени от потребителя, и пресмята и отпечатва колко струва съответното количество от
        избрания продукт в посочения град.*/
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        switch (city){
            case "Sofia":
            //pravim vtori switch
                switch(product){
                    case "coffee":
                        System.out.println(amount*0.5);
                        break;
                    case "water":
                        System.out.println(amount*0.8);
                        break;
                        //за всеки продукт се прави
                    case "beer":
                        System.out.println(amount*1.2);
                        break;
                    case "sweets":
                        System.out.println(amount*1.45);
                        break;
                    case "peanuts":
                        System.out.println(amount*1.6);
                        break;
                }
            break;
            case "Plovdiv":
                switch(product) {
                    case "coffee":
                        System.out.println(amount * 0.4);
                        break;
                    case "water":
                        System.out.println(amount * 0.7);
                        //за всеки продукт се прави
                        break;
                    case "beer":
                        System.out.println(amount * 1.15);
                        break;
                    case "sweets":
                        System.out.println(amount * 1.3);
                        break;
                    case "peanuts":
                        System.out.println(amount * 1.5);
                        break;
                }
                break;
            case "Varna":
                switch (product){
                    case "coffee":
                        System.out.println(amount*0.45);
                        break;
                    case "water":
                        System.out.println(amount*0.7);
                        break;
                        //за всеки продукт се прави
                    case "beer":
                        System.out.println(amount*1.1);
                        break;
                    case "sweets":
                        System.out.println(amount*1.35);
                        break;
                    case "peanuts":
                        System.out.println(amount*1.55);
                        break;
                }
                break;
        }

    }
}