
import java.util.Scanner;

public class oddEvenPosition {
    public static void main(String[] args) {
        /*Напишете програма, която чете n-на брой числа, въведени от потребителя, и пресмята сумат
         минимума и максимума на числата на четни и нечетни позиции (броим от 1).
         Когато няма минимален / максимален елемент, отпечатайте "No".
Изходът да се форматира в следния вид:
"OddSum=" + {сума на числата на нечетни позиции},
"OddMin=" + { минимална стойност на числата на нечетни позиции } / {“No”},
"OddMax=" + { максимална стойност на числата на нечетни позиции } / {“No”},
"EvenSum=" + { сума на числата на четни позиции },
"EvenMin=" + { минимална стойност на числата на четни позиции } / {“No”},
"EvenMax=" + { максимална стойност на числата на четни позиции } / {“No”}
Всяко число трябва да е форматирано до втория знак след десетичната запетая*/

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // вход брой числа

        double sumEven = 0;
        double sumOdd = 0;
        double OddMax = -Double.MAX_VALUE;//границите се задават в +/- безкрайност, т.е. и за отрицателни стойности
        double OddMin = Double.MAX_VALUE;
        double EvenMax = -Double.MAX_VALUE;
        double EvenMin = Double.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            Double number = Double.parseDouble(scanner.nextLine());

            if (i % 2 != 0) {
                sumOdd += number;
                if (number > OddMax) {
                    OddMax = number;
                }
                if (number < OddMin) {
                    OddMin = number;
                }
            } else {
                sumEven += number;
                if (number > EvenMax) {
                    EvenMax = number;
                }
                if (number < EvenMin) {
                    EvenMin = number;
                }
            }
        }

            // if(number==1){
            if (n == 0) {
                System.out.println("OddSum=0.00,");
                System.out.println("OddMin=No,");
                System.out.println("OddMax=No,");
                System.out.println("EvenSum=0.00,");
                System.out.println("EvenMin=No,");
                System.out.println("EvenMax=No");

            } else if (n == 1) {
                System.out.printf("OddSum=%.2f,%n", sumOdd);
                System.out.printf("OddMin=%.2f,%n", OddMin);
                System.out.printf("OddMax=%.2f,%n", OddMax);
                System.out.printf("EvenSum=%.2f,%n", sumEven);

                System.out.println("EvenMin=No,");
                System.out.println("EvenMax=No");
            } else {
                System.out.printf("OddSum=%.2f,%n", sumOdd);
                System.out.printf("OddMin=%.2f,%n", OddMin);
                System.out.printf("OddMax=%.2f,%n", OddMax);
                System.out.printf("EvenSum=%.2f,%n", sumEven);
                System.out.printf("EvenMin=%.2f,%n", EvenMin);
                System.out.printf("EvenMax=%.2f", EvenMax);
            }


    }
}


