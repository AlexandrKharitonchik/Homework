package home_work_2.utils;

import java.util.Arrays;

public class SortsUtils {
    public static void bubble(int[] arr) { // Пузырьковая сортировка
        int buffer; // Переменная буфер
        boolean isSorted = false; // Переменная, которая говорит отсортировался ли массив

        while(!isSorted) { // Сортировка
            isSorted = true;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    buffer = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buffer;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void shake(int[] arr) { // Шейкерная сортировка
        int buffer; // Переменная буфер
        boolean isSorted = false; // Переменная, которая говорит отсортировался ли массив
        int right = 0; // Направление движения
        int left = 1;

        while(!isSorted) { // Сортировка
            isSorted = true;

            if (right > left) {
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        isSorted = false;
                        buffer = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = buffer;
                    }
                }
                right--;
                left++;
            } else {
                for (int i = arr.length - 1; i > 0; i--) {
                    if (arr[i] < arr[i - 1]) {
                        isSorted = false;
                        buffer = arr[i - 1];
                        arr[i - 1] = arr[i];
                        arr[i] = buffer;
                    }
                }
                right++;
                left--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
