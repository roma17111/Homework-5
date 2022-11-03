public class Main {
    public static void main(String[] args) {


       byte clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015 && clientOS ==0) {System.out.println("Установите облегченную версию" +
                " приложения для iOS по ссылке");}
        else if (clientDeviceYear < 2015 && clientOS ==1) {System.out.println("Установите облегченную версию" +
                " приложения для android по ссылке");}
        else if (clientDeviceYear >= 2015 && clientOS ==0) {System.out.println("Установите обычную версию приложения " +
                "для iOS по ссылке");}
        else if (clientDeviceYear >= 2015 && clientOS ==1) {System.out.println("Установите обычную версию приложения " +
                "для android по ссылке");}
        else {System.out.println("Error");}


    }
}