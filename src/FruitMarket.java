import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberryPrice = Double.parseDouble(scanner.nextLine());//цена ягоди
        double bananKg = Double.parseDouble(scanner.nextLine());//количество банани кг
        double orangeKg = Double.parseDouble(scanner.nextLine());//портокали кг
        double raspberryKg = Double.parseDouble(scanner.nextLine());//малини кг
        double strawberryKg = Double.parseDouble(scanner.nextLine());// ягоди кг
        //•	цената на малините е с 50% по-ниска от тази на ягодите; strawberryPrice * 0.50
        //•	цената на портокалите е с 40% по-ниска от цената на малините; (strawberryPrice * 0.50) * 0.60
        //•	цената на бананите е с 80% по-ниска от цената на малините. (strawberryPrice * 0.50) * 0.20
        //•	? са парите, които са необходими на Мария.
        //Резултатът да се форматира до ВТОРАТА цифра след десетичната запетая.
        double strawberrySumQuantity = strawberryPrice * strawberryKg; //сума за ягодите
        double raspberrySumQuantity = (strawberryPrice * 0.50) * raspberryKg;// сума за малините
        double orangeSumQuantity = (strawberryPrice * 0.50) * 0.60 * orangeKg;// сума за портокали
        double bananSumQuantity = (strawberryPrice * 0.50) * 0.20 * bananKg;// сума за банани
        double sum = strawberrySumQuantity + orangeSumQuantity + raspberrySumQuantity + bananSumQuantity;
            System.out.printf("%.2f", sum);



    }
}
