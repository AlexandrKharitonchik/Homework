package home_work_2.utils;

import java.util.Scanner;
import java.util.Random;

public class ArraysUtils {
    public static int[] arrayFromConsole() { // Метод получения массива через консоль, задавая длину и элементы через запятую
        Scanner in = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int len = in.nextInt();

        in.nextLine();

        System.out.print("Введите элементы массива по порядку через запятую: ");
        String str = in.nextLine();

        in.close();

        String[] arrStr = str.split(", ");

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        return arr;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) { // Формирование псевдослучайного массива
        Random rand = new Random();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(maxValueExclusion);
        }

        return array;
    }
}
