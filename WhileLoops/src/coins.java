import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Спираме да връщаме ресто, ако то стане 0;продължаваме, докато е >0;
        double changeLv = Double.parseDouble(scanner.nextLine());

        double changeSt = Math.round(changeLv * 100);//convert to stotinki, закръгляме до цяло число, за да яма проблем с точността на double-a
        int countCoin = 0;
        while (changeSt > 0) {
            //връщам ресто->прверка с каква монета може да се върне
            if (changeSt >= 200) {
                //можем да върнем с 2лв=200ст
                changeSt -= 200;
                countCoin++;//увеличаваме броя на монетите с 1
            } else if (changeSt >= 100) {//ресто между 1 и 2лв
                changeSt -= 100;
                countCoin++;
            } else if (changeSt >= 50) {
                changeSt -= 50;
                countCoin++;
            } else if (changeSt >= 20) {
                changeSt -= 20;
                countCoin++;
            } else if (changeSt >= 10) {
                changeSt -= 10;
                countCoin++;
            } else if (changeSt >= 5) {
                changeSt -= 5;
                countCoin++;
            } else if (changeSt >= 2) {
                changeSt -= 2;
                countCoin++;
            } else if (changeSt >= 1) {
                changeSt -= 1;
                countCoin++;
            }
        }
            System.out.println(countCoin);
        }
    }


