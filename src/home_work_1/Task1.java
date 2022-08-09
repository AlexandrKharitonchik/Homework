package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(a | b);
        System.out.println(a & b);

        /*
            6 = 00000110
            43 = 00101011
            00000110 | 00101011 = 00101111(47)
            00000110 & 00101011 = 00000010(2)
        */

         // System.out.println(42.5 | 11.1); Operator '|' cannot be applied to 'double', 'double';
        // Нельзя применить для типа данных "double";
    }
}
