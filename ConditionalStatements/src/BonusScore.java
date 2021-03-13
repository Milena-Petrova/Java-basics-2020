import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Ако числото е до 100 включително, бонус точките са 5; ako e >100 bonus 20% ot числото;
        // над 1000-> бонус 10% от числото
        //•	Допълнителни бонус точки (начисляват се отделно от предходните):
        //o	За четно число  + 1 т., even number
        //o	За число, което завършва на 5  + 2 т., odd
        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;
        if(number<=100){
            bonus = 5;
        }else if(number>1000){
            bonus = 0.1 * number;
        }else{
            bonus = 0.2 * number;
        }
if(number % 2 == 0){
    bonus = bonus +1;
}else if(number % 10 == 5){
    bonus = bonus + 2;
}
        System.out.println(bonus);
        System.out.println(number + bonus);
    }
}
