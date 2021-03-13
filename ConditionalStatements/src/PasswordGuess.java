import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* 1.входни данни стринг
        2. проверка дали паролата съвпада с : s3cr3t!P@ssw0rd
        3. принт "Welcome", ако е вярна и "Wrong password!", ако е грешна.
        */
        String pass = scanner.nextLine();

        if(pass.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong password!");
        }

    }
}
