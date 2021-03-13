import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* Басейн с обем V има две тръби
        Tръбите се пускат едновременно за N часа.
        Напишете програма, която изкарва състоянието на басейна, в момента на пускане и след N часа.
        ВХОД:
        •	Първият ред съдържа числото V – Обем на басейна в литри – цяло число в интервала [1…10000].
•	Вторият ред съдържа числото P1 – дебит на първата тръба за час – цяло число в интервала [1…5000].
•	Третият ред съдържа числото P2 – дебит на втората тръба за час– цяло число в интервала [1…5000].
•	Четвъртият ред съдържа числото H – часовете които работникът отсъства – реално число в интервала [1.0…24.00]
ИЗХОД - две възможности:
!)The pool is {запълненост на басейна в проценти}% full.
Pipe 1: {процент вода от първата тръба}%. Pipe 2: {процент вода от втората тръба}%."
2)Aко басейнът се е препълнил – с колко литра е прелял за даденото време.
o	"For {часовете, които тръбите са пълнили вода} hours the pool overflows with {литрите вода в повече} liters."
        */
        int volume = Integer.parseInt(scanner.nextLine());//обем на басейна
        int debitFirstPipe = Integer.parseInt(scanner.nextLine());//дебит на първа тръба литри/час
        int debitSecondPipe = Integer.parseInt(scanner.nextLine());//дебит на втората тръба
        double hours = Double.parseDouble(scanner.nextLine());//часове/време , в които се пълни басейна

        double firstPipeVolume = debitFirstPipe * hours;//количество напълнено от първата тръба
        double secondPipeVolume = debitSecondPipe * hours;//количество напълнено от 2-та тръба
        //обемът на басейна е 100%; а % обемът от всяка тръба е (количеството/общото напълнено колиество)*100
        double poolLevel = firstPipeVolume + secondPipeVolume;//обема запълнен с вода за дадените часове

        if(poolLevel<=volume){
            double percentFirstPipe = 100*firstPipeVolume/poolLevel;//колко % е допринесла 1-та тръба
            double percentSecondPipe = 100*secondPipeVolume/poolLevel;//колко % е допринесла втората тръба
            double percentTotalLevel = 100*poolLevel/volume;//колко % от обема е запълнен
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",percentTotalLevel,percentFirstPipe,percentSecondPipe);
        }else {
            double overflow = poolLevel - volume*1.0;//литри преляла вода
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",hours,overflow);
        }
    }
}
