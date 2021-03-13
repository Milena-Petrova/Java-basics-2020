import java.util.Scanner;

public class MountainRunExam28Mart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());//рекорд, който трябва да подобри, в секунди
        double distance = Double.parseDouble(scanner.nextLine());//разстояние в метри, което се изкачва
        double timePerMeter = Double.parseDouble(scanner.nextLine());// време за катерене на 1 метър в секунди
        /*. Да се напише програма, която изчислява дали се е справил със задачата, като се има предвид, че: наклона наразстоянието/ терена го забавя
         на всеки 50 м. с 30 секунди.
        Да се изчисли времето в секунди, за което Георги ще изкачи разстоянието до върха и разликата спрямо рекорда.
Когато се изчислява колко пъти Георги ще се забави в резултат на наклона на терена,
резултатът трябва да се закръгли надолу до най-близкото цяло число.
        •	Ако Георги е подобрил рекорда отпечатваме:
o	" Yes! The new record is {времето на Георги} seconds."
•	Ако НЕ е подобрил рекорда отпечатваме:
o	"No! He was {недостигащите секунди} seconds slower."
Резултатът трябва да се форматира до втория знак след десетичната запетая.
*/
        double time = distance * timePerMeter;//времето на катерене бе забавянето
        //разстоянието/50 = N пъти се забавя с по 30 секунди;
        //времето общо = времето без забавяне + N * 30;
        double delay = Math.floor(distance / 50);
        double totalTime = time + delay*30;
        if (totalTime < record) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        }else{
            double needTime = totalTime-record;
            System.out.printf("No! He was %.2f seconds slower.", needTime);
        }
    }
}
