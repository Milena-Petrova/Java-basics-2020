
import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*1 раб. м. 70x120 cm (маса с размер 70 x 40 cm + място за стол и преминаване с размер 70x80 cm).
        Коридорът е широк поне 100 cm. Изчислено е, че заради входната врата (която е с отвор 160 cm) се губи точно 1 работно място,
         а заради катедрата (която е с размер 160 на 120 cm) 2 раб.м.
         ? работни места побира залата
        katedra
        vhod:
        HxV на залата;
         */
        double wide = Double.parseDouble(scanner.nextLine());
        double narrow = Double.parseDouble(scanner.nextLine());
        /*w * 100 - convert to cm
        (80+40) cm = 1.20m W-rab. mqsto
        70cm -> 0.7m H na rab.mqsto
         */
        int workPlaceWide = (int)(wide/1.2);//casting - parsvame double v integer
        //пресмятане на броя редове, 1.20m e razmera na stol s masa
        int workPlaceNarrow = (int)((narrow-1)/0.7);//presmqtane na broj koloni mesta

        int numberOfPlaces = (workPlaceWide * workPlaceNarrow) - 3;//3 работни места по-малко, заради катедрата и входа - по условие
        System.out.println(numberOfPlaces);

    }
}
