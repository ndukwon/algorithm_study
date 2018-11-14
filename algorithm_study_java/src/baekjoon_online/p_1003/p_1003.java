package baekjoon_online.p_1003;

import java.util.Scanner;

/*
INPUT
3
0
1
3

 */

public class p_1003 {
    private static final int MAX_FIBONACCI = 41;

    public static void main(String[] args) {

        int[] fibonacci = new int[MAX_FIBONACCI];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < MAX_FIBONACCI; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i -2];
        }

        // First line
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (; count > 0; count--) {
            int index = sc.nextInt();
            int a, b;
            if (index == 0) {
                a = 1;
                b = 0;
            } else {
                a = fibonacci[index - 1];
                b = fibonacci[index];
            }
            System.out.println(a + " " + b);
        }
    }
}
