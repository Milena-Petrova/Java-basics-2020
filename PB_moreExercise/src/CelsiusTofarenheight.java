import java.util.Scanner;

public class CelsiusTofarenheight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = Double.parseDouble(scanner.nextLine());
        //℃ =(℉) - 32 )/1.8000 ,формула за преобразуване на C -> F;
        double farenheght = celsius*1.8000 + 32;
        System.out.printf("%.2f", farenheght);
    }
}
