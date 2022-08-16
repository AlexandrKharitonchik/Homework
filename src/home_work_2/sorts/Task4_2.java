package home_work_2.sorts;

import java.util.Arrays;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

public class Task4_2 {
    public static void main(String[] args) { // Тест методов сортировки
        int[] arr1 = new int[]{1,2,3,4,5,6},
                arr2 = new int[]{1,1,1,1},
                arr3 = new int[]{9,1,5,99,9,9},
                arr4 = new int[]{},
                arr5 = new int[]{6,5,4,3,2,1};

        System.out.print(Arrays.toString(arr1) + " -> ");
        SortsUtils.bubble(arr1);

//        System.out.print(Arrays.toString(arr1) + " -> ");
//        SortsUtils.shake(arr1);

        System.out.println("\n");

        System.out.print(Arrays.toString(arr2) + " -> ");
        SortsUtils.bubble(arr2);

//        System.out.print(Arrays.toString(arr2) + " -> ");
//        SortsUtils.shake(arr2);

        System.out.println("\n");

        System.out.print(Arrays.toString(arr3) + " -> ");
        SortsUtils.bubble(arr3);

//        System.out.print(Arrays.toString(arr3) + " -> ");
//        SortsUtils.shake(arr3);

        System.out.println("\n");

        System.out.print(Arrays.toString(arr4) + " -> ");
        SortsUtils.bubble(arr4);

//        System.out.print(Arrays.toString(arr4) + " -> ");
//        SortsUtils.shake(arr4);

        System.out.println("\n");

        System.out.print(Arrays.toString(arr5) + " -> ");
        SortsUtils.bubble(arr5);

//        System.out.print(Arrays.toString(arr5) + " -> ");
//        SortsUtils.shake(arr5);

        System.out.println("\n");

        int[] arrRand = ArraysUtils.arrayRandom(50, 100);

        System.out.print(Arrays.toString(arrRand) + " -> ");
//        SortsUtils.bubble(arrRand);
        SortsUtils.shake(arrRand);

        System.out.println("\n");

        int[] arrConsole = ArraysUtils.arrayFromConsole();
        System.out.print(Arrays.toString(arrConsole) + " -> ");
//        SortsUtils.bubble(arrConsole);
        SortsUtils.shake(arrConsole);
    }
}
