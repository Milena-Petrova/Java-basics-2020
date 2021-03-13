import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rentHall = Integer.parseInt(scanner.nextLine());
        //•	Торта  – цената ѝ е 20% от наема на залата
        //•	Напитки – цената им е 45% по-малко от тази на тортата
        //•	Аниматор – цената му е 1/3 от цената за наема на залата
        // Каква сума е необходима за рождения ден.

        double cake = 0.20 * rentHall;
        double drinks = 0.55 * cake;// напитките са С 45% по-евтини от тортата, тоест са 55% от цената на тортата
        double animation = rentHall/3;
        double sum = rentHall + cake + animation + drinks;
        System.out.println(sum);
    }
}
