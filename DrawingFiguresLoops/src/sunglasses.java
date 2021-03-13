import java.util.Scanner;

public class sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int j = 1; j <= 2 * n; j++) {//3 цикъла за първия ред
            System.out.print("*");
        }
        for (int j = 1; j <= n; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= 2 * n; j++) {
            System.out.print("*");
        }
        System.out.println();
//цикъл за средните редове
        for(int i = 1;i<=n-2;i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j == 1 || j == 2 * n) {
                    System.out.print("*");
                } else {
                    System.out.print("/");
                }
            }
            if(i==(n-1)/2){
                for (int j = 1; j <= n; j++) {
                    System.out.print("|");
                }
            }else { for (int j = 1; j <= n; j++) {
                System.out.print(" ");
            }
            }
            for (int j = 1; j <= 2 * n; j++) {
                if (j == 1 || j == 2 * n) {
                    System.out.print("*");
                } else {
                    System.out.print("/");
                }
            }
            System.out.println();
        }
        //цикъл за последния ред
        for(int j=1; j<=2*n;j++){
            System.out.print("*");
        }
        for(int j = 1; j<=n;j++){
            System.out.print(" ");
        }
        for(int j=1; j<=2*n;j++){
            System.out.print("*");
        }
    }
}


