import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
       // String name = scanner.nextLine();
       // if(name.equals("Desi")) проврка на стрингове става с equals


        if (number == 1){
            System.out.println("one");
        }else if (number == 2){
            System.out.println("two");
        }else if (number == 3){
            System.out.println("three");
        }
    }
}
