import java.util.Scanner;
public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
        String str = "You are " + firstname + " " + lastName + ", a " + age + "-years old person from " + town +".";
        //"You are <firstName> <lastName>, a <age>-years old person from <town>."
        //System.out.printf("You are %s %s, a %d-years old person from %s.", firstname,
            //    lastName, age,town);
        //шаблони за променливи : тип string -> %s, int -> %d, double -> %.2f (2-та показва колко знака след десетичната запетая
        //шаблонът се въвежда след като се постави запетая на цялото изречение
        System.out.print(str);

    }
}
