package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ForEachOperation implements IArraysOperation { // Класс ForEachOperation реализует интерфейс IArraysOperation
    public static void main(String[] args) {
        IArraysOperation print = new ForEachOperation(); // Переменная типа IArraysOperation указывает на объект ForEachOperation

        int[] array = ArraysUtils.arrayFromConsole(); // Получаем массив и записываем его в переменную

        //print.arrToConsole(array);
        //print.everySecondElem(array);
        //print.reversedElems(array);
    }

    public void arrToConsole(int[] array) {
        for (int elem : array) { // Выводим каждый элемент в консоль
            System.out.println(elem);
        }
    }

    public void everySecondElem(int[] array) {
        int i = 1; // Переменная счетчик

        for (int elem : array) {
            if (i % 2 == 0) { // Выводим каждый второй элемент
                System.out.println(elem);
                i++;
            } else {
                i++;
            }
        }
    }

    public void reversedElems(int[] array) {
        String str = ""; // Переменная, которая будет использоваться для вывода в обратном порядке

        for (int elem : array) {
            if (array[array.length - 1] != elem) { // Проверка, последний ли элемент в массиве
                str += elem + "\n";
            } else {
                str += elem;
            }
        }

        StringBuilder reversedStr = new StringBuilder(str).reverse(); // Разворачивание строки

        System.out.println(reversedStr);
    }
}
