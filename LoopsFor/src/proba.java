import java.util.Scanner;

public class proba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for ( int i = 1; i<=n; i+=2) {
        int a =i-1;
          //  a *=4;
            System.out.println(a*2*2);

        }
    }
}
//i=1   a=0     print 0
//i=3   a=2     print 2* 2x2
//i=5   a=4     print 2*2* 2x2
