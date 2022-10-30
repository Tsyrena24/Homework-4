public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 4;
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 2:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Повторите попытку"); }
        System.out.println();


        // Задание 2
        System.out.println("Задание 2");
        int clientOS1 = 1;
        int clientDeviceYear = 2017;
        if (clientDeviceYear < 2015 && clientOS1 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS1 == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS1 == 0) {
            System.out.println("Установите эту версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите эту версию приложения для Android по ссылке");
        }
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        int year = 1903;
        if(year%4==0 && year%100 !=0 || year%400==0){
            System.out.println(year + " является високосным годом");
        } else {
            System.out.println(year + " является невисокосным годом");
        }
        System.out.println();

        // Задание 4
        System.out.println("Задание 4");
        int  deliveryDistance = 18;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется день для доставки карты");
        }
        else if (deliveryDistance >20 && deliveryDistance <=60){
            System.out.println("Потребуется два дня для доставки карты");
        }
        else if (deliveryDistance >60 && deliveryDistance <= 100){
            System.out.println("Потребуется три дня для достваки карты");
        } else System.out.println("На такое расстояние доставка не доставляется, приносим свои извинения");
        System.out.println();


        // Задание 5
        System.out.println("Задание 5");
        int  monthNumber = 3;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " номер месяца принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " номер месяца принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " номер месяца принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
            System.out.println(monthNumber + " номер месяца принадлежит к сезону осень");
            break;
            default:
                System.out.println("Такого месяца не существует");
        }
}}
