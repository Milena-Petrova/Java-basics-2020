import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Входните данни се състоят от три реда, въведени от потребителя:
•	Първи ред: число за преобразуване - реално число
•	Втори ред: входна мерна единица - текст
•	Трети ред: изходна мерна единица (за резултата) - текст
мерни единици: мм,см,м; 1м = 100см = 1000мм
    пример: въвеждаме 100, мерна единица см, да се превърне в м, изход 1*/
        double number = Double.parseDouble(scanner.nextLine());//входно число
        String metric1 = scanner.nextLine();//метрика на входното число
        String metric2 = scanner.nextLine();//метрика на резултата на изхода
        double numberConverted = 0;//изходното преобразувано число

        if(metric1.equals("m")&&metric2.equals("cm")){
            numberConverted = number * 100;//1m=100cm
        }else if(metric1.equals("m")&&metric2.equals("mm")){
            numberConverted = number * 1000;//1m=1000mm
        }if(metric1.equals("cm")&&metric2.equals("m")){
            numberConverted = number / 100;
        }else if(metric1.equals("cm")&&metric2.equals("mm")){
            numberConverted = number * 10;
        }if(metric1.equals("mm")&&metric2.equals("cm")){
            numberConverted = number / 10;//10mm = 1cm
        }else if(metric1.equals("mm")&&metric2.equals("m")){
            numberConverted = number / 1000;
        }
        System.out.printf("%.3f",numberConverted);




    }
}