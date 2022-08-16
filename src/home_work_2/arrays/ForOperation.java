package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ForOperation implements IArraysOperation { // Класс ForOperation реализует интерфейс IArraysOperation
    public static void main(String[] args) {
        IArraysOperation print = new ForOperation(); // Переменная типа IArraysOperation указывает на объект ForOperation

        int[] array = ArraysUtils.arrayFromConsole(); // Получаем массив и записываем его в переменную

//        print.arrToConsole(array);
//        print.everySecondElem(array);
//        print.reversedElems(array);
    }

    public void arrToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) { // Вывод каждого элемента в консоль
            System.out.println(array[i]);
        }
    }

    public void everySecondElem(int[] array) {
        for (int i = 1; i < array.length; i += 2) { // Выводим каждый второй элемент
            System.out.println(array[i]);
        }
    }

    public void reversedElems(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) { // Выводим элементы в консоль, начиная с конца
            System.out.println(array[i]);
        }
    }
}
