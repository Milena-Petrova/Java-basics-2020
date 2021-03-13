import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*От лозе с площ X квадратни метри се заделя 40% от реколтата за производство на вино.
         От 1 кв.м лозе се изкарват Y килограма грозде.
         За 1 литър вино са нужни 2,5 кг. грозде. Желаното количество вино за продан е Z литра.
         Напишете програма, която пресмята колко вино може да се произведе и дали това количество е достатъчно.
          Ако е достатъчно, остатъкът се разделя по равно между работниците на лозето.
Вход
•	1ви ред: X кв.м е лозето – цяло число в интервала [10 … 5000]
•	2ри ред: Y грозде за един кв.м – реално число в интервала [0.00 … 10.00]-добива
•	3ти ред: Z нужни литри вино – цяло число в интервала [10 … 600]-таргет за вино
•	4ти ред: брой работници – цяло число в интервала [1 … 20]
Изход
1)	Ако произведеното вино е по-малко от нужното:
o	“It will be a tough winter! More {недостигащо вино} liters wine needed.”
	Резултатът трябва да е закръглен към по-ниско цяло число
2)	Ако произведеното вино е повече от нужното:
o	“Good harvest this year! Total wine: {общо вино} liters.”
	Резултатът трябва да е закръглен към по-ниско цяло число
2.1)	“{Оставащо вино} liters left -> {вино за 1 работник} liters per person.”
	И двата резултата трябва да са закръглени към по-високото цяло число
         */
        int harvestArea = Integer.parseInt(scanner.nextLine());//площ на лозето X
        double productionPerMeter = Double.parseDouble(scanner.nextLine());//добив грозде в кг от кв.м.Y
        int Wine = Integer.parseInt(scanner.nextLine());//вино, което трябва да се произведе Z
        int numberOfWorkers = Integer.parseInt(scanner.nextLine());//брой работници N

        double grape = harvestArea * productionPerMeter;
        double wineGrape = 0.4*grape;
        double producedWine = wineGrape/2.5;
        if(producedWine<Wine) {
            double needWine = Wine - producedWine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(needWine));
        }else{
            double wineLeft = producedWine - Wine;
            double winePerPerson = wineLeft/numberOfWorkers;
          System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",Math.floor(producedWine));//%n -> за нов ред на принта
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(wineLeft),Math.ceil(winePerPerson));
        }

    }
}
