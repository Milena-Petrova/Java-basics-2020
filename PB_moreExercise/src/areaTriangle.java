import java.util.Scanner;

public class areaTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double areaTrianle = base*height/2;
        System.out.printf("%.2f", areaTrianle);
    }
}