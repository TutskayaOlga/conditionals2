public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    private static void task1() {
        System.out.println("ЗАДАЧА №1 версия 1");
        System.out.println(" ");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке: https://play.google.com/store/apps/details?id=com.namsung.xgps160&hl=ru&gl=US");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке: https://apps.apple.com/ru/app/skypro-%D0%BE%D0%BD%D0%BB%D0%B0%D0%B9%D0%BD-%D1%83%D0%BD%D0%B8%D0%B2%D0%B5%D1%80%D1%81%D0%B8%D1%82%D0%B5%D1%82/id1568515479");
        }
        System.out.println();
    }
    private static void task2() {
        System.out.println("ЗАДАЧА №1 версия 2");
        System.out.println(" ");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке: https://play.google.com/store/apps/details?id=com.namsung.xgps160&hl=ru&gl=US");
        } else {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке: https://apps.apple.com/ru/app/skypro-%D0%BE%D0%BD%D0%BB%D0%B0%D0%B9%D0%BD-%D1%83%D0%BD%D0%B8%D0%B2%D0%B5%D1%80%D1%81%D0%B8%D1%82%D0%B5%D1%82/id1568515479");
            }
        }
        System.out.println(" ");
    }
    private static void task3() {
        System.out.println("ЗАДАЧА №1 версия 3");
        System.out.println(" ");
        int clientOS = 3;
        switch (clientOS) {
            case 0:
                //ссылка не рабочая
                System.out.println("Установите версию приложения для IOS по ссылке: https://play.google.com/store/apps");
                break;
            case 1:
                //ссылка не рабочая
                System.out.println("Установите версию приложения для Android по ссылке: https://apps.apple.com/ru/app/skypro");
                break;
            case 2:
            default:
                System.out.println("Eror 404.");
        }
        System.out.println(" ");
        }
    private static void task4() {
        System.out.println("ЗАДАЧА №2");
        System.out.println(" ");
        //«Установите облегченную версию приложения для iOS по ссылке».
        //«Установите облегченную версию приложения для Android по ссылке».
        int clientDeviceYear = 2015;
        int software = 0;
        String linkAndroid = "https://play.google.com/store/apps/details?id=skyeng.words.prod&hl=ru&gl=US";
        String linkIos = "https://apps.apple.com/ru/app/skypro-%D0%BE%D0%BD%D0%BB%D0%B0%D0%B9%D0%BD-%D1%83%D0%BD%D0%B8%D0%B2%D0%B5%D1%80%D1%81%D0%B8%D1%82%D0%B5%D1%82/id1568515479";
        if(clientDeviceYear <= 2015){
            if(software == 1){
                System.out.printf("Установите облегченную версию приложения для Android по ссылке: %s ", linkAndroid);
            }
					else{
                System.out.printf("Установите облегченную версию приложения для IOS по ссылке: %s ", linkIos);
            }
        } else{
            if(software == 1){
                System.out.printf("Установите приложение для Android по ссылке: %s ", linkAndroid);
            }
					else{
                System.out.printf("Установите приложение для IOS по ссылке: %s ", linkIos);
            }
            }
        System.out.println(" ");
        System.out.println(" ");
    }
    private static void task5() {
        System.out.println("ЗАДАЧА №3");
        System.out.println(" ");
        int year = 2000;
        String yearPrint = String.valueOf(year);
        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0){
            System.out.printf("%s год является високостным", yearPrint);
        } else{
            System.out.printf("%s год не является високостным", yearPrint);
        }
        System.out.println(" ");
        System.out.println(" ");
    }
    private static void task6() {
        System.out.println("ЗАДАЧА №4");
        System.out.println(" ");
        int deliveryDistance = 95;
        int days = 1;
        int firstDistance = 20;
        int everyDistanceDay = 40;
        if (deliveryDistance > firstDistance) {
            days = (int) (Math.round((double)deliveryDistance/everyDistanceDay) + days);
                System.out.printf("Потребуется дней для доставки карты: " +  days);
        }
        System.out.println(" ");
        System.out.println(" ");
        }
    private static void task7() {
        System.out.println("ЗАДАЧА №5");
        System.out.println(" ");
        int motherNumber = 12;
        String seasonWinter = "зима";
        String seasonSummer = "лето";
        String seasonAutumn = "осень";
        String seasonSpring = "весна";
        switch (motherNumber) {
            case 1:
                System.out.printf("Январь принадлежит к сезону %s ", seasonWinter);
                break;
            case 2:
                System.out.printf("Февраль принадлежит к сезону %s ", seasonWinter);
                break;
            case 3:
                System.out.printf("Март принадлежит к сезону %s ", seasonSpring);
                break;
            case 4:
                System.out.printf("Апрель принадлежит к сезону %s ", seasonSpring);
                break;
            case 5:
                System.out.printf("Май принадлежит к сезону %s ", seasonSpring);
                break;
            case 6:
                System.out.printf("Июнь принадлежит к сезону %s ", seasonSummer);
                break;
            case 7:
                System.out.printf("Июль принадлежит к сезону %s ", seasonSummer);
                break;
            case 8:
                System.out.printf("Август принадлежит к сезону %s ", seasonSummer);
                break;
            case 9:
                System.out.printf("Сентябрь принадлежит к сезону %s ", seasonAutumn);
                break;
            case 10:
                System.out.printf("Октябрь принадлежит к сезону %s ", seasonAutumn);
                break;
            case 11:
                System.out.printf("Ноябрь принадлежит к сезону %s ", seasonAutumn);
            case 12:
                System.out.printf("Декабрь принадлежит к сезону %s ", seasonWinter);
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}