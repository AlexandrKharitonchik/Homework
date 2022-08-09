package home_work_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        boolean weekday; // Объявляем нужные переменные
        boolean vacation;
        Scanner in = new Scanner(System.in);

        System.out.println("Сегодня рабочий день? (да или нет)"); // Запрашиваем тип дня
        String ans1 = in.nextLine();

        System.out.println("Вы на отпуске? (да или нет)"); // Спрашиваем, на отпуске ли пользователь
        String ans2 = in.nextLine();

        in.close();

        if (ans1.equals("Да") || ans1.equals("да")) { // Проверка введенного ответа пользователем
            weekday = true;
        } else {
            weekday = false;
        }

        if (ans2.equals("Да") || ans2.equals("да")) { // Проверка введенного ответа пользователем
            vacation = true;
        } else {
            vacation = false;
        }

        if (sleepIn(weekday, vacation)) { // Отталкиваясь от возвращенного значения методом sleepIn,
            System.out.println("Спим дальше..."); // делаем вывод, что следует делать пользователю.
        } else {
            System.out.println("Пора на работу!!!");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) { // Создание метода
        if (vacation == true || weekday == false) {
            return true;
        } else {
            return false;
        }
    }
}
