import javafx.scene.transform.Scale;

import java.util.Scanner;

public class numbersEndingIn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. начален момент
        //2. кой е крайния момент
        //3. какво повтаряме
        //4. какво променяме в цикъла
        //всички числа от 1 до 1000, които завършват на 7
        //правим проерка , дали завършва на 7н и го принтваме и това го повтаряме

        for (int number = 7; number <= 997; number+=10) {
            //проверяваме дали завършва на 7, kogato iskame da wzemem poslednata cifra na koeto i da e ìslo
            // go delim modulno na 10 i ostatyka e poslednata cifra
            if (number % 10 == 7) {
                System.out.println(number);
            }

        }
    }
}
