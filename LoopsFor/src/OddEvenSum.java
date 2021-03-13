import java.util.Scanner;

public class OddEvenSum {


    public static void main(String[] args) {
    /*Програма, чете n-на брой цели числа, подадени от потребителя,
     и проверява дали сумата от числата на четни позиции е равна на сумата на числата на нечетни позиции.
     При равенство да се отпечатат два реда: "Yes" и на нов ред "Sum = " + сумата; иначе да се отпечата "No"
     и на нов ред "Diff = " + разликата. Разликата се изчислява по абсолютна стойност.
     */
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());

        int sumEvenposition =0;
        int sumOddPosition = 0;

        for(int i =1; i<=n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sumEvenposition += number;//намираме сумата на числата на четни позиции
            } else {
                sumOddPosition += number;// сума на нечетните позиции
            }
        }
        if (sumEvenposition==sumOddPosition){
            System.out.printf("Yes%nSum = %d",sumEvenposition);
        }else{
           int diff = sumEvenposition-sumOddPosition;
        System.out.printf("No%nDiff = %d",Math.abs(diff));
        }
    }
}
