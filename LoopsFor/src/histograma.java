import java.util.Scanner;

public class histograma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      int n = Integer.parseInt(scanner.nextLine());//broj chisla
      //1. за всяко число от 1 до n  трябва да знаем стойността му
        //2. да проверим в коя група попада
        //3. да го добавим в групата, тоест увеличаваме си числата в дадена група
        int count1 =0;//брой на числата в първата група (и така нататък за всички групи)
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;//задаваме си всъщност броячите на числата по групите

        for(int number = 1;number<=n;number++){
          //за всяко едно число, което четем в цикъла ще го съхраним в тази променлива
          int value = Integer.parseInt(scanner.nextLine());
          //следва проверка в коя група е числото
            if(value<200){
             count1=count1+1;//(count+=1)
            }else if(value>=200&&value<=399){
                count2+=1;
            }else if(value>=400&&value<=599){
                count3+=1;
            }else if(value>=600&&value<=799){
                count4+=1;
            }else if(value>=800){
                count5+=1;
            }
      }
        //след този цикъл ние знаем броят на числата по групи
        //следователно може да намерим процента на всяка една от групите
        double percent1 = count1*1.0/n*100;
        double percent2 = count2*1.0/n*100;
        double percent3 = count3*1.0/n*100;
        double percent4 = count4*1.0/n*100;
        double percent5 = count5*1.0/n*100;


        System.out.printf("%.2f%%%n",percent1);
        System.out.printf("%.2f%%%n",percent2);
        System.out.printf("%.2f%%%n",percent3);
        System.out.printf("%.2f%%%n",percent4);
        System.out.printf("%.2f%%",percent5);

    }
}
