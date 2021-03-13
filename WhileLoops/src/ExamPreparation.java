import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        /*Напишете програма, в която се решават задачи от изпити, до съобщение "Enough"
         При всяка решена задача->оценка. Програмата  приключва при команда "Enough"
         или при определеният брой лоши оценки -> <=4
 Вход
•	На първи ред - брой лоши оценки - цяло число в интервала [1…5]
•	След това многократно се четат по ДВА реда:
o	Име на задача - текст
o	Оценка - цяло число в интервала [2…6]
Изход
•	Ако Марин стигне до командата "Enough", отпечатайте на 3 реда:
o	"Average score: {средна оценка}"
o	"Number of problems: {броя на всички задачи}"
o	"Last problem: {името на последната задача}"
•	Ако получи определения брой незадоволителни оценки:
o	"You need a break, {брой незадоволителни оценки} poor grades."
Средната оценка да бъде форматирана до втория знак след десетичната запетая. */
        Scanner scanner = new Scanner(System.in);
        int badMarks = Integer.parseInt(scanner.nextLine());

        int countSolutions = 0;//брояч на решени задачи
        int countBadmarks = 0;//брой лоши/незадоволителни оценки<=4
        double gradeSum = 0;//сума на всички оценки
        String lastProblem = "";//последната решена задача
        boolean isFailed = true;//дали успял или се е провалил със задачите
        while (countBadmarks < badMarks) {
            String nameProblem = scanner.nextLine();
            if (nameProblem.equals("Enough")) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                countBadmarks++;
            } else {
                countSolutions++;
            }
            gradeSum += grade;//сума от оценките от решените задачи
            lastProblem = nameProblem;
        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", countBadmarks);
        } else {
            double average = gradeSum / (countSolutions+countBadmarks);
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Number of problems: %d%n", (countSolutions+countBadmarks));
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
