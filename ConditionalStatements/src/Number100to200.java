import java.util.Scanner;

public class Number100to200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        /*входни данни : цяло число
        проверки:
        1. число <100;
        2. 100<число<200;
        3. 200<число
         */
        if (number<100){
            System.out.println("Less than 100");
        }else if(number>=100&number<=200){
            System.out.println("Between 100 and 200");
        }else if(number>200){
            System.out.println("Greater than 200");
        }
    }
}
