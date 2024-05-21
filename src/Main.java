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

        System.out.println("Задача 2"); // добавлены уровни вложенности, clientOS - реинициализирована

        clientOS = 1;
        int yearMin = 2000;
        int yearMax = 2024;

        int clientDeviceYear = (int) (Math.random() * (yearMax - yearMin)) + yearMin;
        System.out.println("Год выпуска: " + clientDeviceYear);

        if (clientOS == 0) {

            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }

        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }


        System.out.println("Задача 3"); // упрощено логическое выражение

        int year = 2000;

        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }


        System.out.println("Задача 4"); // упрощен вывод, добавлен уровень вложенности


        int deliveryDay = 0;
        int deliveryDistance = 95;

        if (deliveryDistance <= 100) {
            if (deliveryDistance < 20) {
                deliveryDay = 1;
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                deliveryDay = 2;
            } else if (deliveryDistance >= 60) {
                deliveryDay = 3;
            }
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
