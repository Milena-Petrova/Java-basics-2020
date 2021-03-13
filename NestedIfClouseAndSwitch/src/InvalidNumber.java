import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Дадено число е валидно, ако е в диапазона [100…200] или е 0.
         Да се напише програма, която чете цяло число, въведено от потребителя, и печата "invalid" ако въведеното число
         не е валидно.
         */
        int number = Integer.parseInt(scanner.nextLine());
        boolean isvalid = number>=100&&number<=200||number == 0;
        if(!isvalid){
           System.out.println("invalid");
        }else{
            System.out.println("");
        }
    }
}
