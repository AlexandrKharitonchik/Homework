package home_work_1;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите делимое: "); // Ввод чисел
        int a = in.nextInt();
        System.out.print("Введите делитель: ");
        int b = in.nextInt();

        in.close();

        if (a % b != 0) { // Проверка чисел
            System.out.println("Число " + a + " не делится на число " + b + " без остатка.");
            System.out.println("Частное = " + a / b);
            System.out.println("Остаток от деления = " + a % b);
        } else {
            System.out.println("Число " + a + " делится на число " + b + " без остатка.");
            System.out.println("Частное = " + a / b );
        }
    }
}
