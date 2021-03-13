import java.util.Scanner;

public class TimePlusMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // при задачи с време е хубаво да се работи в една мерна единица, или в минути, или в секунди и т.н.
        int startHour = Integer.parseInt(scanner.nextLine());
        int startMinutes = Integer.parseInt(scanner.nextLine());
        //1. Преобразуваме времето в минути, * 60
        //2. Добавяме 15мин.
        //3. Преобразуваме в часове и минути

        int startTimeMinutes = startHour * 60 + startMinutes;
        int timeAfter15Minutes = startTimeMinutes + 15; // vreme v min sled 15min
        int finalHour = timeAfter15Minutes/60;
        int finalMinutes = timeAfter15Minutes%60;

        //час:минути
       if (finalHour==24){
           finalHour=0;
       }
        System.out.printf("%d:%02d", finalHour, finalMinutes);//%02d печата 1 минута като 01, тоест с два знака
    }
}
