
public class NineteenthQuestion {
    public static void main(String[] args) {
        int count = 0;
        int day = 2; // 1 Jan 1901 was a Tuesday
        for (int year = 1901; year <= 2000; year++) {
            for (int month = 1; month <= 12; month++) {
                int daysInMonth = 0;
                switch (month) {
                    case 2:
                        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                            daysInMonth = 29;
                        } else {
                            daysInMonth = 28;
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        daysInMonth = 30;
                        break;
                    default:
                        daysInMonth = 31;
                        break;
                }
                day = (day + daysInMonth) % 7;
                if (day == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}