import java.util.Scanner;

public class NumFromNto1 {
    public static void main(String[] args) {
        //вход n
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //принт от n->1
        //5 4 3 2 1
        for(int i=n;i>=1;i--)
            System.out.println(i);
    }

}
