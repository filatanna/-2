public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1() {
        System.out.println("Здадача1");
        byte a = 53;
        System.out.println("Значение переменной а с типом byte равно "+ a);
        short b = 23000;
        System.out.println("Значение переменной b с типом short равно "+ b);
        int c = 2000000;
        System.out.println("Значение переменной c с типом int равно "+ c);
        long d = 13000000L;
        System.out.println("Значение переменной а с типом long равно "+ d);
        float k = 1.35f;
        System.out.println("Значение переменной k с типом float равно "+ k);
        double w = 867.966;
        System.out.println("Значение переменной w с типом double равно "+ w);
    }
    public static  void task2() {
        System.out.println("Здадача2");
        float one = 27.12f;
        long two = 987678965549L;
        float f = 2.786f;
        short s = 569;
        short x = -159;
        short y = 27897;
        byte z = 67;
        System.out.println(one);
        System.out.println(two);
        System.out.println(f);
        System.out.println(s);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        }
        public static void task3() {
            System.out.println("Задача 3");
        short LP = 23;
        short AS = 27;
        short EA = 30;
        short sheet = 480;
            System.out.println("На каждого ученика рассчитано " + sheet / (LP + AS + EA) + " листов бумаги");
        }
        public static void task4() {
            System.out.println("Задача 4");
        byte a =16;
            System.out.println("За 20 минут машина произвела " + (a*10) + " штук бутылок.");
            System.out.println("За сутки машина произвела " + (a*720) + " штук бутылок.");
            System.out.println("За 3 дня машина произвела " + (a*(720*3)) + " штук бутылок.");
            System.out.println("За 1 месяц машина произвела " + (a*(720*30)) + " штук бутылок.");
        }
        public static void task5() {
            System.out.println("Задача 5");
        byte a = 120;
        byte w = 2;
        byte b = 4;
        byte c = (byte) (w +b);
            System.out.println("В школе, где " + (120 / c) + " классов, нужно " + ((120 / c) * w) + " банок белой краски и " + ((120 / c) * b) + " банок коричневой краски.");
        }
        public static void task6(){
            System.out.println("Задача 6");
            short bananas = 80;
            short milk = 105;
            short ice = 100;
            short egg = 70;
            short breаkfast = (short) ((bananas * 5) + (milk * 2) + (ice * 2) + (egg * 4));
            System.out.println(breаkfast + "граммов");
            double breakfastKg = (short) (((bananas * 5) + (milk * 2) + (ice * 2) + (egg * 4))/1000);
            System.out.println (breakfastKg + " килограммов");
        }
        public static void task7(){
            System.out.println("Задача 7");
            short massa = 7000;
            short min = 250;
            short max = 500;
            double slow = (double) (massa/min);
            System.out.println("Потребуется " + slow + " дней, если будет сбрасывать по 250 граммов в день.");
            double fast = (double) (massa/max);
            System.out.println("Потребуется " + fast + " дней, если будет сбрасывать по 500 граммов в день.");
            short medium = (short) ((min+max)/2);
            double sr = (double) (massa/medium);
            System.out.println("Потребуется " + sr + " дней, если будет сбрасывать по " + medium + " граммов в день.");
        }
        public static void  task8(){
            System.out.println("Задача 8");
            int mari = 67760;
            int den = 83690;
            int kris = 76230;
            int mari1 = (int) (mari * 0.1);
            int mari11 = (int)(mari1 + mari);
            int mari2 = (int)((mari11 * 12) - (mari *12));
            System.out.println ("Маша теперь получает " + mari11 + " рублей. Годовой доход вырос на " + mari2 + " рублей.");
            int den1 = (int)(den * 0.1);
            int den11 = (int)(den1 + den);
            int den2 = (int)((den11 * 12) - (den *12));
            System.out.println ("Денис теперь получает " + den11 + " рублей. Годовой доход вырос на " + den2 + " рублей.");
            int kris1 = (int)(kris * 0.1);
            int kris11 = (int)(kris1 + kris);
            int kris2 = (int)((kris11 * 12) - (kris *12));
            System.out.println ("Кристина теперь получает " + kris11 + " рублей. Годовой доход вырос на " + kris2 + " рублей.");
        }
}