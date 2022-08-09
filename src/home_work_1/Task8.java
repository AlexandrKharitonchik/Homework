package home_work_1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число от -128 до 127: ");
        byte a = in.nextByte();

        in.close();

        System.out.println(toBinaryString(a));
    }

    public static String toBinaryString(byte number) {
        String binNumStr = ""; // Объявление необходимых в процессе переменных
        StringBuilder binNumStrReversedBuilder = new StringBuilder(binNumStr);
        String binNumStrReversed = "";


        if (number >= 0) { // Если число пользователя >= 0
            while (number > 0) {
                if (number % 2 != 0) { // Преобразование в двоичный код
                    binNumStr += "1";
                    number /= 2;
                } else {
                    binNumStr += "0";
                    number /= 2;
                }
            }

            while (binNumStr.length() < 8) { // Добавление необходимых нулей до 8 бит
                binNumStr += "0";
            }

            binNumStrReversedBuilder = new StringBuilder(binNumStr).reverse(); // Т.к. все числа добавлялись
            // к концу, строку необходимо ее развернуть

            binNumStrReversed = binNumStrReversedBuilder.toString(); // Переменная, которая используется в конце метода
            // после конструкции return. В нее заносится прямой код.

        } else { // Код, который выполняется, если число пользователя меньше 0
            number *= -1; // Сначала делаем прямой код

            while (number > 0) { // Преобразование в двоичный код
                if (number % 2 != 0) {
                    binNumStr += "1";
                    number /= 2;
                } else {
                    binNumStr += "0";
                    number /= 2;
                }
            }

            while (binNumStr.length() < 8) { // Добавление необходимых нулей
                binNumStr += "0";
            }

            binNumStrReversedBuilder = new StringBuilder(binNumStr).reverse(); // Приводим к правильному виду

            for (int i = 0; i < binNumStrReversedBuilder.length(); i++) { // Инвертируем наш двоичный код
                if (binNumStrReversedBuilder.charAt(i) == '0') {  // Создаем обратный код
                    binNumStrReversedBuilder.setCharAt(i, '1');
                } else {
                    binNumStrReversedBuilder.setCharAt(i, '0');
                }
            }

            // Создаем наш дополнительный код, путем добавления 1 к концу
            if (binNumStrReversedBuilder.charAt(binNumStrReversedBuilder.length() - 1) == '1') {
                binNumStrReversedBuilder.setCharAt(binNumStrReversedBuilder.length() - 1, '0');
                for (int i = binNumStrReversedBuilder.length() - 2; i > 0; i--) {
                    if (binNumStrReversedBuilder.charAt(i) == 1) {
                        binNumStrReversedBuilder.setCharAt(i, '0');
                    } else {
                        binNumStrReversedBuilder.setCharAt(i, '1');
                        break;
                    }
                }
            } else {
                binNumStrReversedBuilder.setCharAt(binNumStrReversedBuilder.length() - 1, '1');
            }

            // Переменная, которая используется в конце метода после конструкции return.
            // В нее заносится дополнительный код
            binNumStrReversed = binNumStrReversedBuilder.toString();
        }

        // Возвращаем результат работы нашего метода
        return binNumStrReversed;
    }
}

