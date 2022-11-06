public class Main {
    public static void main(String[] args) {
//task1
        byte clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Устанвоите версию для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Устовите версию для iOS по ссылке");
        }
        //task2
        int clientDeviceYear = 2010;
        int clientOS1 = 1;
        if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Устанвоите версию для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        }
        if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Устанвоите версию для iOS по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        }

        //Task 3
        int year = 1600;
        int year4 = year % 4;
        int year100 = year % 100;
        int year400 = year % 400;
        if (year100 != 0 && year4 == 0 || year400 == 0){
            System.out.println(year + " год является высокосным");
        }else {
            System.out.println(year + " год не явлляется высокосным");
        }

        //Task 4
        int deliveryDistance = 10;
        int daysDistance = 1;
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней : " + daysDistance);
        }
        daysDistance = daysDistance + 1;
        if (deliveryDistance >= 20 && deliveryDistance < 60){
            System.out.println("Потребуется дней : " + daysDistance);
        }
        daysDistance = daysDistance + 1;
        if (deliveryDistance >= 60 && deliveryDistance < 100){
            System.out.println("Потребуется дней : " + daysDistance);
        }

        //Task 5
        int monthNumber = 0;
        switch (monthNumber){
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень'");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                break;

        }
    }
    }