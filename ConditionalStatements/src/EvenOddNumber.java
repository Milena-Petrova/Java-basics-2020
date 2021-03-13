import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        //ако числото е четно принтираме четно
// иначе
        if(number % 2 == 0) {
            System.out.println("even");
        }else{
            //Ако не е изпълнено условието в If state, програмата продължава
            System.out.println("odd");
        }

    }
}
