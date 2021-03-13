import java.util.Scanner;

public class TrainTheTrainers {/*Напишете програма в която да изчислява средната оценка от всяка една презентация  средният успех от всички тях.
ВХОД: броят на хората в журито n - цяло число в интервала [1…20]
След това на отделен ред се прочита името на презентацията - текст
За всяка една презентация на нов ред се четат n - на брой оценки - реално число в интервала [2.00…6.00]
След изчисляване на средната оценка за конкретна презентация, на конзолата се печата
 "{името на презентацията} - {средна оценка}."
След получаване на команда "Finish" на конзолата се печата "Student's final assessment is {среден успех от всички презентации}." и програмата приключва.
Всички оценки трябва да бъдат форматирани до втория знак след десетичната запетая.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String namePresentation = scanner.nextLine();
        double averageMarks = 0;//средна оценка за дадената презентация

        double assesment = 0;//среден общ успех от всички презентации
        int count = 0;//брояч на ВСИЧКИ оценки
        double sum=0;//сума от всикчи оценки
        while (!namePresentation.equals("Finish")) {
            double sumMarks = 0;//оценки от презентацията
            for (int i = 1; i <= people; i++) {
                double marks = Double.parseDouble(scanner.nextLine());//оценки от презентацията всеки оценител
                sumMarks += marks;//сумира оценките от презентацията
                count++;
                sum+=marks;//сума на всички текущи оценки
            }
            averageMarks = sumMarks / people;//среден успех за всяка презентация
            System.out.printf("%s - %.2f.%n", namePresentation, averageMarks);

            namePresentation = scanner.nextLine();
            assesment=sum/count;
        }

           // assesment += averageMarks/count;
            System.out.printf("Student's final assessment is %.2f.", assesment);


    }
}

