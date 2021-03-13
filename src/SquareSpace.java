import java.util.Scanner;

public class SquareSpace {
    public static void main(String[] args) {
        //Пресмятане лице на квадрат
        // Вход e страна на квадрата, изход е лицето
        //Алгоритъм: Нов Скенер
        // а -> Вход от конзолата (scanner)
        // //spaceofSquare = a * a
        // println spaceofSquare
        Scanner scanner = new Scanner(System.in);
        //Парсваме, за да кажем на компа, че въвеждаме число, а не стринг
        int a = Integer.parseInt(scanner.nextLine());
        int spaceofSquare = a * a ;
System.out.println(spaceofSquare);

    }
}
