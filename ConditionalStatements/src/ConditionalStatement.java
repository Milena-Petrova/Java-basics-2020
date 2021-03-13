import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bankAccount = 150;
        int moneyToGet = Integer.parseInt(scanner.nextLine());
//if           bankaccount>=moneyToget
        //else print(nqma pari)
        if(bankAccount>=moneyToGet) {
            System.out.println(moneyToGet);
        }else{
            //Ако не е изпълнено условието в If state, програмата продължава
            System.out.println("Нямаш пари");
        }
        //System.out.println("Ela pak");
    }

}

