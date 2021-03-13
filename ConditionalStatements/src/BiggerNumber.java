import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
//if           bankaccount>=mone
// yToget
        //else print(nqma pari)
        if(num1>num2) {
            System.out.println(num1);
        }else{
            //Ако не е изпълнено условието в If state, програмата продължава
            System.out.println(num2);
        }
        //System.out.println("Ela pak");
    }

}
