package home_work_1;

public class Task7 {
    public static void main(String[] args) {
        String number = createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});

        System.out.println(number);
    }

    public static String createPhoneNumber(int[] arr) {
        String phoneNum = "("; // Создаем переменную, в которой будет формироваться строка. Начально значение "("

        for (int i = 0; i < arr.length; i++) { // Цикл for, работающий относительно длины массива arr
            if (i == 2) { // Если i доходит до 2ух, значит нужно добавить ")" и пробел, чтобы получилось "(XXX) "
                phoneNum += arr[i] + ")" + " "; // Формирование строки
                continue; // Прерывает текущую итерацию, переходит на следующую
            }

            if (i == 5) { // Если i доходит до 5, значит нужно добавить "-", чтобы получилось // "(XXX) XXX-"
                phoneNum += arr[i] + "-"; // Формирование строки
                continue; // Прерывает текущую итерацию, переходит на следующую
            }

            phoneNum += arr[i]; // Формирование строки
        }

        return phoneNum; // Возвращаем строку phoneNum
    }
}
