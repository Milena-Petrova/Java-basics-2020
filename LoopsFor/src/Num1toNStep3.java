import java.util.Scanner;

public class Num1toNStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
//1 prez 3 do n
        for(int i =1; i<=n;i+=3){
            System.out.println(i);
        }
    }
}
