import java.util.Scanner;

public class EqualSumsЕvenOddPosition {
    /*Напишете програма, която чете от конзолата две шестцифрени цели числа в диапазона от 100000 до 300000.
     Винаги първото въведено число ще бъде по малко от второто. На конзолата да се отпечатат на 1 ред разделени с интервал всички числа, които се намират между двете,
     прочетени от конзолата числа и отговарят на следното условие:
     •	сумата от цифрите на четни и нечетни позиции да са равни. Ако няма числа, отговарящи на условието на конзолата не се извежда резултат.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        for (int i = num1; i <= num2; i++) {//преминаваме през всички числа в интервала между зададените
            String currentNum = "" + i; //задаваме текущото число като стринг, за да може да го обходим символ по символ
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 0; j < currentNum.length(); j++) {//цикъл, с който обхождаме стринга символ по символ->цифра по цифра
                int currentDigit; //Integer.parseInt(currentNum);
                currentDigit = Integer.parseInt("" + currentNum.charAt(j));//парсваме текущото число
                if (j % 2 == 0) {
                    evenSum += currentDigit;//сума на четните позиции цифри
                } else {
                    oddSum += currentDigit;
                }
            }
                if (evenSum == oddSum) {
                    System.out.print(i +" ");//конкатинация
                }
            }
        }
    }

