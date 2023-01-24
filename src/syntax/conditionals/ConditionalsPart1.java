package syntax.conditionals;

public class ConditionalsPart1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        /*С помощью условного оператора напишите программу, которая выводит в консоль:
        сообщение о том, что человеку 18 или больше лет;
        сообщение, что возраст совершеннолетия еще не наступил и нужно немного подождать.
        При выполнении каждого условия программа должна выводить в консоль сообщение в формате:
        «Если возраст человека равен …, то (вывести в зависимости от результата) он
        совершеннолетний / он не достиг совершеннолетия, нужно немного подождать».*/

        int adult = 18;
        int age = 32;

        if (age >= adult) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        /*Человек одевается в зависимости от температуры воздуха. Напишите программу, которая
        выводит сообщение: «На улице холодно, нужно надеть шапку» — если температура ниже 5 градусов.
        «Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.
        При выполнении каждого условия выведите в консоль: «На улице … градусов, (вывести в
        зависимости от результата) нужно надеть шапку / можно идти без шапки».*/

        int conditionalTemperature = 5;
        int currentTemperature = -10;

        if (currentTemperature >= conditionalTemperature) {
            System.out.println("На улице " + currentTemperature + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + currentTemperature + " градусов, нужно надеть шапку.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        /*За превышение скорости водителю могут выписать штраф. Напишите программу, которая сообщает
        водителю о том, что: скорость превышена, если она больше 60 км/ч;
        превышения скорости нет, если она меньше 60 км/ч.
        При выполнении каждого условия программа должна выводить такое сообщение: «Если скорость …,
        то (вывести в зависимости от результата) придется заплатить штраф / можно ездить спокойно».*/

        int conditionalSpeed = 60;
        int currentSpeed = 59;

        if (currentSpeed > conditionalSpeed) {
            System.out.println("Если скорость " + currentSpeed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + currentSpeed + ", то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        /*Напишите программу, которая помогает определить, в какое учреждение нужно отправить человека в
        зависимости от его возраста:
        Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.
        Если человеку от 7 до 18 лет, то ему нужно ходить в школу.
        Если человеку больше 18 лет, но меньше 24, то его место в университете.
        А если человеку больше 24, то ему пора ходить на работу.
        При выполнении каждого условия программа должна выводить в консоль сообщение в формате: «Если
        возраст человека равен …, то ему нужно ходить … (в зависимости от возраста дописать нужное)».*/

        int age = 32;

        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        } else if (age > 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        /*Как правило, на аттракционах действуют ограничения для детей по возрасту:
        Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
        Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого.
        Если взрослого нет, то кататься нельзя.
        Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        Напишите программу, которая выводит в консоль сообщение в формате: «Если возраст ребенка равен …,
        то ему … (в зависимости от возраста дописать нужное: нельзя кататься на аттракционе, можно кататься
        на аттракционе в сопровождении / без сопровождения взрослого)».*/

        int age = 32;

        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        /*Вместимость одного вагона поезда — 102 человека. Вагон рассчитан на 60 сидячих мест, все остальные
        — стоячие. С помощью условного оператора и конструкции else напишите программу, которая выводит в
        консоль сообщение о том, есть ли место в вагоне, сидячее или стоячее, или вагон уже полностью забит.*/

        int totalCapacity = 102;
        int seatingCapacity = 60;
        int standingCapacity = totalCapacity - seatingCapacity;

        int seatingPassengers = 58;
        int standingPassengers = 40;
        int totalPassengers = seatingPassengers + standingPassengers;

        if (totalPassengers <= totalCapacity) {
            System.out.println("В вагоне есть места, сидячих мест " + (seatingCapacity - seatingPassengers) + ", стоячих мест " + (standingCapacity - standingPassengers));
        } else {
            System.out.println("Вагон уже полностью забит.");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        /*Даны три числа:
        int one;
        int two;
        int three;
        С помощью условного оператора и конструкции else напишите программу, которая вычисляет, какое из трех
        чисел бо́льшее, и выводит результат в консоль.*/

        int one = 6;
        int two = 6;
        int three = 6;

        if (one > two) {
            if (one > three) {
                System.out.println(one);
            } else {
                System.out.println(three);
            }
        } else if (two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}