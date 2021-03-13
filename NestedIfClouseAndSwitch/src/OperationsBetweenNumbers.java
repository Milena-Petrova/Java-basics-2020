import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Напишете програма, която чете две цели числа (N1 и N2) и оператор, с който да се извърши дадена математическа операция с тях.
         Събиране(+), Изваждане(-), Умножение(*), Деление(/) и Модулно деление(%).
         ВХОД:
         •	N1 – цяло число в интервала [0...40 000]•	N2 – цяло число в интервала [0...40 000]
        •	Оператор – един символ измеду: „+“, „-“, „*“, „/“, „%“
ИЗХОД: На един ред:
•	Ако операцията е събиране, изваждене или умножение:
o	 „{N1} {оператор} {N2} = {резултат} – {even/odd}“
•	Ако операцията е деление:
o	„{N1} / {N2} = {резултат}“ – резултатът е фораматиран до вторият знак след дес.запетая
•	Ако операцията е модулно деление:
o	„{N1} % {N2} = {остатък}“
•	В случай на деление с 0(нула):
o	„Cannot divide {N1} by zero“
         */
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        String operation = scanner.nextLine();
        double result = 0;
        String even = "even";
        String odd = "odd";

        switch (operation) {
            case "+":
                 result = num1 + num2;
                if(result%2==0){
                    System.out.printf("%.0f %s %.0f = %.0f - %s", num1,operation,num2,result,even);
                }else{
                    System.out.printf("%.0f %s %.0f = %.0f - %s", num1,operation,num2,result,odd);
                }
            break;
            case "-":
                 result = num1 - num2;
                if(result%2==0){
                    System.out.printf("%.0f %s %.0f = %.0f - %s", num1,operation,num2,result,even);
                }else{
                    System.out.printf("%.0f %s %.0f = %.0f - %s", num1,operation,num2,result,odd);
                }
                break;

            case "*":
                result = num1 * num2;
                if(result%2==0){
                    System.out.printf("%.0f %s %.0f = %.0f - %s", num1,operation,num2,result,even);
                }else{
                    System.out.printf("%.0f %s %.0f = %.0f - %s", num1,operation,num2,result,odd);
                }
                break;
             case "/":
                if(num2!=0) {
                    result = num1 / num2;
                    System.out.printf("%.0f %s %.0f = %.2f",num1,operation,num2,result);
                }else{
                    System.out.printf("Cannot divide %.0f by zero",num1);
                }
                break;
            case "%":
                if(num2!=0) {
                    result = num1 % num2;
                    System.out.printf("%.0f %s %.0f = %.0f",num1,operation,num2,result);
                }else{
                    System.out.printf("Cannot divide %.0f by zero",num1);
                }
                break;


    }
    }
}
