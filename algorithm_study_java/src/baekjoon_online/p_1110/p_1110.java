package baekjoon_online.p_1110;

import java.util.Scanner;

/*
Input:
26

Output:
4
 */

public class p_1110 {
    public static void main(String[] args) {
        // First line
        Scanner sc = new Scanner(System.in);
        int givenNumber = sc.nextInt();

        int count = 0;
        int generated = givenNumber;

        while(true) {
            count++;
            int firstNumber = generated / 10;
            int secondNumber = generated % 10;
            generated = (secondNumber * 10) + ((firstNumber + secondNumber) % 10);

            if (generated == givenNumber) {
                break;
            }
        }
        System.out.println(count);
    }
}
