import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //вход
        //1.число , например N
        //2. следващите два реда се въвеждат N числа и се събират
    int n = Integer.parseInt(scanner.nextLine());
    int sum =0;
    //въвеждаме Хбр числа и повтарящо се въвеждаме
        for(int i=1;i<=n;i++){//започва от 1 в случая, защото искаме да изпълним определн брой пъти(въвеждаме числата)
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum+=currentNumber;
        }
        System.out.println(sum);
    }

}
