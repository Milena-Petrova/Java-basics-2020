public class Clock {
    public static void main(String[] args) {
        for(int hour = 0; hour<=23; hour++){
           //за всеки един от часовете вземаме всички минути от 0 до 59мин
            for (int min = 0; min<=59; min++){
                System.out.println(hour + ":" + min);
            }
        }

    }
}

