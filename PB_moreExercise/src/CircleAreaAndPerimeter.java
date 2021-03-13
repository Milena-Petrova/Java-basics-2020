import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //вход-радиус реално число, изход <calculated area>, <calculated parameter> до втори знак след запетаята
        //S=pi*r*r; P=2*pi*r  pi=3.14....Math.PI

        double radius = Double.parseDouble(scanner.nextLine());

        double area = radius*radius*Math.PI;
        double parameter = 2*radius*Math.PI;
        System.out.printf("%.2f%n%.2f",area, parameter);
    }
}
