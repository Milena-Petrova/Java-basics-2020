import java.util.Scanner;

public class WeatherForcastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*според въведениет градуси, отпечатва какво е времето:
        26.00 - 35.00	Hot
        20.1 - 25.9	    Warm
        15.00 - 20.00	Mild
        12.00 - 14.9	Cool
        5.00 - 11.9	   Cold
различни от посочените в таблицата, да се отпечата "unknown".
         */
        double degree = Double.parseDouble(scanner.nextLine());
        if(degree>=26.00&&degree<=35.00) {
            System.out.println("Hot");
        } else if(degree>=20.10&&degree<=25.9){
            System.out.println("Warm");
        }else if(degree>=15.00&&degree<=20.00) {
            System.out.println("Mild");
        }else if(degree>=12.00&&degree<=14.9){
            System.out.println("Cool");
        }else if(degree>=5.00&&degree<=11.9){
            System.out.println("Cold");
        }else{
            System.out.println("unknown");
        }
    }
}

