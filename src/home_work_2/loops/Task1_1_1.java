package home_work_2.loops;

public class Task1_1_1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]); // Получаем аргумент с консоли
        int result = 1; // Переменная, в которую запишится результат
        String resStr = ""; // Переменная для работы

        if (a == 0) { // Условия
            System.out.println("0 * 1 = 0");
        } else if (a == 1) {
            System.out.println("1 * 1 = 1");
        } else {
            for (int i = 1; i <= a; i++){
                result *= i;

                if (i == a) {
                    resStr += i;
                } else {
                    resStr += i + " * "; // Условия формирования строки
                }
            }

            System.out.println(resStr + " = " + result);
        }
    }
}
