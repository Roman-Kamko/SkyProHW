package syntax.variables;

public class VariablesPart1 {
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
        /*Необходимо присвоить переменным разные значения. Для решения этой
        задачи используйте тип переменной var.
        В программе IDEA в новом созданном вами проекте присвойте:
        переменной dog значение 8.0;
        переменной cat значение 3.6;
        переменной paper значение 763789.
        Выведите значения каждой переменной в консоль.*/
        System.out.println("Задание 1");

        var dog = 8.0;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763_789;
        System.out.println(paper);
    }

    public static void task2() {
        /*Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4.
        Для решения этой задачи используйте тип переменной var.
        Выведите в консоль новые значения переменных.*/
        System.out.println("Задание 2");

        var dog = 8.0;
        dog += 4;
        System.out.println(dog);

        var cat = 3.6;
        cat += 4;
        System.out.println(cat);

        var paper = 763_789;
        paper += 4;
        System.out.println(paper);
    }

    public static void task3() {
        /*Теперь нужно уменьшить значение каждой переменной:
        dog уменьшить на 3,5;
        cat уменьшить на 1,6;
        paper уменьшить на 7639.
        Выведите в консоль новые значения переменных. Для решения этой задачи используйте
        тип переменной var.*/
        System.out.println("Задание 3");

        var dog = 8.0;
        dog -= 3.5;
        System.out.println(dog);

        var cat = 3.6;
        cat -= 1.6;
        System.out.println(cat);

        var paper = 763_789;
        paper -= 7639;
        System.out.println(paper);
    }

    public static void task4() {
        /*Инициализируйте (присвойте значение) переменную friend значением 19.
        Увеличьте значение переменной на 2, после чего поделите значение на 7.
        После каждой операции выводите значение переменной в консоль. В итоге у вас должно
        быть выведено 3 значения одной переменной.
        Для решения этой задачи используйте тип переменной var.*/
        System.out.println("Задание 4");

        var friend = 19;
        System.out.println(friend);

        friend += 2;
        System.out.println(friend);

        friend /= 7;
        System.out.println(friend);
    }

    public static void task5() {
        /*Инициализируйте переменную frog значением 3,5.
        Увеличьте переменную в 10 раз и поделите на 3,5. Добавьте к последнему значению
        переменной 4.
        После каждой операции выводите значение переменной в консоль. В итоге у вас должно
        быть выведено 4 значения одной переменной.
        Для решения этой задачи используйте тип переменной var.*/
        System.out.println("Задание 5");

        var frog = 3.5;
        System.out.println(frog);

        frog *= 10;
        System.out.println(frog);

        frog /= 3.5;
        System.out.println(frog);

        frog += 4;
        System.out.println(frog);
    }

    public static void task6() {
        /*В боксе перед каждым боем спортсменов взвешивают. Это делают для того, чтобы убедиться,
        что боксеры соответствуют своей весовой категории и бой будет честным.
        Вес одного боксера — 78,2 кг.
        Вес второго боксера — 82,7 кг.
        Подсчитайте и выведите в консоль общий вес двух бойцов.
        Подсчитайте и выведите в консоль разницу между весами бойцов. Для решения этой задачи
        используйте тип переменной var.*/
        System.out.println("Задание 6");

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух боксеров " + totalWeight + " кг.");

        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе составляет " + differenceWeight + " кг.");
    }

    public static void task7() {
        /*Вычислите разницу весов спортсменов, используйте 2 способа:
        Вычитание из большего веса меньшего.
        С помощь функции остаток от деления.
        Для решения этой задачи используйте тип переменной var.*/
        System.out.println("Задание 7");

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        var differentWeightWay1 = secondBoxerWeight - firstBoxerWeight;
        System.out.println(differentWeightWay1);

        var differentWeightWay2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println(differentWeightWay2);
    }

    public static void task8() {
        /*Решите задачу с помощью функций сложения, вычитания, умножения и деления.
        640 часов работы поделено между сотрудниками. Если каждый сотрудник посвящает работе 8
        часов, то сколько всего работников в компании? Выведите результат задачи в консоль в формате:
        «Всего работников в компании — … человек».
        Посчитайте, сколько часов работы должно быть поделено между сотрудниками, если в компании
        работает на 94 человека больше. Выведите результат задачи в консоль в формате: «Если в
        компании работает … человек, то всего … часов работы может быть поделено между сотрудниками».
        Для решения этой задачи используйте тип переменной var.*/
        System.out.println("Задание 8");

        var totalWorkHours = 640;
        var workHoursPerWorker = 8;

        var totalWorkers = totalWorkHours / workHoursPerWorker;
        System.out.println("Всего работников в компании — " + totalWorkers + " человек.");

        totalWorkers += 94;
        totalWorkHours = totalWorkers * workHoursPerWorker;
        System.out.println("Если в компании работает " + totalWorkers + " человек, то всего " + totalWorkHours + " часов работы может быть поделено между сотрудниками.");
    }
}
