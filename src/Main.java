public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

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
}