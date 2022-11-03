import java.time.Year;

public class Main {
    public static void main(String[] args) {

       int year = 2005;
        if (year %4 ==0 && year %100 !=0 || year %400 ==0) {System.out.println(year + " год " +
                "является високосным");}
        else {System.out.println(year + " год " +
                "не является високосным");}

        int deliveryDistance = 400;
        int day;
        if (deliveryDistance <= 20) {day = 1;
        System.out.println("Потребуется дней: " + day);}
        else {day = (deliveryDistance - 20) / 40 + 1;
            System.out.println("Потребуется дней: " + day);}

    int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь - зимний.");
                break;
            case 2:
                System.out.println("Февраль - зимний.");
                break;
            case 3:
                System.out.println("Март - весенний.");
                break;
            case 4:
                System.out.println("Апрель - весенний.");
                break;
            case 5:
                System.out.println("Май - весенний");
                break;
            case 6:
                System.out.println("Июнь - летний.");
            case 7:
                System.out.println("Июль - летний.");
                break;
            case 8:
                System.out.println("Август - летний");
                break;
            case 9:
                System.out.println("Сентябрь - осенний");
                break;
            case 10:
                System.out.println("Октябрь - осенний");
                break;
            case 11:
                System.out.println("Ноябрь - осенний");
                break;
            case 12:
                System.out.println("Декабрь - зимний");
                break;
            default:
                System.out.println("Такого месяца нет!!!");
                break;


        }
    }
}