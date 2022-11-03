import java.time.Year;

public class Main {
    public static void main(String[] args) {

       int year = 2005;
        if (year %4 ==0 && year %100 !=0 || year %400 ==0) {System.out.println(year + " год " +
                "является високосным");}
        else {System.out.println(year + " год " +
                "не является високосным");}



    }
}