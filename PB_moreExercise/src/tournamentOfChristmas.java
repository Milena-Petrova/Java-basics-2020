import java.util.Scanner;

public class tournamentOfChristmas {
   /* Всеки ден получавате имена на игри до команда "Finish". Със спечелването на всяка една игра печелите по 20лв.
   Трябва да изчислите колко пари сте спечелили на края на деня. Ако спечелени игри > загубените –>победител за
    този ден и увеличавате парите от него с 10%. При приключване на турнира ако през повечето дни сте били победители
    печелите турнира и увеличавате всичките спечелени пари с 20%.
   Никога няма да имате равен брой спечелени и загубени игри.
Вход
Първоначално от конзолата се прочита броя дни на турнира – цяло число в интервала [1… 20]
До получаване на командата "Finish" се чете:
•	Спорт  – текст
За всеки спорт се прочита:
o	Резултат  – текст с възможности: "win" или "lose"*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.next());
        double sumTournament = 0;
        int countDayWin = 0;
        int countDayLose = 0;
        for (int i = 1; i <= days; i++) {
            String sport = scanner.next();
            double daySum = 0;
            int countWin = 0;
            int countLose = 0;
            while (!sport.equals("Finish")) {
                String result = scanner.next();
                switch (result) {
                    case "win":
                        countWin++;
                        break;
                    case "lose":
                        countLose++;
                        break;
                }
                sport = scanner.next();
            }
            if (countLose > countWin) {
                daySum = countWin * 20;
                countDayLose++;
            } else {
                daySum = countWin * 20 * 1.1;
                countDayWin++;
            }
            sumTournament += daySum;

        }
        if (countDayWin > countDayLose) {
            System.out.printf("You won the tournament! Total raised money: %.2f", 1.2 * sumTournament);
        } else if(countDayLose>countDayWin){
            System.out.printf("You lost the tournament! Total raised money: %.2f", sumTournament);
        }
    }
}
