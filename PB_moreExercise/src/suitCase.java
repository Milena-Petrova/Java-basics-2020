import java.util.Scanner;

public class suitCase {
    public static void main(String[] args) {
        /*има определен капацитет на багажника. До получаване на команда "End" ще получавате обем на куфар.
        Обемът на всеки трети куфар трябва да се увеличава с 10%, поради загубата на пространство при начина на подреждане.
         Ако свободното пространството в даден момент е по-малко от обема на куфар товаренето трябва да прекъсне.
       Вход
•	Капацитетът на багажника – реално число в диапазона [100.0…6000.0]
След това до получаване на команда "End" или до запълване на багажника, се чете по един ред:
o	Обем на куфар – реално число в диапазона [100.0…6000.0]
Изход
•	При получаване на командата "End" се печата:
"Congratulations! All suitcases are loaded!"
•	Ако обемът на куфара е по-голям от оставащото пространство в багажника:
"No more space!"
•	Накрая винаги се отпечатва статистика – колко багажа са натоварени:
"Statistic: {брой натоварени багажи} suitcases loaded."*/

        Scanner scanner = new Scanner(System.in);
        double volume = Double.parseDouble(scanner.nextLine());//обем/капацитет на багажник
        String command = scanner.nextLine();

        int count = 0;
        boolean isFull = false;
        while (!command.equals("End")) {
            double suit = Double.parseDouble(command);

            if (volume < suit) {
                isFull = true;
                break;
            }
            if (volume >= suit) {
                count++;
                if (count % 3 == 0) {
                    suit = Math.round(1.1 * suit*10.0)/10.0;
                    volume-=suit;
                    volume=Math.round(volume*10.0)/10.0;
                }else {
                    volume -= suit;
                }
                if(volume<0){
                    isFull=true;
                    count--;
                    break;
                }
                if(volume==0){
                    isFull=true;
                    break;
                }
                command = scanner.nextLine();
            }
        }
        if (isFull) {
            System.out.println("No more space!");
            System.out.printf("Statistic: %d suitcases loaded.", count);
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.", count);
        }
    }
}

