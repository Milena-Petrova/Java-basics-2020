import java.util.Scanner;

public class EqualSumEvenOddSecondSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        //по условие знаем, че num1 и num2 са шестцифрени числа, тоест можем да си намерим всяка цифра без да представяме числоо като стринг
        //за целта си правим for цикъл за целия интервал и за всяка цифра от числото намираме позицията и
        for(int i=num1 ; i<=num2;i++){
           int digit1 = i/100000;//ако разделим цяло! число на друго цяло , получаваме резултат без остатъка !, тоест 45678%109 / 100 000 = 4
           int digit2 = i/10000%10; //като разделим 6-цифреното число на 10к и полученото число процентно на 10, ще получим втората цифра
           int digit3 = i/1000%10;//по същата логика получаваме 3-тата цифра, тоест 456789/1000=456%10=6
           int digit4 = i/100%10;
           int digit5 = i/10%10;
           int digit6 = i%10;
           int evenSum = digit2 + digit4 + digit6;
           int oddSum = digit1 + digit3 + digit5;
           if(evenSum==oddSum){
               System.out.print(i + " ");
           }
        }
    }
}
