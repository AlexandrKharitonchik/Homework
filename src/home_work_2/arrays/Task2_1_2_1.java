package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

public class Task2_1_2_1 {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayRandom(5, 100); // Проверка метода arrayRandom()
        System.out.println(Arrays.toString(container));
    }
}
