package syntax.cycle;

public class CyclePart1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        // С помощью цикла for выведите в консоль все числа от 1 до 10
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        // С помощью цикла for выведите в консоль все числа от 10 до 1
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        // Выведите в консоль все четные числа от 0 до 17
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        // Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        /* Напишите программу, которая выводит в консоль все високосные года,
           начиная с 1904 года до 2096. В консоль результат должен выводиться
           в формате: «… год является високосным» */
        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        /* Напишите программу, которая выводит в консоль последовательность чисел:
           7 14 21 28 35 42 49 56 63 70 77 84 91 98 */
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task7() {
        /* Напишите программу, которая выводит в консоль последовательность чисел:
           1 2 4 8 16 32 64 128 256 512 */
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task8() {
        /* Посчитайте с помощью цикла for сумму годовых накоплений,
           если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
           Выведите сумму накоплений за каждый месяц в консоль
           в формате: «Месяц …, сумма накоплений равна … рублей» */
        System.out.println("Задание 8");
        int deposit = 29_000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        /* Перепишите решение задачи выше при условии, что деньги вы откладывать
           будете не «в банку», а в банк под проценты — 12% годовых. Выведите
           сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма
           накоплений равна … рублей» */
        System.out.println("Задание 9");
        double payment = 29_000;
        double balance = 0;
        double interestRate = 1;

        for (int i = 1; i <= 12; i++) {
            balance += payment;
            double interest = balance*interestRate/100;
            balance += interest;
            System.out.printf("Месяц %d, сумма накоплений равна %,.2f рублей%n", i, balance);
        }
    }

    public static void task10() {
        /* Напишите программу, которая выводит в консоль таблицу умножения на 2:
           2*1=2
           2*2=4
           2*3=6
           2*4=8
           2*5=10
           2*6=12
           2*7=14
           2*8=16
           2*9=18
           2*10=20 */
        System.out.println("Задание 10");
        for (int i = 1; i <= 10; i++) {
            int num = 2;
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}
