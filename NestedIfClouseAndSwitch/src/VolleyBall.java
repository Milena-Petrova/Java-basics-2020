import java.util.Scanner;

public class VolleyBall {
    public static void main(String[] args) {
        /*Влади играе волейбол само през уикендите и в празничните дни.
        Влади играе в София всяка събота, когато не е на работа и не си пътува до родния град, както и в 2/3 от празничните дни
        Пътува h пъти в годината и играе в неделите там
        Влади не е на работа 3/4 от уикендите в София
        Годината има точно 48 уикенда
        През високосните години Влади играе с 15% повече волейбол от нормалното.
ВХОД:•
    Първият ред съдържа думата "leap" (високосна година) или "normal" (невисокосна).
•	Вторият ред съдържа цялото число p – брой празници в годината (които не са събота и неделя).
•	Третият ред съдържа цялото число h – брой уикенди, в които Влади си пътува до родния град.

ИЗХОД:Колко пъти Влади е играл волейбол през годината.
Закръглете резултата надолу до най-близкото цяло число (например 2.15  2; 9.95  9).         */
        Scanner scanner= new Scanner(System.in);

        String year = scanner.nextLine();//високосна или не година
        int holiday= Integer.parseInt(scanner.nextLine());//празнични дни в годината
        int weekendsOut = Integer.parseInt(scanner.nextLine());//уикенди в родния град

        double volleyballGame = 0;
        double holidays = 1.0*holiday;
        double countryWeekend = 1.0*weekendsOut;

        if(year.equals("normal")){
            // брой игри в София( в свободните уикенди+празници) + игрите извън София
            volleyballGame = (48-countryWeekend)*3/4+holidays*2/3 + countryWeekend;
            double numberVolleyGames = Math.floor(volleyballGame);
            System.out.printf("%.0f",numberVolleyGames);
        }
        if(year.equals("leap")){
            volleyballGame = ((48-countryWeekend)*3/4+holidays*2/3 + countryWeekend) ;////брой игри
            volleyballGame = volleyballGame + 0.15*volleyballGame;//с 15% повече pri wisokosna
            double numberVolleyGames = Math.floor(volleyballGame);
            System.out.printf("%.0f",numberVolleyGames);
        }

            }
}
