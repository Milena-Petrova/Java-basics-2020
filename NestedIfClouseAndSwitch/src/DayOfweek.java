import java.util.Scanner;

public class DayOfweek {
    public static void main(String[] args) {
        //day of week
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = Integer.parseInt(scanner.nextLine());
        // в зависимост от стойността на променливата->различен резултат,
        // изпълнява се различен код
        // вс лучай, че променливата е равна на 1, изпълняваме този код
        switch (dayOfWeek) {
            case 1: //изпълнява се този код, ако dyOfweek e равна на 1
                System.out.println("Monday");
//пише се кода, както в if clouse
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                //край на execute-a
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
                break;
        }
        }

    }

