import java.util.Scanner;

public class Demonstration {
    public static void main(String[] args) {
        //Scanner, за въвеждане на променливи от конзолата
        Scanner myScanner = new Scanner(System.in);
        //тип, име, стойност
        String firstName = myScanner.nextLine();

        System.out.println(firstName);
    }
}
