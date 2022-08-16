package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        //sumOfNums();
        //maxNum();
        elemsLowerThanAvg();
        //twoMinElems();
        //arrComperssor();
        //sumAllNumbers();
    }

    public static void sumOfNums() {
        int[] array = ArraysUtils.arrayRandom(50, 100); // Получаем псевдослучайный массив
        System.out.println("Массив, полученный случайным образом: " + Arrays.toString(array));


        int sum = 0; // Переменная, в которую записывается сумма
        for (int elem : array) {
            if (elem >= 0) {
                if (elem % 2 == 0) { // Сумма четных положительных элементов массива
                    sum += elem;
                }
            }
        }

        System.out.println("Сумма положительных четных элементов массива: " + sum);
    }

    public static void maxNum() {
        int[] array = ArraysUtils.arrayRandom(50, 100); // Получаем псевдослучайный массив
        System.out.println("Массив, полученный случайным образом: " + Arrays.toString(array));

        int maxNum = 0; // Переменная, в которую записывается максимальный элемент
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] > maxNum) { // Записываем в переменную максимальный элемент с четным индексом
                maxNum = array[i];
            }
        }

        System.out.println("Максимальный из элементов массива с четными индексами: " + maxNum);
    }

    public static void elemsLowerThanAvg() {
        int[] array = ArraysUtils.arrayRandom(50, 100); // Получаем псевдослучайный массив
        System.out.println("Массив, полученный случайным образом: " + Arrays.toString(array));

        int avg = 0; // Переменная, которая будет хранить среднее арифметическое
        for (int i = 0; i < array.length; i += 2) {  // Расчет среднего арифметического
                avg += array[i];

        }
        avg /= array.length;

        String str = ""; // Строка, в которую будут записывать числа, которые меньше среднего арифметического
        for (int i = 0; i < array.length; i++) {
            if (array[i] < avg) {
                if (i == array.length - 1) {
                    str += array[i];
                } else {
                    str += array[i] + ", ";
                }
            }
        }

        System.out.println("Элементы массива меньше среднего арифметического(" + avg + "): " + str);
    }

    public static void twoMinElems() {
        int[] array = ArraysUtils.arrayRandom(50, 100); // Получаем псевдослучайный массив
        System.out.println("Массив, полученный случайным образом: " + Arrays.toString(array));

        int min1 = array[0]; // Переменные, в которых будут храниться минимальные значения
        int min2 = array[0];

        for (int i = 0; i < array.length; i++) { // Определение первого минимального значения
            if (min1 > array[i]) {
                min1 = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) { // Определение второго минимального значения, с учетом того, что такое число уже не находится в первой переменной
            if (min2 > array[i]) {
                if (array[i] != min1) {
                    min2 = array[i];
                }
            }
        }

        System.out.println("Первый наименьший элемент массива: " + min1 + ", второй наименьший элемент масиива: " + min2);
    }

    public static void arrComperssor() {
        int[] array = ArraysUtils.arrayRandom(50, 100); // Получаем псевдослучайный массив
        System.out.println("Массив, полученный случайным образом: " + Arrays.toString(array));

        Scanner in = new Scanner(System.in);

        System.out.print("Введите минимальное значение интервала: "); // Запрашиваем границы интервала
        int min = in.nextInt();
        System.out.print("Введите максимальное значение интервала: ");
        int max = in.nextInt();

        in.close();

        int[] arrCompressed = new int[50]; // Подготавливаем массив, который будет сжатой копией изначального

        int counterForAdded = 0; // Переменная счетчик
        for (int elem : array) {
            if (!(elem >= min && elem <= max)) { // Условия для добавления в сжатый массив элементов
                arrCompressed[counterForAdded] = elem;
                counterForAdded++;
            }
        }

        System.out.println("Сжатый массив: " + Arrays.toString(arrCompressed));
    }

    public static void sumAllNumbers() {
        int[] array = ArraysUtils.arrayRandom(50, 100); // Получаем псевдослучайный массив
        System.out.println("Массив, полученный случайным образом: " + Arrays.toString(array));


        int sum = 0; // Переменная, в которой будет храниться сумма

        for (int i = 0; i < array.length; i++) { // Для каждого элемента массива
            StringBuilder num = new StringBuilder(Integer.toString(array[i])); // Делаем объект класса StringBuilder с содержимым array[i], чтобы далее производить действия

            for (int j = 0; j < num.length(); j++) {
                sum += Integer.parseInt(Character.toString(num.charAt(j))); // Получаем каждую цифру числа и складываем
            }
        }

        System.out.println("Сумма всех цифр массива: " + sum);
    }
}
