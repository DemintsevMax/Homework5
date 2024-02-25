public class Main {
    public static void main(String[] args) {
        System.out.println("Task №1");

        int clientOS = 1;

        if(clientOS==0)
        { System.out.println("Установите версию приложения для iOS по ссылке");}
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Task №2");
        clientOS = 0;

        int clientDeviceYear = 2012;

        if (clientOS==0 && clientDeviceYear<=2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
            else if (clientOS==0 && clientDeviceYear>2015)
        {
            System.out.println("Установите версию приложения для iOS по ссылке");}
            else if (clientOS==1 && clientDeviceYear<=2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");}
            else if (clientOS==1 && clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Task №3");
            int year = 2024;
            if (year>1584) {
                if ((year%4==0 && year%100!=0) || (year%400==0)) {
                    System.out.println("Год вискосный");
                } else {
                    System.out.println("Год не вискосный");
                }
            } else {
        System.out.println("Такого понятия как високосный год не существовало");}



    }
}