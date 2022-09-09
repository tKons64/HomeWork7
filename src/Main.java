public class Main {

    public static void main(String[] args) {
        task1_1();task1_2();task1_3();
    }

    public static void task1_1() {
        System.out.println("");
        System.out.println("Задание №1.1");

        byte period = 0;
        int payment = 29_000;
        double deposit = 0;
        double percentYear = 12;

        double percentMonth = (percentYear / 12)/100;
        while(deposit < 2_459_000){
            deposit = (deposit + (deposit * percentMonth));
            deposit = deposit + payment;
            period++;
        }
        System.out.println("Месяц - " + period + ", сумма накоплений равна " + deposit + " рублей");
    }

    public static void task1_2() {
        System.out.println("");
        System.out.println("Задание №1.2");

        byte i = 1;

        while (i < 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.print(i + " ");
        System.out.println("");

        for (; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void task1_3() {
        System.out.println("");
        System.out.println("Задание №1.3");

        int population = 12_000_000;
        byte birthRate = 17; // рождаемость на 1000 человек
        byte deathRate = 8; // смертность на 1000 человек

        byte year = 1;

        while (year <= 10) {
            population = population + ((population / 1000) * birthRate) - ((population / 1000) * deathRate);
            System.out.println("Год " + year + ", численность населения составляет - " + population);
            year++;
        }
    }

}