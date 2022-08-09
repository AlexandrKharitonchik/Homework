package home_work_1;

import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите код буквы или символа: "); // Запрос кода символа
        int sym = in.nextInt();

        in.close();

        int A = 'A'; // Определение кодов символов в рамках которых будет сравнение
        int a = 'a';
        int z = 'z';
        int Z = 'Z';

        if (sym >= A && sym <= Z || sym >= a && sym <= z) { // Сравнение буква или иной символ
            System.out.println("Это буква " + (char) sym);
        } else {
            System.out.println("Это символ " + (char) sym);
        }
    }
}
