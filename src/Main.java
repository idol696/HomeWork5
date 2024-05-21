public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ваша Система временно не поддерживается");
        }

        System.out.println("Задача 2");

        int clientDeviceYear = 2015;

        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ваша Система временно не поддерживается");
        }

        System.out.println("Задача 3");

        int year = 2000;
        boolean yearLeapCheck = false;


        if (year > 1584) {
            if (year % 400 == 0) {
                yearLeapCheck = true;
            } else if (year % 100 == 0) {
                yearLeapCheck = false;
            } else if (year % 4 == 0) {
                yearLeapCheck = true;
            } else {
                yearLeapCheck = false;
            }
        }

        if (yearLeapCheck) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }

        System.out.println("Задача 4");


        int deliveryDay = 0;
        int deliveryDistance = 95;

        if ( deliveryDistance <20 ) {
            deliveryDay = 1;
        } else if ( deliveryDistance >= 20 && deliveryDistance <60 ) {
            deliveryDay = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100 ) {
            deliveryDay = 3;
        }

        if ( deliveryDay > 0 ) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

        System.out.println("Задача 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Это зима");
                break;
            case 3, 4, 5:
                System.out.println("Это весна");
                break;
            case 6, 7, 8:
                System.out.println("Это лето");
                break;
            case 9, 10, 11:
                System.out.println("Это осень");
                break;
            default:
                System.out.println("Месяц не вписывается в рамки челопонимания");
        }


    }


}
