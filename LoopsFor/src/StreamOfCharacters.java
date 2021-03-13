import java.util.Scanner;

public class StreamOfCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
// започва от 0 цикъла, защото първата позиция по метода charAt започва от 0,1,2...

        for (int i = 1; i <=input.length(); i++) {
            int a = i-1;//по-добре да не е 0 началния брояч
            System.out.println(input.charAt(a));
        }
    }
}

