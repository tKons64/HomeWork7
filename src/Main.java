public class Main {

    public static void main(String[] args) {
        task1_1();
        task1_2();
        task1_3();
        task2_1();
        task2_2();
        task2_3();
        task2_4();
        task3_1();
        task3_2();
        task4_1();
        task4_2();
    }

    public static void task1_1() {
        System.out.println("");
        System.out.println("Задание №1.1");

        byte period = 0;
        int payment = 29_000;
        double deposit = 0;
        double percentYear = 12;
        int targetDeposit = 2_459_000;

        double percentMonth = (percentYear / 12)/100;
        while(deposit < targetDeposit){
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

        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");

        for (i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void task1_3() {
        System.out.println("");
        System.out.println("Задание №1.3");

        double population = 12_000_000;
        float birthRate = 17/1000f; // рождаемость на 1000 человек
        float deathRate = 8/1000f; // смертность на 1000 человек

        byte year = 1;

        while (year <= 10) {
            population = population + (population * birthRate) - (population * deathRate);
            System.out.println("Год " + year + ", численность населения составляет - " + (int)population);
            year++;
        }
    }

    public static void task2_1() {
        System.out.println("");
        System.out.println("Задание №2.1");

        double deposit = 15_000;
        float percentMonth = 0.07f;
        byte period = 0;
        double targetDeposit = 12_000_000;

        while(deposit < targetDeposit){
            deposit = (deposit + (deposit * percentMonth));
            period++;
            System.out.println("Месяц - " + period + ", сумма накоплений равна " + (long)deposit + " рублей");
        }
    }

    public static void task2_2() {
        System.out.println("");
        System.out.println("Задание №2.2");

        double deposit = 15_000;
        float percentMonth = 0.07f;
        byte period = 0;
        double targetDeposit = 12_000_000;

        while(deposit < targetDeposit){
            deposit = (deposit + (deposit * percentMonth));
            period++;
            if (period % 6 == 0) {
                System.out.println("Месяц - " + period + ", сумма накоплений равна " + (long)deposit + " рублей");
            }
        }
    }

    public static void task2_3() {
        System.out.println("");
        System.out.println("Задание №2.3");

        double deposit = 15_000;
        float percentMonth = 0.07f;
        byte period = 0;
        double targetPeriod = 9 * 12; // 9 лет, это 108 месяцев, 9 * 12

        while(period <= targetPeriod){
            deposit = (deposit + (deposit * percentMonth));
            period++;
            if (period % 6 == 0) {
                System.out.println("Месяц - " + period + ", сумма накоплений равна " + (long)deposit + " рублей");
            }
        }
    }

    public static void task2_4() {
        System.out.println("");
        System.out.println("Задание №2.4");

       int fridayNumberInWeek = 2;
       int nextFriday = fridayNumberInWeek;
       byte dayInMonth = 1;

       while (dayInMonth <= 31){
           if (nextFriday == dayInMonth) {
               System.out.println("Сегодня пятница, " + nextFriday + "-е число. Необходимо подготовить отчет");
               nextFriday = nextFriday + 7;
           }
           dayInMonth++;
       }
    }

    public static void task3_1() {
        System.out.println("");
        System.out.println("Задание №3.1");

        int cometYear = 79;
        int nextCometYear = cometYear;
        int thisYear = 2022;
        int startYear = thisYear-200;
        int endYear = thisYear+100;

        while (nextCometYear < endYear){
            if (nextCometYear > startYear && nextCometYear < endYear){
                System.out.println(nextCometYear);
            }
            nextCometYear = nextCometYear + 79;
        }
    }

    public static void task3_2() {
        System.out.println("");
        System.out.println("Задание №3.2");

        byte factor = 1;
        byte term = 2;
        int result = 0;

        //do {
        //    result = term * factor;
        //    System.out.println(term + "*" + factor + "=" + result);
        //    factor++;
        //} while (factor <= 10);

        // в критериях оценки указано использовать цикл for
        for (;factor <= 10;factor++){
            result = term * factor;
            System.out.println(term + "*" + factor + "=" + result);
        }
    }

    public static void task4_1() {
        System.out.println("");
        System.out.println("Задание №4.1, со звездочкой");

        for(int i = 1; i <= 30; i++){
            if (i % 3 == 0){
                System.out.print(i + ": ping");
                if (i % 5 == 0){
                    System.out.println(" pong");
                }else {
                    System.out.println("");
                }
            }else if (i % 5 == 0){
                System.out.println(i + ": pong");
            }else {
                System.out.println(i + ": ");
            }
        }
    }

    public static void task4_2() {
        System.out.println("");
        System.out.println("Задание №4.2, со звездочкой");

        int number0 = 0;
        int number1 = 1;
        int result = number0+number1;

        System.out.print(number0 + ", " + number1);

        int i = 2;
        do {
            result = number0 + number1;
            number0 = number1;
            number1 = result;
            System.out.print(", " + result);
            i++;
        } while (i < 10);
    }

    }