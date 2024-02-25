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



    }
}