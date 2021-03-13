import java.util.Scanner;

public class exerciseIncrementDecrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 1;
        int num2 = 2;
        System.out.println(num2--);//2(1)
        System.out.println(num2--);//1(0)
        System.out.println(num2--);//0(-1)
        System.out.println(++num2);//(0)
        System.out.println(num1--);//1(0)
        System.out.println(num1--);//0(-1)
        System.out.println(++num1);//0
        System.out.println(++num1);//1

        System.out.println(num1);//1
        System.out.println(num2);//0
    }
}
