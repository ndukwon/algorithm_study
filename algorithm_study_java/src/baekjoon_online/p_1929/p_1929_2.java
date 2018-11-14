package baekjoon_online.p_1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Input:
3 16

Output:
3
5
7
11
13

 */
public class p_1929_2 {
    public static void main(String[] args) {
        // First line
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = inputReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (line == null) {
            return;
        }

        String[] between = line.trim().split(" ");
        int a = Integer.parseInt(between[0]);
        int b = Integer.parseInt(between[1]);

        boolean[] checkNonPrimes = new boolean[b + 1];
        checkNonPrimes[0] = checkNonPrimes[1] = true;
        for (int i = 2; i <= b; i++) {
            if (!checkNonPrimes[i]) {
                for (int j = i + i; j <= b; j += i) {
                    checkNonPrimes[j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = a; i <= b; i++) {
            if (!checkNonPrimes[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
