package home_work_2.loops;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean NaN = false; // Переменные для работы
        long a = 1;

        System.out.println("На что умножаем?");
        String numStr = in.nextLine();

        in.close();

        try { // Проверки на правильность ввода
            Double.parseDouble(numStr);
        } catch (NumberFormatException e) {
            NaN = true;
        }
        if (NaN) {
            System.out.println("Вы ввели не число!");
        } else if (Double.parseDouble(numStr) % 1 != 0) {
            System.out.println("Число должно быть целым!");
        } else {
            int num = Integer.parseInt(numStr);

            while (true) { // Умножение
                if (a * num == 0) {
                    System.out.println("До переполнения: " + a);
                    System.out.println("После переполнения: " + a * num);
                    break;
                }

                a *= num;
                System.out.println(a);
            }
        }
    }
}
