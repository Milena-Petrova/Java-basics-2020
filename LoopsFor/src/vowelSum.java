import java.util.Scanner;

public class vowelSum {
    public static void main(String[] args) {
        /*
буква	    a	e	i	o	u

стойност	1	2	3	4	5
*/
     Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    int sum=0;
    for(int i=0;i<input.length();i++) {//започва от 0, защото  първият от символите в редицата е на нулева позиция, тоест 0,1,2...
        char currentChar = input.charAt(i);
        // sum+=currentChar;
        switch (currentChar) {
            case 'a':
                sum += 1;
                break;
            case 'e':
                sum += 2;
                break;
            case 'i':
                sum += 3;
                break;
            case 'o':
                sum += 4;
                break;
            case 'u':
                sum += 5;
                break;
        }
    }
                System.out.println(sum);
        }
    }

