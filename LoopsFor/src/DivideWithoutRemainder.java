import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* n-на брой цели числа в интервала [1…1000].
         От тях някакъв процент p1 се делят без остатък на 2,
         процент p2 се делят без остатък на 3,
         процент p3 се делят без остатък на 4.
         Да се напише програма, която изчислява и отпечатва
         процентите p1, p2 и p3.

*/
        int n = Integer.parseInt(scanner.nextLine());
        int countDive2=0;//брояч на числата от всяка група, делящи се на 2, 3 или 4
        int countDive3=0;
        int countDive4=0;

        for(int i=1; i<=n;i++){
            int number = Integer.parseInt(scanner.nextLine());
        if(number%2==0){//Ползваме само if, а не else if, защото  някое число може да отговаря на трите условия, например 600 се дели и на2, и на 3, и на 4
            countDive2+=1;}
            if(number%3==0){
                countDive3+=1;}
                if(number%4==0){
                    countDive4+=1;
                }
            }
        double percent2 = countDive2*1.0/n*100;
        double percent3 = countDive3*1.0/n*100;
        double percent4 = countDive4*1.0/n*100;
        System.out.printf("%.2f%%%n",percent2);//%%-> отпечатва %, %n - шаблон за нов ред
        System.out.printf("%.2f%%%n",percent3);
        System.out.printf("%.2f%%%n",percent4);
        }

    }

