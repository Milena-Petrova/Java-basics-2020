import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Sequence2K1 {
    public static void main(String[] args) {
        /*ВХОД: чете число n,
         ИЗХОД: всички числа ≤ n от редицата: 1, 3, 7, 15, 31, ….като
         Всяко следващо число се изчислява като умножим предишното с 2 и добавим 1.(*2+1)
         напр. вход 8->1, 3, 7.../17 -> 1 3 7 15....
           */
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int n = 1;//брояч
        while(n<=number){
            System.out.println(n);//печатам първото число, редицата започва с 1
            n = n*2+1;//следва промяната в цикъла по зададената последователност
        }
    }
}
