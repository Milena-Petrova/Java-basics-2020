import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double area = 0;
         /*от конзолата четем,вида на фигурата и
        според вида се въвеждат входните данни, ако е квадрат->страна,
        ако е правоъгълник->двете страни, ако е триъгълник->дължина на страна и височина,
        ако е кръг->едно число радус;
        Изход: число , закръглено до 3 цифри след десетичната точка
         */
        if (shape.equals("square")) {
            double squareSide = Double.parseDouble(scanner.nextLine());
            area = squareSide * squareSide;
            //System.out.printf("%.3f", area);
        } else if (shape.equals("rectangle")) {
            double rectangleSide1 = Double.parseDouble(scanner.nextLine());
            double rectangleSide2 = Double.parseDouble(scanner.nextLine());
            area = rectangleSide1 * rectangleSide2;
            //System.out.printf("%.3f", area);
        } else if (shape.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = radius * radius * Math.PI;
          //  System.out.printf("%.3f", area);
        } else if (shape.equals("triangle")) {
            double triangleSide = Double.parseDouble(scanner.nextLine());
            double heihgtOtriangle = Double.parseDouble(scanner.nextLine());
            area = heihgtOtriangle * triangleSide / 2;
            //System.out.printf("%.3f", area);
        }
        System.out.printf("%.3f", area);//вместо да пишем на всяко условие, изнасяме накрая, но си дефинираме променливата за площ най-отгоре
    }
}
