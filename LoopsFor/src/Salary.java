import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counttabs=Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for(int tab=1; tab<=counttabs; tab++){
           //проверка кой е сайта->текст
            //проверка за сайта Fasebook, Instagram, Reddit
            //проверка дали ни е свършила заплатата
            String siteName = scanner.nextLine();//за всеки един таб ми прочети кой е сайта
            switch (siteName){
                case "Facebook":
                    salary = salary-150;//salary-=150
                    break;
                case "Instagram":
                    salary-=100;
                    break;
                case "Reddit":
                    salary-=50;
                    break;
            }
            if(salary<=0){
                System.out.println("You have lost your salary.");
                break;//този Break прекратява най-близкия цикъл, в който се намираме
            }
        }
        if (salary>0){
            System.out.println(salary);
        }
    }
}
