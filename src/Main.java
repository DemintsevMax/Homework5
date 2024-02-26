public class Main {
    public static void main(String[] args) {
        System.out.println("Task №1");

        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Task №2");
        clientOS = 0;

        int clientDeviceYear = 2012;

        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Task №3");
        int year = 1989;
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(+year + " год вискосный");
            } else {
                System.out.println(+year + " год не вискосный");
            }
        } else {
            System.out.println("Такого понятия как високосный год не существовало");
        }

        System.out.println("Task №4");

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется одни сутки");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется двое суток");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется трое суток");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет ");
        }

        System.out.println("Task №5");
        int monthNumber = 9;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("номер месяца больше 12");

        }
    }
}



