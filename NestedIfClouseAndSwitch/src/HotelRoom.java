import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Май и октомври	        Юни и септември	                    Юли и август
Студио –    50 лв.	                Студио – 75.20 лв.                 	Студио – 76 лв.
Апартамент – 65 лв.             	Апартамент – 68.70 лв.          	Апартамент – 77 лв.

    За СТУДИО, при НАД 7 нощувки през май и октомври : 5% намаление./НАД 14 нощувки 30% намаление
•	За СТУДИО, при НАД 14 нощувки през юни и септември: 20% намаление.

•	За АПАРТАМЕНТ, при повече от 14 нощувки, без значение от месеца : 10% намаление.
ВХОД:•	На първия ред е месецът – May, June, July, August, September или October
     •	На втория ред е броят на нощувките – цяло число в интервала [0 ... 200]

ИЗХОД:      •	На първия ред: “Apartment: {цена за целият престой} lv.”
            •	На втория ред: “Studio: {цена за целият престой} lv.“
            резултат до 2-рия знак след запетаята
    */
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;
        double studioSum = 0;//сума за брой нощувки в студио
        double apartmentSum = 0;//сума за брой нощувки в апартамент

        switch (month) {
            case "May":
            case "October":
                studioPrice = 50;
                apartmentPrice = 65;
                studioSum = studioPrice * nights;
                apartmentSum = apartmentPrice * nights;
             if (nights > 7&&nights<=14) {
                   studioSum = 0.95 * studioPrice * nights;//5% discount
                } else if(nights>14){
                    apartmentSum = 0.90 * apartmentPrice * nights;//10% discount
                    studioSum = 0.70 * studioPrice * nights;//30% discount
                }
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartmentSum, studioSum);
                break;
            case "June":
            case "September":

                    studioPrice = 75.20;
                    apartmentPrice = 68.70;
                    studioSum = studioPrice * nights;
                    apartmentSum = apartmentPrice * nights;

              if (nights > 14) {
                  studioPrice = 75.20;
                  apartmentPrice = 68.70;
                  studioSum = 0.80 * studioPrice * nights;//20% discount
                  apartmentSum = 0.90 * apartmentPrice * nights;//10% discount
                }
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartmentSum, studioSum);
                break;
            case "July":
            case "August":
                studioPrice = 76;
                apartmentPrice = 77;
                studioSum = studioPrice * nights;
                apartmentSum = apartmentPrice * nights;
                if (nights > 14) {
                    apartmentSum = apartmentPrice * nights * 0.90;//10% discount
                }
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartmentSum, studioSum);
                break;
        }
    }
}
