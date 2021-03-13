import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        /*Определен час. Той идва в изпитната зала в даден час на пристигане.
 Ако часа на пристигане е до 30мин вкл.преди или в часа на изпита или до половин час преди това->НАВРЕМЕ
 Ако е повече от 30мин преди часа на изпита -> ПОДРАНИЛ.
 Ако е след часа на изпита-> ЗАКЪСНЯЛ
  Напишете програма, която прочита време на изпит и време на пристигане и отпечатва дали студентът е дошъл навреме,
  дали е подранил или е закъснял и с колко часа или минути е подранил или закъснял.

Вход
От конзолата се четат 4 цели числа (по едно на ред), въведени от потребителя:
•	Първият ред съдържа час на изпита – цяло число от 0 до 23.
•	Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
•	Третият ред съдържа час на пристигане – цяло число от 0 до 23.
•	Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59.
Изход
На първият ред отпечатайте:
•	“Late”, ако студентът пристига по-късно от часа на изпита.
•	“On time”, ако студентът пристига точно в часа на изпита или до 30 минути по-рано.
•	“Early”, ако студентът пристига повече от 30 минути преди часа на изпита.
Ако студентът пристига с поне минута разлика от часа на изпита, отпечатайте на следващия ред:
•	“mm minutes before the start” за идване по-рано с по-малко от час.
•	“hh:mm hours before the start” за подраняване с 1 час или повече. Минутите винаги печатайте с 2 цифри, например “1:05”.
•	 “mm minutes after the start” за закъснение под час.
•	“hh:mm hours after the start” за закъснение от 1 час или повече. Минутите винаги печатайте с 2 цифри, например “1:03”.
*/
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());//hour 0 - 23
        int examMinutes = Integer.parseInt(scanner.nextLine());//minutes 0-59
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());
        //1. Ако часа на пристигане и минутите са = часа на изпита+минутите на изпита ->навреме
        //2. Ако часа на пристигане = часа на изпита и минутите са по-малко от минутите на изпита-максимус с 30->навреме
        // Ако часа на пристигане е 30 повече от часа на изпита ->подранил
        //3. Ако часа на пристигане = часа на изпита,но минутите на пристигане >от мин. на изпита -> закъснение
        //4. Ако часа на пристигане е > часа на изпита, независимо от минутите - >закъснение
        //5. Ако е подранил с под 1 час ->“mm minutes before the start”
        //6. Ако е подранил с над 1 час ->“hh:mm hours before the start”
        //7. Ако закъснението е под 1 час ->“mm minutes after the start”
        //8. Ако е закъснял с над 1 час ->“hh:mm hours after the start”

        int examHourTominutes = examHour * 60;//convert in minutes
        int arriveHourToMinutes = arriveHour * 60;//convert in minutes
        int examMin = examHourTominutes + examMinutes;//часа на изпита в минути
        int arriveMin = arriveHourToMinutes + arriveMinutes;//часа на пристигане в минути
        int deltaOnTime = examMin - arriveMin;//разлика в минути , в случай навреме
        int deltaDelay = arriveMin - examMin;//разлика в минути при закъснение
        //
        if (examMin == arriveMin && deltaOnTime==0)  {
            System.out.println("On time");
        }else if(deltaOnTime <= 30&&deltaOnTime >= 0){
            System.out.println("On time");
            System.out.printf("%d minutes before the start", deltaOnTime);
        }
        if (deltaOnTime > 30&&deltaOnTime<60) {
            System.out.println("Early");
            System.out.printf("%d minutes before the start", deltaOnTime);
        }
        if(deltaOnTime>=60){
            int deltaMinute = deltaOnTime/60;//hours earlier
            int deltaHour = deltaOnTime%60;//minutes earlier
            System.out.println("Early");
            System.out.printf("%d:%02d hours before the start", deltaMinute,deltaHour);
        }
        if (deltaDelay < 60&&deltaDelay>0) {//тоест времето, в което пристигаме е по-голямо от времето на изпита

            System.out.println("Late");
            System.out.printf("%d minutes after the start", deltaDelay);
        }
        else if(deltaDelay>=60) {
            int deltaMinutes = deltaDelay % 60;// минутите закъснение над 1 час
            int deltaHour = deltaDelay/60;//часове закъснение
            System.out.println("Late");
            System.out.printf("%d:%02d hours after the start", deltaHour, deltaMinutes);

        }

    }
}


