import java.util.Scanner;

public class oldBooks {
    public static void main(String[] args) {
        /*програма, в която тя въвежда търсената от нея книга (текст).
        Докато не се намери книгата или не провери всички книги в библиотеката,
         програмата трябва да чете всеки път на нов ред името на всяка следваща книга (текст),
         която тя проверява. Книгите в библиотеката са свършили щом получите текст “No More Books”.

•	Ако не открие търсената книгата да се отпечата на два реда:
o	"The book you search is not here!"
o	"You checked {брой} books."
•	Ако открие книгата си се отпечатва един ред:
o	"You checked {брой} books and found it."  */

        Scanner scanner = new Scanner(System.in);
        String searchBook = scanner.nextLine();//вход търсената книга
        //1. откриваме си книгата
        //2. ако получим команда
        String command = scanner.nextLine();
        int countCheckBooks = 0;//брой проверени книги
        while (!command.equals("No More Books")) {
            //щом не е командата , значи следва е заглавие
            if (command.equals(searchBook)) {
                System.out.printf("You checked %d books and found it.",countCheckBooks);
                break;
            } else {
                countCheckBooks++;
            }
            command=scanner.nextLine();
        }
        if (command.equals("No More Books")) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countCheckBooks);
        }
    }
}


