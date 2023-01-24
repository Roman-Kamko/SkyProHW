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

        int bottlePer2Minutes = 16;

        int bottlePer20Minutes = bottlePer2Minutes * 10;
        System.out.println("За 20 минут машина произвела " + bottlePer20Minutes + " штук бутылок");

        int bottlePerDay = bottlePer20Minutes * 3 * 24;
        System.out.println("За день машина произвела " + bottlePerDay + " штук бутылок");

        int bottlePer3Day = bottlePerDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlePer3Day + " штук бутылок");

        int bottlePerMonth = bottlePer3Day * 10;
        System.out.println("За месяц машина произвела " + bottlePerMonth + " штук бутылок");
    }

    public static void task5() {
        /*На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит
        2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
        Выведите результат задачи в консоль в формате:
        «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
        Для объявления переменных не используйте тип var.*/
        System.out.println("Задача 5");

        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;

        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски.");
    }

    public static void task6() {
        /*Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
        Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        Бананы — 5 штук (1 банан — 80 грамм).
        Молоко — 200 мл (100 мл = 105 грамм).
        Мороженое-пломбир — 2 брикета по 100 грамм.
        Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        Смешать всё в блендере — и готово.
        Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
        Результат в граммах и килограммах напечатайте в консоль.*/
        System.out.println("Задача 6");

        int bananasCount = 5;
        int bananaWeight = 80;
        int milkCount = 2;
        int milkWeight = 105;
        int iceCreamCount = 2;
        int iceCreamWeight = 100;
        int egsCount = 4;
        int egsWeight = 70;

        int totalBananasWeight = bananasCount * bananaWeight;
        int totalMilkWeight = milkCount * milkWeight;
        int totalIceCreamWeight = iceCreamCount * iceCreamWeight;
        int totalEgsWeight = egsCount * egsWeight;

        int totalBreakfastWeightInGram = totalBananasWeight + totalMilkWeight + totalIceCreamWeight + totalEgsWeight;
        double totalBreakfastWeightInKg = totalBreakfastWeightInGram / 1_000.0;

        System.out.println("Вес завтрака спортсмена " + totalBreakfastWeightInGram + " грамм, или " + totalBreakfastWeightInKg + " кг.");
    }

    public static void task7() {
        /*Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно
        сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500
        грамм в день.
        Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм,
        а сколько — если каждый день будет худеть на 500 грамм.
        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        Результаты всех подсчетов выведите в консоль.*/
        System.out.println("Задача 7");

        int minWeightLossPerDay = 250;
        int maxWeightLossPerDay = 500;
        int needWeightLossInKg = 7;

        int needWeightLossInGram = needWeightLossInKg * 1_000;
        int minDayCount = needWeightLossInGram / maxWeightLossPerDay;
        int maxDayCount = needWeightLossInGram / minWeightLossPerDay;

        double averageWeightLossPerDay = (minWeightLossPerDay + maxWeightLossPerDay) / 2.0;
        double averageDayCount = needWeightLossInGram / averageWeightLossPerDay;

        System.out.println("Если спортсмен будет терять " + minWeightLossPerDay + " грамм ежедневно, то на потерю " + needWeightLossInKg + " кг веса ему потребуется " + maxDayCount + " дней.");
        System.out.println("Если спортсмен будет терять " + maxWeightLossPerDay + " грамм ежедневно, то на потерю " + needWeightLossInKg + " кг веса ему потребуется " + minDayCount + " дней.");
        System.out.printf("В среднем на потерю %d кг веса, спортсмен потратит %.1f дней.%n", needWeightLossInKg, averageDayCount);
    }

    public static void task8() {
        /*Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
        В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому
        сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год
        повышение составляет 10% от текущей зарплаты.
        К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для
        следующих сотрудников:
        Маша получает 67 760 рублей в месяц.
        Денис получает 83 690 рублей в месяц.
        Кристина получает 76 230 рублей в месяц.
        Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать
        разницу между годовым доходом с нынешней зарплатой и после повышения.
        Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        Выведите в консоль информацию по каждому сотруднику. Например:
        «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».*/
        System.out.println("Задача 8");

        int indexSalaryInPercent = 10;

        double mashaSalary = 67_760;

        double newMashaSalary = mashaSalary + mashaSalary * indexSalaryInPercent / 100;
        double newMashaSalaryPerYear = newMashaSalary * 12;
        double mashaSalaryPerYear = mashaSalary * 12;
        double mashaDifferenceSalary = newMashaSalaryPerYear - mashaSalaryPerYear;
        System.out.printf("Маша теперь получает %,.2f рублей. Годовой доход вырос на %,.2f рублей.%n", newMashaSalary, mashaDifferenceSalary);

        double denisSalary = 83_690;

        double newDenisSalary = denisSalary + denisSalary * indexSalaryInPercent / 100;
        double denisSalaryPerYear = denisSalary * 12;
        double newDenisSalaryPerYear = newDenisSalary * 12;
        double denisDifferenceSalary = newDenisSalaryPerYear - denisSalaryPerYear;
        System.out.printf("Денис теперь получает %,.2f рублей. Годовой доход вырос на %,.2f рублей.%n", newDenisSalary, denisDifferenceSalary);

        double kristinaSalary = 76_230;

        double newKristinaSalary = kristinaSalary + kristinaSalary * indexSalaryInPercent / 100;
        double kristinaSalaryPerYear = kristinaSalary * 12;
        double newKristinaSalaryPerYear = newKristinaSalary * 12;
        double kristinaDifferenceSalary = newKristinaSalaryPerYear - kristinaSalaryPerYear;
        System.out.printf("Кристина теперь получает %,.2f рублей. Годовой доход вырос на %,.2f рублей.%n", newKristinaSalary, kristinaDifferenceSalary);

    }
}
