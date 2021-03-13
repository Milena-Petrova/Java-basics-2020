import java.util.Scanner;

public class CatWalkingExam28Mart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesPerWalking = Integer.parseInt(scanner.nextLine());//време на 1 разходка
        int numberOfWalkingsPerDay = Integer.parseInt(scanner.nextLine());//брой разходки на ден
        int eatCalPerday = Integer.parseInt(scanner.nextLine());//днвно приети калории
        /*•	Ако изгорените калории през разходката са повече или равни на  50% от приетите през деня калории:
"Yes, the walk for your cat is enough. Burned calories per day: {общо изгорени калории от разходката}."
•	Ако  изгорените калории през разходката са по-малко от 50% от приетите през деня калории:
 "No, the walk for your cat is not enough. Burned calories per day: {общо изгорени калории от разходката}."
 1. spentCalPer1walking = minutesPerWalking * 5cal per min
 2. spentCalPerDay = калории за 1 разходка * броя разходки на ден
 */
        int spentCalPer1walking = minutesPerWalking * 5;
        int spentCalperDay  = spentCalPer1walking * numberOfWalkingsPerDay;
        if(spentCalperDay >= eatCalPerday*0.5){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", spentCalperDay);
        }else{
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",spentCalperDay);
        }

    }
}
