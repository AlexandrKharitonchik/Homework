package home_work_2.loops;

public class Task1_2 {
    public static void main(String[] args) {
        String str = args[0]; // Получаем аргумент с консоли и передаем переменной
        boolean NaN = false;

        try { // Проверка на правильность ввода
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            NaN = true;
        }


        if (NaN) {
            System.out.println("Вы ввели не число!");
        }
        else {
            if (Double.parseDouble(str) % 1 != 0) {
                System.out.println("Вы ввели не целое число!");
            } else {
                String subStr = ""; // Переменные для работы
                int res = 1;
                int num = Integer.parseInt(str);

                for (int i = str.length(); i > 0; i--) {
                    if (i != 1) { // Условия формирования строки и вычисление результата
                        res *= (num % 10);
                        subStr += num % 10 + " * ";
                        num /= 10;
                    } else {
                        res *= (num % 10);
                        subStr += num % 10;
                    }
                }

                StringBuilder reversedStr = new StringBuilder(subStr).reverse();

                System.out.println(reversedStr + " = " + res);
            }
        }
    }
}
