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
public class p_1929 {
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

        List<Integer> primes = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int prime : primes) {
            sb.append(prime).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
