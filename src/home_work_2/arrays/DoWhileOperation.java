package home_work_2.arrays;


import home_work_2.utils.ArraysUtils;

public class DoWhileOperation implements IArraysOperation { // Класс DoWhileOperation реализует интерфейс IArraysOperation
    public static void main(String[] args) {
        IArraysOperation print = new DoWhileOperation(); // Переменная типа IArraysOperation указывает на объект DoWhileOperation

        int[] array = ArraysUtils.arrayFromConsole(); // Получаем массив и записываем его в переменную

        // print.arrToConsole(array);
        // print.everySecondElem(array);
        // print.reversedElems(array);
    }

    public void arrToConsole(int[] array) {
        int i = 0; // Переменная счетчик

        do {
            System.out.println(array[i]); // Выводим каждый элемент в консоль, пока i < длины массива
            i++;
        } while (i < array.length);
    }

    public void everySecondElem(int[] array) {
        int i = 1; // Переменная счетчик

        do {
            System.out.println(array[i]); // Выводим каждый второй элемент, пока i < длины массива
            i += 2;
        } while (i < array.length);
    }

    public void reversedElems(int[] array) {
        int i = array.length - 1; // Переменная счетчик

        do {
            System.out.println(array[i]); // Выводим элементы, начиная с конца, пока i > 0
            i--;
        } while (i >= 0);
    }
}
