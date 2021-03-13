import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* Град	0 ≤ s ≤ 500 	500 < s ≤ 1000	 1000 < s ≤ 10 000	 s > 10 000
        Sofia	    5%	            7%	                8%               12%
        Varna	    4.5%	        7.5%	            10%	             13%
       Plovdiv	    5.5%	        8%	                12%	             14.5%
 Вход: град и обем на продажби (реално число)
 Изход: размера на търговската комисионна според горната таблица.
 Резултатът да се изведе форматиран до 2 цифри след десетичната точка.
 При невалиден град или обем на продажбите (отрицателно число) да се отпечата "error".
*/
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        //1.Изчисляване на размера на комисионната = (продажбите * %)/100 според таблицата
        //2. Проверка и пресмятане колко е комисионната в различните диапазони на оборота
        //3. Обхождане на горните две точки за всеки град от таблицата

             if(sales>=0&&sales<=500){
                 switch(city){
                 case "Sofia":
                     System.out.printf("%.2f",sales*0.05);
                 break;
                     case "Varna":
                         System.out.printf("%.2f",sales * 0.045);
                         break;
                     case "Plovdiv":
                         System.out.printf("%.2f", sales*0.055);
                         break;
                     default:
                         System.out.println("error");
                         break;
                                 }

    }else if(sales>500&&sales<=1000){
                 switch(city){
                     case "Sofia":
                         System.out.printf("%.2f",sales*0.07);
                         break;
                     case "Varna":
                         System.out.printf("%.2f",sales * 0.075);
                         break;
                     case "Plovdiv":
                         System.out.printf("%.2f", sales*0.08);
                         break;
                     default:
                         System.out.println("error");
                         break;
                 }
             }else if(sales>1000&&sales<=10000){
                 switch(city){
                     case "Sofia":
                         System.out.printf("%.2f",sales*0.08);
                         break;
                     case "Varna":
                         System.out.printf("%.2f",sales * 0.10);
                         break;
                     case "Plovdiv":
                         System.out.printf("%.2f", sales*0.12);
                         break;
                     default:
                         System.out.println("error");
                         break;
                 }
             }else if(sales>10000){
                 switch(city){
                     case "Sofia":
                         System.out.printf("%.2f",sales*0.12);
                         break;
                     case "Varna":
                         System.out.printf("%.2f",sales * 0.13);
                         break;
                     case "Plovdiv":
                         System.out.printf("%.2f", sales*0.145);
                         break;
                     default:
                         System.out.println("error");
                         break;
                 }
             }else{
                 System.out.println("error");
             }
}
}
