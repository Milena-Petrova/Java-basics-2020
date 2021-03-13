
    import java.util.Scanner;

    public class Mellisa {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            double n = Double.parseDouble(scan.nextLine());

            double sumOdd = 0.00;
            double sumEven = 0.00;

            double maxOdd = Integer.MIN_VALUE;  // можем да съдържаме double в int
            double minOdd = Integer.MAX_VALUE;

            double minEven = Integer.MAX_VALUE;
            double maxEven = Integer.MIN_VALUE;


            for (int i = 1; i <= n; i++){

                double currentNum = Double.parseDouble(scan.nextLine());

                if ( i % 2 == 0){ // четни

                    sumEven += currentNum;

                    if (currentNum > maxEven){

                        maxEven = currentNum;

                    }
                    if (currentNum < minEven){

                        minEven = currentNum;

                    }
                } else { //нечетни

                    sumOdd += currentNum;

                    if (currentNum > maxOdd){

                        maxOdd = currentNum;

                    }
                    if (currentNum < minOdd){

                        minOdd = currentNum;

                    }
                }
            }

            System.out.printf("OddSum=%.2f,%n",sumOdd);

            if (minOdd == Integer.MAX_VALUE){ // не се е променила

                System.out.println("OddMin=No,");

            } else {

                System.out.printf("OddMin=%.2f,%n", minOdd);
            }

            if (maxOdd == Integer.MIN_VALUE){

                System.out.println("OddMax=No,");

            } else {

                System.out.printf("OddMax=%.2f,%n", maxOdd);
            }

            System.out.printf("EvenSum=%.2f,%n",sumEven);

            if (minEven == Integer.MAX_VALUE){ // не се е променила

                System.out.println("EvenMin=No,");

            } else {

                System.out.printf("EvenMin=%.2f,%n", minEven);
            }

            if (maxEven == Integer.MIN_VALUE){

                System.out.println("EvenMax=No");

            } else {

                System.out.printf("EvenMax=%.2f", maxEven);
            }
        }
    }

