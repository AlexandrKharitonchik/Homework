package home_work_2.loops;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        boolean NaNForFirst = false; // Переменные для проверок
        boolean NaNForSecond = false;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возводимое число: ");
        String strNum1 = in.nextLine();
        System.out.print("Введите степень: ");
        String strNum2 = in.nextLine();

        in.close();

        try { // Проверки на правильность ввода
            Double.parseDouble(strNum2);
        } catch (NumberFormatException e) {
            NaNForSecond = true;
        }

        try {
            Double.parseDouble(strNum1);
        } catch (NumberFormatException e) {
            NaNForFirst = true;
        }

        if (NaNForFirst) {
            System.out.println("Возводимое не является числом!");
        } else if (NaNForSecond) {
            System.out.println("Степень не является числом!");
        } else if (Double.parseDouble(strNum2) % 1 != 0) {
            System.out.println("Степень должна быть целым числом!");
        } else if (Integer.parseInt(strNum2) < 0) {
            System.out.println("Степень должна быть больше нуля!");
        } else {
            double num1 = Double.parseDouble(strNum1);
            int num2 = Integer.parseInt(strNum2);

            // Вычисления
            if (num1 < 0) {
                if (num2 % 2 == 0) {
                    num1 *= -1;
                    double num1Copy = num1;

                    for (int i = 1; i < num2; i++) {
                        num1 *= num1Copy;
                    }

                    System.out.println("-" + num1Copy + " ^ " + num2 + " = " + num1);
                } else {
                    double num1Copy = num1;

                    for (int i = 1; i < num2; i++) {
                        num1 *= num1Copy;
                    }

                    System.out.println(num1Copy + " ^ " + num2 + " = " + num1);
                }
            } else {
                double num1Copy = num1;

                for (int i = 1; i < num2; i++) {
                    num1 *= num1Copy;
                }

                System.out.println(num1Copy + " ^ " + num2 + " = " + num1);
            }
        }
    }
}
