import java.util.Scanner;

public class CinemaTicket {
    /*да изчислява процента на билетите за всеки тип от продадените билети: студентски(student), стандартен(standard) и детски(kid),
    за всички прожекции. Трябва да изчислите и колко процента от залата е запълнена за всяка една прожекция.
ВХОД - поредица от цели числа и текст:
•	На първия ред до получаване на командата "Finish" - име на филма – текст
•	На втори ред – свободните места в салона за всяка прожекция – цяло число [1 … 100]
•	За всеки филм, се чете по един ред до изчерпване на свободните места в залата или до получаване на командата "End":
o	Типа на закупения билет - текст ("student", "standard", "kid")
ИЗХОД
•	След всеки филм да се отпечата, колко процента от кино залата е пълна
"{името на филма} - {процент запълненост на залата}% full."
•	При получаване на командата "Finish" да се отпечатат четири реда:
o	"Total tickets: {общият брой закупени билети за всички филми}"
o	"{процент на студентските билети}% student tickets."
o	"{процент на стандартните билети}% standard tickets."
o	"{процент на детските билети}% kids tickets."
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();

        int totalTickets = 0;//общ брой билети от всички филми
        int countStudent = 0;//броячи за различните типове билети
        int countStandard = 0;
        int countKids = 0;

        while(!movie.equals("Finish")){//до получаване на командата "Finish" - име на филма
            //свободните места в салона за всяка прожекция

            int freeSeats = Integer.parseInt(scanner.nextLine());//за всеки филм въвеждаме свободните места в салона
            int takenSeats = 0;//брояч на закупените билети
            while (true){//въвеждаме свободните места за съответната прожекция
                String typeOfTicket = scanner.nextLine();//тип на билета

                if(typeOfTicket.equals("End")) {
                    break;//до получаване на командата "End"
                }
                totalTickets++;//броим всеки закупен билет,независимо от филма
                takenSeats++;//zakupeni bileti

                if(typeOfTicket.equals("student")){
                    countStudent++;
                }
                else if(typeOfTicket.equals("standard")){
                    countStandard++;
                }
                else if(typeOfTicket.equals("kid")){
                    countKids++;
                }

                if (takenSeats>=freeSeats){
                    break;//или  до изчерпване на свободните места в залата
                }


            }


            double percentTaken = 1.0 * takenSeats/freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n",movie,percentTaken);
            movie = scanner.nextLine();
        }

            System.out.printf("Total tickets: %d%n",totalTickets);

            double percentStudent = 1.0 * countStudent/totalTickets * 100;
            System.out.printf("%.2f%% student tickets.%n",percentStudent);

            double percentStandard = 1.0 * countStandard/totalTickets * 100;
            System.out.printf("%.2f%% standard tickets.%n",percentStandard);

            double percentKids = 1.0 * countKids/totalTickets * 100;
            System.out.printf("%.2f%% kids tickets.",percentKids);

    }
}
