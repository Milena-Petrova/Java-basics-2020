import java.util.Scanner;

public class firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Фирма получава заявка за изработването на проект, за който са необходими определен брой часове.
 10% от дните служителите са на обучение и не работят по проекта.
 1 работен ден е 8 часа. Всеки служител може да работи по проекта в извънработно време по 2 часа на ден.
Часовете трябва да са закръглени към по-ниско цяло число (Например –> 6.98 часа се закръглят на 6 часа).
Напишете програма, която изчислява дали фирмата може да завърши проекта навреме и колко часа не достигат или остават.
ВХОД:
•	На първия ред са необходимите часовете – цяло число в интервала [0 ... 200 000]
•	На втория ред са дните, с които фирмата разполага – цяло число в интервала [0 ... 20 000]
•	На третия ред е броят на служителите, работещи извънредно – цяло число в интервала [0 ... 200]
Изход
Да се отпечата на конзолата един ред:
•	Ако времето е достатъчно:
o	“Yes!{оставащите часове} hours left.”
•	Ако  времето НЕ Е достатъчно:
o	“Not enough time!{недостигащите часове} hours needed.“

*/
        int needTime = Integer.parseInt(scanner.nextLine());
        int availableDays = Integer.parseInt(scanner.nextLine());
        int overTimeEmployees = Integer.parseInt(scanner.nextLine());
        //10% от времето е за обучение -> не се работи = 0.10*availableDays*8, превърнато в часове
        //overTimeemployees*2*availableDays -> брой извънредни часове на някои служители  за всички дни


        double workTime = Math.floor(0.90 * availableDays * 8);
        double overtime = Math.floor(overTimeEmployees * 2 * availableDays);
        double time = workTime + overtime;
        if (time >= needTime) {
            double leftHours = time-needTime;
            System.out.printf("Yes!%.0f hours left.", leftHours);
        } else {
            double needHours = needTime - time;
            System.out.printf("Not enough time!%.0f hours needed.", needHours);
        }
    }
}