package home_work_2.loops;

import java.util.Scanner;
import java.util.Random;

public class Task1_5 {
    public static void main(String[] args) {
        // maxNumber();
        // probOfNum();
        // calcNums();
        // fib();
        // numRow();
        // reverseNum();
        // table();

    }

    public static void maxNumber() { // Находим наибольшую цифру числа
        Scanner in = new Scanner(System.in);

        System.out.print("Введите натуральное число: ");
        int num = in.nextInt();

        in.close();

        int numCopy = 0;
        while (num > 0) { // Поиск цифры
            if (numCopy > num % 10) {
                num /= 10;
            } else {
                numCopy = num % 10;
                num /= 10;
            }
        }

        System.out.println("Наибольшая цифра числа: " + numCopy);
    }

    public static void probOfNum() { // Вычисление вероятность четных чисел
        int counter = 0;
        Random rand = new Random();

        for (int i = 0; i <= 1000; i++) {
            if (rand.nextInt() % 2 == 0) {
                counter++;
            }
        }

        System.out.println("Из 1000 чисел " + counter + " четные.");
    }

    public static void calcNums() { // Подсчет четных и нечетных цифр числа
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();

        in.close();

        int counter = 0;
        String evenNums = "(";
        String oddNums = "(";
        int numCopy = num;
        int lenOfNum = Integer.toString(num).length();

        while (num > 0) {
            if ((num % 10) % 2 == 0) {
                counter++;
                evenNums += num % 10 + ", ";
                num /= 10;
            } else {
                oddNums += num % 10 + ", ";
                num /= 10;
            }
        }

        if (counter == lenOfNum) {
            System.out.println("В данном числе все цифры четные.");
        } else if (counter == 0) {
            System.out.println("В данном числе все цифры нечетные.");
        } else {
            StringBuilder corrStr = new StringBuilder(oddNums);
            corrStr.setCharAt(oddNums.length() - 2, ')');
            oddNums = corrStr.toString();

            corrStr = new StringBuilder(evenNums);
            corrStr.setCharAt(evenNums.length() - 2, ')');
            evenNums = corrStr.toString();

            System.out.println("В данном числе " + counter + " четных(-ые) цифр(-ы) " + evenNums + "и " + Integer.toString(lenOfNum - counter) + " нечетных(-ые) цифр(-ы) " + oddNums);
        }
    }

    public static void fib() { // Вычисления ряда Фибоначчи
        Scanner in = new Scanner(System.in);

        System.out.print("Введите длину ряда: ");
        int len = in.nextInt();

        in.close();

        if (len == 0) {
            System.out.println("");
        } else if (len == 1) {
            System.out.println("0");
        } else {
            String str = "0 1";

            int num1 = 0;
            int num2 = 1;
            int numCopy = 0;

            for (int i = 0; i < len - 2; i++) {
                str += " " + (num1 + num2);
                numCopy = num2;
                num2 = num1 + num2;
                num1 = numCopy;
            }

            System.out.println(str);
        }
    }

    public static void numRow() { // Вывод ряда чисел в указанном диапазоне с определенным шагом
        Scanner in = new Scanner(System.in);

        System.out.println("Введите минимальное значение: ");
        int min = in.nextInt();
        System.out.print("Введите максимальное значение: ");
        int max = in.nextInt();
        System.out.print("Введите шаг: ");
        int step = in.nextInt();
        String str = "";

        in.close();

        for (int i = min; i <= max; i += step) {
            str += i + " ";
        }

        System.out.println(str);
    }

    public static void reverseNum() { // Переворот числа
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();
        String str = "";

        in.close();

        while (num > 0) {
            str += num % 10;
            num /= 10;
        }

        System.out.println(str);
    }
}
