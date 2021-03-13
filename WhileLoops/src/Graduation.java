import java.util.Scanner;
/*ВХОД:името на ученика
На всеки следващ ред -> годишни оценки.
преминава в следващия клас год.оценка>= 4.00.
Ако ученикът бъде скъсан повече от един път-> изключен и програмата приключва,
като се отпечатва името на ученика и в кой клас бива изключен.
 При успешно завършване на 12-ти клас да се отпечата :
"{име на ученика} graduated. Average grade: {средната оценка от цялото обучение}"
В случай, че ученикът е изключен от училище, да се отпечата:
"{име на ученика} has been excluded at {класа, в който е бил изключен} grade"
Стойността трябва да бъде форматирана до втория знак след десетичната запетая.*/

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();//името на ученика
        boolean isExcluded = false;//дали е изключен от програмата
        int grade = 1;
        double sum = 0;
        int repeat = 0;//колко пъти се повтаря клас, поради нисък успех
        //докато не завърши 12 клас сумираме оценките
        while (grade <= 12) {
            //въвеждаме оценките до 12 клас
            double currentMark = Double.parseDouble(scanner.nextLine());
            if (currentMark < 4) {//ако изкара под 4->повтаря класа
                repeat++;
                if (repeat == 2) {
                  
                    isExcluded = true;
                    break;//приключва цикъла, защото при над 2 пъти повтаряне на клас -> изключване, т.е. не се връщаме в началото на цикъла
                }
                //повтаря класа,
                // да НЕ минава в следващия клас, четем нова ценка и добавяме в общата сума
                continue;//прекъсва итерацията и се качва в началото на цикъла, тоест пропуска класовете с ниска оценка
            }
            sum += currentMark;
            grade++;
        }
        if (!isExcluded) {

            double average = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f",name, average);
        }else {
            System.out.printf("%s has been excluded at %d grade",name,grade);
        }
    }
}
