import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*вход от конзола: реално число скорост
        скорост<=10, принтва "slow", скорост<=50 е "average", скорост<=150, fast,
        скорост<=1000 е ultra fast, скорост>1000 е extremely fast
         */
        double speed = Double.parseDouble(scanner.nextLine());
        if(speed<=10){
            System.out.println("slow");
        }else if(speed<=50){
            System.out.println("average");
        }else if(speed<=150){
            System.out.println("fast");
        }else if(speed<=1000){
            System.out.println("ultra fast");
        }else{
            System.out.println("extremely fast");
        }


    }
}
