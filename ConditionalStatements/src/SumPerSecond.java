import java.util.Scanner;

public class SumPerSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. прочитаме времената и съхраним в променливи
        //2. общо време в секунди = в1 + в2 +в3
        //3. общо време в сек -> мин. и сек
        //4. принтираме с водеща нула мапример 124сек са 2.04мин(ако сек<10 -> 0
        Integer firstLine = Integer.parseInt(scanner.nextLine());
        Integer secondLine = Integer.parseInt(scanner.nextLine());
        Integer thirdLine = Integer.parseInt(scanner.nextLine());

        int totalTimeSeconds = firstLine + secondLine + thirdLine;//t.2
        int timeInMinutes = totalTimeSeconds /60; //sec -> minutes
        int timeInSeconds = totalTimeSeconds % 60; //остатъка в секунди

        //1. сек<10
        //2. сек.>=10
        if (timeInSeconds < 10){
            // minutes: 0sec
            //System.out.println(timeInMinutes + ":0" + timeInSeconds);
            System. out.printf("%d:0%d", timeInMinutes, timeInSeconds);
        }else{
            //System.out.println(timeInMinutes + ":" + timeInSeconds);
           System.out.printf("%d:%d", timeInMinutes,timeInSeconds);
        }


    }
}
