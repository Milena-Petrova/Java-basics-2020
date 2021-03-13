import java.util.Scanner;

public class passwordGenerator {/*
Две цели числа n и l, въведени от потребителя->генерира по азбучен ред всички възможни  пароли,
които се състоят от следните 5 символа:
•	Символ 1: цифра от 1 до n.
•	Символ 2: цифра от 1 до n.
•	Символ 3: малка буква измежду първите l букви на латинската азбука.
•	Символ 4: малка буква измежду първите l букви на латинската азбука.
•	Символ 5: цифра от 1 до n, по-голяма от първите 2 цифри.
Вход : две цели числа n и l в интервала [1…9], по едно на ред.
Изход :
На конзолата трябва да се отпечатат всички пароли по азбучен ред, разделени с интервал.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int first = 1; first <= n; first++) {
            for (int second = 1; second <= n; second++) {
                for (char third = 'a'; third < 'a' + l; third++) {//проверка на символа в aski таблицата->кое число съответства
                    for (char forth = 'a'; forth < 'a' + l; forth++) {
                        for (int fifth = 1; fifth <= n; fifth++) {//трябва да е по-голям от 1-то и 2-то число
                            if (fifth > first && fifth > second) {
                                //валидната комбинация
                                System.out.printf("%d%d%c%c%d ", first, second, third, forth, fifth);
                            }
                        }
                    }
                }
            }
        }

    }
}
