import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        /*Габи си е поставила за цел да върви 10 000 стъпки всеки ден.
         Някои дни обаче е много уморена от работа и ще иска да се прибере преди да постигне целта си.
         Напишете програма, която чете от конзолата по колко стъпки изминава тя всеки път като излиза през деня и когато постигне целта си да се изписва
          "Goal reached! Good job!"  и колко стъпки повече е извървяла "{разликата между стъпките} steps over the goal!".

Ако иска да се прибере преди това, тя ще въведе командата "Going home" и ще въведе стъпките, които е извървяла докато се прибира. След което, ако не е успяла да постигне целта си, на конзолата трябва да се изпише: "{разликата между стъпките} more steps to reach goal."
*/
        Scanner scanner = new Scanner(System.in);
        //стоп: ако стъпките са>=10000 или команда == going home
        // команда-> going home или число(бр.стъпки)
        String command = scanner.nextLine();
        int totalSteps = 0;
        while (!command.equals("Going home")) {
            //командата е число-> трябва от стринг да стане число, парсваме
            int steps = Integer.parseInt(command);
            //сумираме стъпките и после проверяваме дали сме постигнали целта
            totalSteps += steps;
            if (totalSteps >= 10000) {
                               break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Going home")) {
            // int stepsToHome
            int stepsToHome = Integer.parseInt(scanner.nextLine());//ако командата е going home-> команда колко стъпки вървим до вкъщи
            totalSteps += stepsToHome;//общия брой стъпки включва и тези до вкъщи
        }

            if (totalSteps >= 10000) {
                System.out.println("Goal reached! Good job!");
                int moreSteps = totalSteps - 10000;
                System.out.printf("%d steps over the goal!", moreSteps);
            } else {
                int diff = 10000-totalSteps;
                System.out.printf("%d more steps to reach goal.",diff);
            }
        }
    }





