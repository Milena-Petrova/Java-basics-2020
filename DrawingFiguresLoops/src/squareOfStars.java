import java.util.Scanner;

public class squareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i= 1; i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(j%2==1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}