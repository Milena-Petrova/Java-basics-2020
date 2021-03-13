import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Бюджет -> дестинация; сезон -> колко % от бюджета харчи:
        лято -> определен % от парите за къмпинг в БГ или Балканите
        зима ->определен % за хотел в БГ, Балканите, Европа
        лято -> според бюджета % за хотел в Европа
        при бюджет до 100лв -> почивка в БГ, лято 30% от бюджета(къмпинг), 70% от бюджета на хотел
        при бюджет между 100 и 1000лв -> почивка на Балканите, 40% лято на къмпинг, 80% за хотел зима
        при над 1000 лв-> почивка в Европа, независимо от сезона в хотел 90% от бюджета
        ВХОД: Бюджет, реално число [10...5000.00]; Сезон: "summer" or "winter"

        ИЗХОД: •	Първи ред – "Somewhere in [дестинация]“ измежду "Bulgaria", "Balkans" и "Europe"
•	Втори ред – "{Вид почивка} – {Похарчена сума}"
o	Почивката може да е между "Camp" и "Hotel"
o	Сумата трябва да е закръглена с точност до вторият знак след запетаята.

         */

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination1 = "Bulgaria";
        String destination2 = "Balkans";
        String destination3 = "Europe";
        String place1 = "Camp";
        String place2 = "Hotel";
        double camp = 0;

        if(budget>1000){
            camp = 0.90*budget;
            System.out.printf("Somewhere in %s%n%s - %.2f", destination3,place2,camp);
        }
        switch (season) {
            case "summer":
                if (budget <= 100) {
                    camp = 0.30 * budget;//30% ot бюджета за къмпинг
                    System.out.printf("Somewhere in %s%n%s - %.2f", destination1,place1,camp);//%n се ползва за нов ред
                }else if(budget>100 && budget<=1000 ){
                    camp = 0.40*budget;
                    System.out.printf("Somewhere in %s%n%s - %.2f", destination2,place1,camp);
                }
                break;
            case "winter":
                if (budget <= 100) {
                    camp = 0.70 * budget;//70% ot бюджета за hotel
                    System.out.printf("Somewhere in %s%n%s - %.2f", destination1,place2,camp);//%n се ползва за нов ред
                }else if(budget>100 && budget<=1000 ){
                    camp = 0.80*budget;
                    System.out.printf("Somewhere in %s%n%s - %.2f", destination2,place2,camp);
                }
                break;
        }
    }
}