import java.util.Scanner;

public class Scholar {
    public static void main(String[] args) {
          /* условия за стипендия:
        1. за социална: Успех > 4.50; доход<мин.раб.заплата(МРЗ)
                размер на стипендията 35% от МРЗ
        2. За успех >=5.50 ; размер на стипендията = успех * 25;
        ПРОВЕРКИ, изход:
        1. Ученикът няма право на стипендия: You cannot get a scholarship!
                2. Ученикът  има право да получава
        соц.стипендия и тя е > стипендията за отличен успех:
        "You get a Social scholarship {стойност на стипендия} BGN"
        2. Ученикът има право на стипендия за отл. успех >= соц.стипендия за него:
•	"You get a scholarship for excellent results {стойност на стипендията} BGN"
                */
        Scanner scan = new Scanner(System.in);
        double incomeLV = Double.parseDouble(scan.nextLine());//доход
        double grade = Double.parseDouble(scan.nextLine());//среден успех
        double minSalary = Double.parseDouble(scan.nextLine());//минимална раб. заплата
        double scholaSocial = 0;
        double scholarExcel = 0;

        if (incomeLV <= minSalary && grade>= 4.5){
            scholaSocial = Math.floor(minSalary*0.35);
        }
        if (grade >=5.50){
            scholarExcel = Math.floor(grade*25);
        }

        if(scholaSocial > scholarExcel){
            System.out.printf("You get a Social scholarship %.0f BGN", scholaSocial);
        }
        else if (scholaSocial < scholarExcel){
            System.out.printf("You get a scholarship for excellent results %.0f BGN",scholarExcel);
        }
        else{
            System.out.println("You cannot get a scholarship!");
        }
    }
}