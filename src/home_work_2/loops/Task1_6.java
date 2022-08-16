package home_work_2.loops;

public class Task1_6 {
    public static void main(String[] args) {
        table();
    }

    public static void table() { // Создание таблицы умножения
        String str = "";
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j < 6; j++) {
                str += j + " X " + i + " = " + j * i + "\t";
                if (j == 5) {
                    str += "\n";
                }
            }
        }

        str += "\n";

        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j < 10; j++) {
                str += j + " X " + i + " = " + j * i + "\t";
                if (j == 9) {
                    str += "\n";
                }
            }
        }

        System.out.println(str);
    }
}
