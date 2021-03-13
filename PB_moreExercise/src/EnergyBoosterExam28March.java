import java.util.Scanner;

public class EnergyBoosterExam28March {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*. Фирма предлага
        малки разфасовки са с по 2 бр.
        големи по 5 бр. енергийни гела, като цената на един гел зависи от плодовете, от които е направен.
         Да се напише програма, която изчислява сумата, която трябва да се плати за поръчката.
                    Диня        	    Манго	            Ананас      	    Малина
2 броя (small)	56 лв./бр.	        36.66 лв./бр.   	42.10 лв./бр.	        20 лв./бр.
5 броя (big)	28.70 лв./бр.   	19.60 лв./бр.   	24.80 лв./бр.	        15.20 лв./бр.

ОТСТЪПКИ: 15% от 400 до 1000лв; 50% за над 1000лв покупки
ВХОД:
1.	Плод - текст с възможности: "Watermelon", "Mango", "Pineapple" или "Raspberry"
2.	Размерът на сета - текст с възможности: "small" или "big"
3.	Брой на поръчаните сетове - цяло число в интервала [1 … 10000]
ИЗХОД :
•	Цената, която трябва да се заплати, форматирана до втория знак след десетичната запетая, в следния формат:
"{цената} lv."
         */
        String fruit = scanner.nextLine();//вид аромат на гела
        String pack = scanner.nextLine();//голяма или малка опаковка
        int numberOfSets = Integer.parseInt(scanner.nextLine());//брой опаковки
        double amount = 0;//сума на покупките
        switch (fruit) {
            case "Watermelon":
                switch (pack) {
                    case "small":
                        amount = numberOfSets * 56 * 2.0;
                        if (amount >= 400 && amount <= 1000) {
                            amount = 0.85 * amount;
                        } else if (amount > 1000) {
                            amount = 0.50 * amount;
                        }
                        System.out.printf("%.2f lv.",amount);
                        break;
                    case "big":
                        amount = numberOfSets * 28.70 * 5;
                        if (amount >= 400 && amount <= 1000) {
                            amount = 0.85 * amount;
                        } else if (amount > 1000) {
                            amount = 0.50 * amount;
                        }
                        System.out.printf("%.2f lv.",amount);
                        break;

                }
                break;
            case "Mango":
                switch (pack) {
                    case "small":
                        amount = numberOfSets * 36.66 * 2;//2br w paket
                        if (amount >= 400 && amount <= 1000) {
                            amount = 0.85 * amount;
                        } else if (amount > 1000) {
                            amount = 0.50 * amount;
                        }
                        System.out.printf("%.2f lv.",amount);
                        break;
                    case "big":
                        amount = numberOfSets * 19.60 * 5;//za 5 br w paket

                        if (amount >= 400 && amount <= 1000) {
                            amount = 0.85 * amount;
                        } else if (amount > 1000) {
                            amount = 0.50 * amount;
                        }
                        System.out.printf("%.2f lv.",amount);
                        break;

                }
                break;
            case "Pineapple":
                switch (pack) {
                    case "small":
                        amount = numberOfSets * 42.10 * 2;
                        if (amount >= 400 && amount <= 1000) {
                            amount = 0.85 * amount;

                        } else if (amount > 1000) {
                            amount = 0.50 * amount;
                        }
                        System.out.printf("%.2f lv.",amount);
                        break;
                    case "big":
                        amount = numberOfSets * 24.80 * 5;
                        if (amount >= 400 && amount <= 1000) {
                            amount = 0.85 * amount;
                        } else if (amount > 1000) {
                            amount = 0.50 * amount;
                        }
                        System.out.printf("%.2f lv.",amount);
                        break;
                }
                break;
            case "Raspberry":
                switch (pack) {
                    case "small":
                        amount = numberOfSets * 20.0 * 2;
                        if (amount >= 400 && amount <= 1000) {
                            amount = 0.85 * amount;

                        } else if (amount > 1000) {
                            amount = 0.50 * amount;
                        }
                        System.out.printf("%.2f lv.",amount);
                        break;
                    case "big":
                        amount = numberOfSets * 15.20 * 5;
                        if (amount >= 400 && amount <= 1000) {
                            amount = 0.85 * amount;
                        } else if (amount > 1000) {
                            amount = 0.50 * amount;
                        }
                        System.out.printf("%.2f lv.",amount);
                        break;
                }
        }
    }
}


