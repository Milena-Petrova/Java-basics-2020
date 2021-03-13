import java.util.Scanner;

public class TrekkingMania {
    /*
•	Група до 5 човека– Мусала
•	Група от 6 до 12 – Монблан
•	Група от 13 до 25 – Килиманджаро
•	Група от 26 до 40 – К2
•	Група от 41 или повече – Еверест
Да се напише програма, която изчислява процента на катерачите изкачващи всеки връх.
Вход
•	На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
•	За всяка една група на отделен ред – броя на хората в групата – цяло число в интервала [1...1000]
Изход
Да се отпечатат на конзолата 5 реда, всеки от които съдържа процент между 0.00% и 100.00% с точност до втората цифра
 след десетичната запетая.
 •	Първи ред - процентът изкачващи Мусала
•	Втори ред – процентът изкачващи Монблан
•	Трети ред – процентът изкачващи Килиманджаро
•	Четвърти ред – процентът изкачващи К2
•	Пети ред – процентът изкачващи Еверест*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());//брой групи
        int sumAll = 0;//брой на всички катерачи
        int sumMusala=0;
        int sumMonblan=0;
        int sumKilimandzaro=0;
        int sumk2=0;
        int sumEverest=0;

        for (int i = 1; i <= groups; i++) {//въвеждаме брой хора във всяка група
            int numberOfPeople = Integer.parseInt(scanner.nextLine());
            sumAll += numberOfPeople;//всички участници
       //     double percentOfGroup = 1.0*numberOfPeople/sumAll*100;
            if (numberOfPeople<=5){
               sumMusala +=numberOfPeople;
               }
            if (numberOfPeople>5&&numberOfPeople<=12){
                sumMonblan+=numberOfPeople;
            }
            if(numberOfPeople>12&&numberOfPeople<=25){
                sumKilimandzaro+=numberOfPeople;
            }
            if (numberOfPeople>25&&numberOfPeople<=40){
                sumk2+=numberOfPeople;
            }else if(numberOfPeople>40){
                sumEverest+=numberOfPeople;
            }
        }
        double percentMusala = 1.0 * sumMusala/sumAll*100;
        System.out.printf("%.2f%%%n",percentMusala);
        double percentMonblan = 1.0*sumMonblan/sumAll*100;
        System.out.printf("%.2f%%%n",percentMonblan);
        double percentKilimandzaro = 1.0*sumKilimandzaro/sumAll*100;
        System.out.printf("%.2f%%%n",percentKilimandzaro);
        double percentK2 = 1.0*sumk2/sumAll*100;
        System.out.printf("%.2f%%%n",percentK2);
        double percentEverest = 1.0*sumEverest/sumAll*100;
        System.out.printf("%.2f%%%n",percentEverest);

    }

}

