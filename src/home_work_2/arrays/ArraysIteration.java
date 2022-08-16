package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {
    public static void main(String[] args) {
        // arrToConsole();
        // everySecondElem();
        // reversedElems();
    }

    public static void arrToConsole() {
        int[] array = ArraysUtils.arrayFromConsole(); // Получаем массив

        for (int i = 0; i < array.length; i++) { // Вывод каждого элемента в консоль
            System.out.println(array[i]);
        }
    }

    public static void everySecondElem() {
        int[] array = ArraysUtils.arrayFromConsole(); // Получаем массив

        for (int i = 1; i < array.length; i += 2) { // Вывод каждого второго элемента в консоль
            System.out.println(array[i]);
        }
    }

    public static void reversedElems() {
        int[] array = ArraysUtils.arrayFromConsole(); // Получаем массив

        for (int i = array.length - 1; i >= 0; i--) { // Выводим элементы в консоль, начиная с конца
            System.out.println(array[i]);
        }
    }
}
