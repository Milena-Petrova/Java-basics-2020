import java.util.Scanner;

public class halfSumElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //въвеждаме N и N на брой числа и проверяаме, дали има такова, което да е сума на всички останали

        int n = Integer.parseInt(scanner.nextLine());

        //трябва да си намерим първо кое е максималното число,
        //каква е общата сума и сумата без максималното число
        int max = Integer.MIN_VALUE;//"нулиране на максималната стойност",
        // с която ще сравняваме въведениет числа и правим проверките
        int sumAll = 0;//сумата на всички числа
        for (int i = 1; i <= n; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            sumAll = sumAll + value;//на всяко въртене добавяме новото число
            if (value > max) {
                max = value;
            }
        }
        //максималното число
        //сумата на всички
        int sumOthers = sumAll - max;
        if(sumOthers==max){
            System.out.println("Yes");
            System.out.println("Sum = "+max);
        }else{
            int diff = Math.abs(max-sumOthers);
            System.out.println("No");
            System.out.println("Diff = "+diff);
        }
    }
}
