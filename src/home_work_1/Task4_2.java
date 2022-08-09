package home_work_1;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(); // Вводятся 3 числа
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();

        if (b > a && b < c || b > c && b < a) { // Проверка чисел
            System.out.println(b + " среднее");
        } else if (a > b && a < c || a > c && a < b) {
            System.out.println(a + " среднее");
        } else {
            System.out.println(c + " среднее");
        }
    }
}
