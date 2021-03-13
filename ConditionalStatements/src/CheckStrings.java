import java.util.Scanner;

public class CheckStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Ivan";
        String name2 = scanner.nextLine();
        //String-ове се сравняват с equals!!!!
        //java сравнява символ по символ стринга
        //сравнява двата стринга независимо от буквите главни или не
        // System.out.println(name.equalsIgnorcases(name2));
    }
}
