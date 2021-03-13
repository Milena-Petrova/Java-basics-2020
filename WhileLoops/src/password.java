import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        /*Напишете програма, която първоначално прочита име и парола на потребителски профил.
        След това чете парола за вход, при въвеждане на грешна парола, потребителя да се подкани да въведе нова парола.
         */
        //регистрация, четем user i pass
        String username = scanner.nextLine();
        String password = scanner.nextLine();//първо въвеждане на парола
        String currentTry = scanner.nextLine();
        //input while pass!=password
        while(!currentTry.equals(password)){
            currentTry = scanner.nextLine();
        }
        System.out.printf("Welcome %s!",username);
    }
}
