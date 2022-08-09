package home_work_1;

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Какую единицу переводим байт или килобайт?"); // Запрашиваем единицу перевода
        String ask = in.nextLine();

        if (ask.equals("байт") || ask.equals("Байт")) { // Определение ввода пользователя и расчеты
            System.out.print("Введите количество " + ask + ": ");
            double num = in.nextDouble();

            String numOfKB = String.format("%.9f", num / 1024); // Так как при делении может получится большое число,
            // оставляем после запятой только 3 знака

            System.out.println(num + " " + ask + " это " + numOfKB + " килобайт");
        } else if (ask.equals("килобайт") || ask.equals("Килобайт")) {
            System.out.print("Введите количество " + ask + ": ");
            double num = in.nextDouble();

            System.out.println(num + " " + ask + "(а) " + " это " + num * 1024 + " байт");
        } else {
            System.out.println("Вы ввели неверную единицу!"); // Сработает если пользователь ввел неверную единицу
        }

        in.close();
    }
}
