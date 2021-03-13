import java.util.Scanner;

public class FoodForPetsExam28March {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*статистика за храната на домашните любимци за определен брой дни
         Всеки ден кучето и котката изяждат различно количество от общата им храна
         на всеки трети ден получават  - бисквитки = 10% от общо изядената храна за деня.
         ВХОД:
         •	Брой дни – цяло число в диапазона [1…30]
•	Общо количество храна – реално число в диапазона [0.00…10000.00]
След това за всеки ден се чете:
o	Количество изядена храна от кучето – цяло число в диапазона [10…500]
o	Количество изядена храна от котката – цяло число в диапазона [10…500]
ИЗХОД:
•	"Total eaten biscuits: {количество изядени бисквитки}gr."
•	"{процент изядена храна}% of the food has been eaten."
•	"{процент изядена храна от кучето}% eaten from the dog."
•	"{процент изядена храна от котката}% eaten from the cat."
Количеството изядени бисквитки трябва да бъде закръглено до най – близкото цяло число,
а процентът храна трябва да бъде форматиран до втората цифра след десетичния знак.
         */
        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        double biscuits = 0;
        double sumBiscuits = 0;
        double sumFoodEaten = 0;//сума в % количество изядена храна за всички дни
        double sumFoodDog = 0;//сума в % количество изядена храна от кучето за всички дни
        double sumFoodCat = 0;//сума в % количество изядена храна от котката за всички дни
        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());//храната, изядена от кучето за деня
            int catFood = Integer.parseInt(scanner.nextLine());//храната, изядена от котето за деня
            sumFoodDog += dogFood;
            sumFoodCat += catFood;
            if (i % 3 == 0) {//на всеки трети ден получават бисквитки
                biscuits = 0.1 * (dogFood + catFood);//бисквитките са 10% от общо извдената храна
                sumBiscuits+=biscuits;
            }
        }
        sumFoodEaten = 100*(sumFoodDog+sumFoodCat)/food;// % количество изядена общо храна

        double sumDogPercent = 100*sumFoodDog/(sumFoodCat+sumFoodDog);//% храна изяден от кучето
        double sumCatPercent = 100*sumFoodCat/(sumFoodCat+sumFoodDog);//% храна изядена от котката

        System.out.printf("Total eaten biscuits: %.0fgr.%n", (double) Math.round(sumBiscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", sumFoodEaten);
        System.out.printf("%.2f%% eaten from the dog.%n", sumDogPercent);
        System.out.printf("%.2f%% eaten from the cat.", sumCatPercent);
    }
}
