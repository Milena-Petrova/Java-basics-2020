import java.util.Scanner;

public class Combinations {
    /*Напишете програма, която изчислява колко решения в естествените числа (включително и нулата) има уравнението:
x1 + x2 + x3 = n
Числото n е цяло число и се въвежда от конзолата.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int countCombinations = 0;//брой валидни комбинации
        int sum=0;
        for (int x1 = 0; x1 <= number; x1++) {
            for (int x2 = 0; x2 <= number; x2++) {
                for (int x3 = 0; x3 <= number; x3++) {
                    sum = x1 + x2 + x3;
                    if(sum==number){
                        countCombinations++;
                    }
                 }
            }
        }
        System.out.println(countCombinations);
    }
}