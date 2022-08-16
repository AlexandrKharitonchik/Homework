package home_work_2.loops;

public class Task1_1_2 {
    public static void main(String[] args) { // Здесь реализован метод, который вычисляет факториал числа с использования рекурсии
        System.out.println(fact(6));
    }
    public static int fact(int a) {
        if (a == 0) {
            return 1;
        } else if (a == 1) {
            return 1;
        } else {
            return a * fact(a - 1);
        }
    }
}
