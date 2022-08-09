package home_work_1;

import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите год: "); // Запрашиваем год
        int year = in.nextInt();

        in.close();

        if (year % 4 != 0) { // Условия проверки введенного года
            System.out.println("Год " + year + " является обычным.");
        } else if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("Год " + year + " является високосным.");
            } else {
                System.out.println("Год " + year + " является обычным.");
            }
        } else {
            System.out.println("Год " + year + " является високосным.");
        }
    }
}
