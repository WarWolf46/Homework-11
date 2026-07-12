public class Main {
    public static void main(String[] args) {

        // Задача 1
        checkLeapYear(2021);
        checkLeapYear(2024);
        checkLeapYear(1900);
        checkLeapYear(2000);


        // Задача 2
        printAppVersion(0, 2014); // iOS, устройство старое
        printAppVersion(1, 2016); // Android, устройство новое
        printAppVersion(0, 2020); // iOS, устройство новое


        // Задача 3
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);

        if (deliveryDays == -1) {
            System.out.println("Доставка на расстояние " + deliveryDistance + " км невозможна");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }

        //
        printDeliveryInfo(15);
        printDeliveryInfo(50);
        printDeliveryInfo(95);
        printDeliveryInfo(150);
    }



    public static void checkLeapYear(int year) {
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeap) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }


    public static void printAppVersion(int clientOS, int clientDeviceYear) {
        int thresholdYear = 2015;

        switch (clientOS) {
            case 0:
                if (clientDeviceYear < thresholdYear) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear < thresholdYear) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Неизвестная операционная система");
        }
    }


    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }



    public static void printDeliveryInfo(int distance) {
        int days = calculateDeliveryDays(distance);

        if (days == -1) {
            System.out.println("Доставка на расстояние " + distance + " км невозможна");
        } else {
            System.out.println("Потребуется дней: " + days);
        }
    }
}