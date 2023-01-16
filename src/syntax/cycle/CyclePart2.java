package syntax.cycle;

public class CyclePart2 {
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
        /*С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей
        при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        Результат программы должен быть выведен в консоль с тем количеством месяцев, которое необходимо
        для накопления данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей»*/
        System.out.println("Задача 1");

        int payment = 15_000;
        int balance = 0;
        int month = 0;

        while (balance < 2_459_000) {
            balance += payment;
            month++;
            System.out.printf("Месяц %d, сумма накоплений равна %,d рублей%n", month, balance);
        }
    }

    public static void task2() {
        /*Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        Не забудьте выполнить переход на новую строку между двумя циклами.
        В результате программы вывод должен получиться следующий:
        1 2 3 4 5 6 7 8 9 10
        10 9 8 7 6 5 4 3 2 1*/
        System.out.println("Задача 2");

        int i = 1;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void task3() {
        /*В стране Y население равно 12 миллионов человек.Рождаемость составляет 17 человек на 1000,
        смертность — 8 человек. Рассчитайте, какая численность населения будет через 10 лет, если
        показатели рождаемости и смертности постоянны. В консоль выведите результат операции на каждый
        год в формате: «Год …, численность населения составляет …»*/
        System.out.println("Задача 3");

        int population = 12_000_000;
        int newBornPer1000 = 17;
        int deathPer1000 = 8;
        int changePerYear = population * (newBornPer1000 - deathPer1000) / 1_000;

        for (int year = 1; year <= 10; year++) {
            population += changePerYear;
            System.out.printf("Год %d, численность населения составляет %,d%n", year, population);
        }
    }

    public static void task4() {
        /*Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада
        добавляется еще 7%. Первоначальная сумма вклада — 15 тысяч рублей. Вычислите и выведите в консоль,
        сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии,
        что процент банка от накоплений не меняется, а всегда равен 7%.
        Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.*/
        System.out.println("Задание 4");

        int goal = 12_000_000;
        double balance = 15_000;
        double interestRate = 7;
        int month = 0;

        while (balance < goal) {
            double interest = balance * interestRate / 100;
            balance += interest;
            month++;
            System.out.printf("Месяц %d, сумма накоплений равна %,.2f%n", month, balance);
        }
    }

    public static void task5() {
        /*Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только
        каждый шестой. Должны быть видны накопления за 6, 12, 18, 24-й и следующие месяцы*/
        System.out.println("Задача 5");

        int goal = 12_000_000;
        double balance = 15_000;
        double interestRate = 7;
        int month = 0;

        while (balance < goal) {
            double interest = balance * interestRate / 100;
            balance += interest;
            month++;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %,.2f%n", month, balance);
            }
        }
        //System.out.println("Для достижения цели потребуется " + month + " месяцев");
    }

    public static void task6() {
        /*Василий решил, что будет копить деньги ближайшие 9 лет. Он хочет знать, какой будет сумма его
        накоплений каждые полгода на протяжении этих 9 лет.
        Исходная сумма всё та же — 15 тысяч рублей, проценты банка – 7% ежемесячно.
        Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет*/
        System.out.println("Задание 6");

        int goalInYears = 9;
        int goalInMonth = goalInYears * 12;

        double balance = 15_000;
        double interestRatePerMonth = 7;
        int month = 0;

        while (month < goalInMonth) {
            double interest = balance * interestRatePerMonth / 100;
            balance += interest;
            month++;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d,сумма накоплений равна %,.2f%n", month, balance);
            }
        }
    }

    public static void task7() {
        /*В компании пятница — отчетный день.
        Нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница, и
        выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        «Сегодня пятница, ...-е число. Необходимо подготовить отчет».
        В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений с напоминаниями
        по разным датам.*/
        System.out.println("Задание 7");

        int friday = 3;

        for (int date = 1; date <= 31; date++) {
            if (date % 7 == friday) {
                System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8() {
        /*Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.
        Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
        В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий
        год ее появления (ближайшие 100 лет).
        Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет
        до текущего (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения
        периода расчета.
        В результате решения задачи в консоли должен получиться следующий результат:
        1896
        1975
        2054*/
        System.out.println("Задание 8");
        int from = 2023 - 200;
        int to = 2023 + 100;
        for (int year = 0; year <= to; year += 79) {
            if (year >= from) {
                System.out.println(year);
            }
        }
    }
}
