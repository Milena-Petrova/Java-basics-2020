import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Нормата за игра на Том е 30 000  минути в година(не повече, за да се е наспал добре).
        Времето за игра на Том зависи от почивните дни на стопанина му:
•	Когато е на работа, стопанинът му си играе с него по 63 минути на ден.
•	Когато почива, стопанинът му си играе с него  по 127 минути на ден.
Напишете програма, която въвежда броя почивни дни и отпечатва дали Том може да се наспи добре
и колко е разликата от нормата за текущата година, като приемем че годината има 365 дни.
ВХОД: едно число – броят почивни дни – цяло число в интервала [0...365]
ИЗХОД:
1)•	Ако времето за игра на Том е над нормата за текущата година:(тоест не се е наспал)
o	 На първия ред отпечатайте: “Tom will run away”
o	 На втория ред отпечатайте разликата от нормата във формат:
“{H} hours and {M} minutes more for play”

2)•	Ако времето за игра на Том е под нормата за текущата година:
o	На първия ред отпечатайте: “Tom sleeps well”
o	 На втория ред отпечатайте разликата от нормата във формат:
“{H} hours and {M} minutes less for play”
         */
        int offDays = Integer.parseInt(scanner.nextLine());//брой почивни дни в годината
        int workDays = 365 - offDays;//определяме колко са работните дни
        int offDayPlay = offDays * 127;//колко минути игра общо за година през почивните дни
        int workDaysplay = workDays * 63;//общо минути игра за работните дни
        int totalPlay = offDayPlay + workDaysplay;//общо време за игра

        if (totalPlay > 30000) {
            int needHoursToSleep = (totalPlay - 30000) / 60;//колко часа е над нормата
            int needMinutesToSleep = (totalPlay - 3000) % 60;//колко минути е над нормата
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", needHoursToSleep, needMinutesToSleep);
        }else{
            int moreHoursToSleep = (30000-totalPlay) / 60;//колко часа е над нормата
            int moreMinutesToSleep = (30000-totalPlay) % 60;//колко минути е над нормата
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", moreHoursToSleep,moreMinutesToSleep);
        }
    }
}

