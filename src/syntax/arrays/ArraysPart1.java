package syntax.arrays;

import java.util.Arrays;

public class ArraysPart1 {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        /*Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.

        Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните
        значениями.

        Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ
        создания массива: с помощью ключевого слова или сразу заполненный элементами.*/

        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;

        double[] weight = {1.57, 7.654, 9.986};

        int[] random = new int[4];
        random[0] = 200;
        random[1] = -100;
        random[2] = 8_000;
        random[3] = 10;

        System.out.println("Задача 2");
        /*Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце
        строки запятую ставить не надо.*/

        for (int index = 0; index < num.length; index++) {
            if (index == num.length - 1) {
                System.out.println(num[index]);
                break;
            }
            System.out.print(num[index] + ", ");
        }

        for (int index = 0; index < weight.length; index++) {
            if (index == weight.length - 1) {
                System.out.println(weight[index]);
                break;
            }
            System.out.print(weight[index] + ", ");
        }

        for (int index = 0; index < random.length; index++) {
            if (index == random.length - 1) {
                System.out.println(random[index]);
                break;
            }
            System.out.print(random[index] + ", ");
        }

        System.out.println("Задача 3");
        /*Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        В конце строки запятую ставить не надо.*/

        for (int index = num.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(num[index]);
                break;
            }
            System.out.print(num[index] + ", ");
        }

        for (int index = weight.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(weight[index]);
                break;
            }
            System.out.print(weight[index] + ", ");
        }

        for (int index = random.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(random[index]);
                break;
            }
            System.out.print(random[index] + ", ");
        }

        System.out.println("Задача 4");
        /*Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        Распечатайте результат преобразования в консоль.*/

        for (int index = 0; index < num.length; index++) {
            if (num[index] % 2 != 0) {
                num[index] += 1;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}