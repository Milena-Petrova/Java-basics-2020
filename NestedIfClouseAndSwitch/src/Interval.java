import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        /*Да се напише програма, която проверява дали въведеното от потребителя число е в интервала [-100, 100]
  и е различно от 0 и извежда "Yes", ако отговаря на условията, или "No" ако е извън тях.
  или : >=-100; <=100 ; !=0*/
        if((number>=-100)&&(number<=100)&&(number !=0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}
