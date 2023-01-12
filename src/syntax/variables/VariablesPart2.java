package syntax.variables;

public class VariablesPart2 {
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
        /*Объявите переменные типа int, byte, short, long, float, double.
        Название переменных может быть любым, но если состоит из двух слов и более,
        должно соответствовать правилу camelCase.
        Выведите в консоль значение каждой переменной в формате
        «Значение переменной … с типом … равно …».*/
        System.out.println("Задача 1");

        int intValue = 2_000_000;
        System.out.printf("Значение переменной intValue с типом int равно %,d%n", intValue);

        byte byteValue = 126;
        System.out.println("Значение переменной byteValue с типом byte равно " + byteValue);

        short shortValue = 250;
        System.out.println("Значение переменной shortValue с типом short равно " + shortValue);

        long longValue = 8_000_000_000L;
        System.out.printf("Значение переменной longValue с типом long равно %,d%n", longValue);

        float floatValue = 1.123_321F;
        System.out.println("Значение переменной floatValue с типом float равно " + floatValue);

        double doubleValue = 2.234_123_432;
        System.out.println("Значение переменной doubleValue с типом double равно " + doubleValue);
    }

    public static void task2() {
        /*Ниже дан список различных значений. Инициализируйте переменные, используйте
        изученные ранее типы переменных. Значения:
        27.12
        987 678 965 549
        2,786
        569
        -159
        27897
        67*/
        System.out.println("Задача 2");

        float floatValue = 27.12F;
        System.out.println(floatValue);

        long longValue = 987_678_965_549L;
        System.out.println(longValue);

        double doubleValue = 2.786;
        System.out.println(doubleValue);

        char charValue = 569;
        System.out.println(charValue);

        short shortValue = -159;
        System.out.println(shortValue);

        int intValue = 27897;
        System.out.println(intValue);

        byte byteValue = 67;
        System.out.println(byteValue);
    }

    public static void task3() {
        /*Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна,
        ведут три класса. У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников,
        у Екатерины Андреевны — 30 учеников. Три учительницы закупили все вместе 480 листов
        бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
        Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
        Для объявления переменных не используйте тип var.*/
        System.out.println("Задача 3");

        int totalPaper = 480;
        int pupilsInFirstClass = 23;
        int pupilsInSecondClass = 27;
        int pupilsInThirdClass = 30;

        int totalPupils = pupilsInFirstClass + pupilsInSecondClass + pupilsInThirdClass;
        int paperPerPupil = totalPaper / totalPupils;
        System.out.println("На каждого ученика рассчитано " + paperPerPupil + " листов бумаги");
    }

    public static void task4() {
        /*Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность
        машины будет: за 20 минут, в сутки, за 3 дня, за 1 месяц? Рассчитывайте продолжительность работы
        машины в том случае, если она работает без перерыва заданный промежуток времени. Результаты подсчетов
        выведите в консоль в формате: «За … машина произвела … штук бутылок».
        Для объявления переменных не используйте тип var.*/
        System.out.println("Задача 4");


    }

    public static void task5() {
        System.out.println("Задача 5");
    }

    public static void task6() {
        System.out.println("Задача 6");
    }

    public static void task7() {
        System.out.println("Задача 7");
    }

    public static void task8() {
        System.out.println("Задача 8");
    }
}
