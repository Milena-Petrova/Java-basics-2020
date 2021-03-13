import java.sql.SQLOutput;
import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*На конзолата се въвежда:
        рекордът в секунди,  който да се подобри,
        разстоянието в метри, което трябва да се преплува
        времето в секунди, за което плува разстояние от 1 м.
•	Ако Иван е подобрил Световния рекорд отпечатваме:
o	" Yes, he succeeded! The new world record is {времето на Иван} seconds."
•	Ако НЕ е подобрил рекорда отпечатваме:
o	"No, he failed! He was {недостигащите секунди} seconds slower."
Резултатът трябва да се форматира до втория знак след десетичната запетая.

?Времето за плуване = разстоянието * времето за 1м;
?времето на Иванчо = време за плуване+време за забавяне
?време за забавяне на всеки 15м = колко пъти се забавя(разстоянието/15) * 12.5с(времето на забавянето)
закръгля се до най-близкото цяло число надолу, ползва се Math.floor функцията
?проверка, дали времето му е рекорд
         */
      double recordTime = Double.parseDouble(scanner.nextLine());//wremeto na rekorda
      double distance = Double.parseDouble(scanner.nextLine());
      double timeSwimPerMeter = Double.parseDouble(scanner.nextLine());

      double swimmingTime = distance * timeSwimPerMeter;
      double timeDelay = Math.floor(distance/15) * 12.5;/*изчисляваме времето на забавяне (на всеки 15м от разстоянието се забавя с 1.5сек)
       и закръгляме надолу до цяло число*/
      double totalTime = swimmingTime + timeDelay;

     if(totalTime<recordTime){
         System.out.printf( "Yes, he succeeded! The new world record is %.2f seconds.",totalTime );
     }else{
         double needTime = totalTime - recordTime;
         System.out.printf("No, he failed! He was %.2f seconds slower.",needTime );
     }


    }
}
