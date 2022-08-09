package home_work_1;

public class Task4_1 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 1000); // Получаем случайные числа от 0 до 1000
        int b = (int) (Math.random() * 1000);

        if (a % 2 != 0 && b % 2 != 0 || a % 2 == 0 && b % 2 == 0) {
            a += 1;
        } // Если оба числа нечетные, или оба числа четные, то увеличиваем первое на единицу

        if (a % 2 != 0) {
            System.out.println(a + " - нечетное число"); // Вывод нечетного числа
        } else {
            System.out.println(b + " - нечетное число");
        }
    }
}
