import java.util.Scanner;

public class housePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // 1.	x – височината на къщата – реално число в интервала [2...100]
       // 2.	y – дължината на страничната стена – реално число в интервала [2...100]
       // 3.	h – височината на триъгълната стена на прокрива – реално число в интервала [2...100]
        double X = Double.parseDouble(scanner.nextLine());
        double Y = Double.parseDouble(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());
        //зелено - 2br. стени X*Y, 2br.X*X;
        //покрив - червен, 2бр. триъгълни чела X*H/2; 2бр. правоъгълни скатове 2br. X*Y
        // врата - минус 1.5*2 м; квадратни прозорци 2бр. - минус 1.5*1.5*/
         double a = 1.5;//страна на прозорец и врата
         double b = 2;//страна на врата
        double c = 1.2;//стран на врата
        double empty1 = 2*a*a;//прозорци
        double empty2 = b*c;//врата
        double АreaRect = X*Y;//правоъгълна стена
        double AreaSquare = X*X;//кадратна стена
        double AreaGreen = АreaRect*2 + AreaSquare*2 - empty1 - empty2;
        //околна повърхнина  минус врати и прозорци
        double areaRoof = X*H + 2 * X * Y;//площ на покрива
        double consumptionGreen = AreaGreen/3.4;//1литър боя е за 3.4 кв.м
        double consumtionRed = areaRoof/4.3;// 1л червена е за 4.3кв.м
        System.out.printf("%.2f%n", consumptionGreen);
        System.out.printf("%.2f%n", consumtionRed);

    }
}
