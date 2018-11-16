package baekjoon_online.p_6588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
8
20
42
0

 */
public class p_6588 {
    private static final int MAX_INT = 1000001;

    private static int getInt(BufferedReader inputReader) {
        try {
            String line = inputReader.readLine();
            return Integer.parseInt(line.trim());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public static void main(String[] args) {
        boolean[] nonPrimes = new boolean[MAX_INT];
        nonPrimes[0] = nonPrimes[1] = true;
        for (int i=2; i*i < MAX_INT; i++) {
            if (!nonPrimes[i]) {
                for (int j=i*i; j < MAX_INT; j+=i) {
                    nonPrimes[j] = true;
                }
            }
        }

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int input = getInt(inputReader);

        StringBuilder sb = new StringBuilder();
        while (input != 0) {
            int half = input / 2;
            boolean isFound = false;
            for (int i=3; i <= half; i+=2) {
                if (!nonPrimes[i] && !nonPrimes[input - i]) {
                    sb.append(input).append(" = ").append(i).append(" + ").append(input - i).append("\n");
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                sb.append(input).append(" = ").append("Goldbach's conjecture is wrong.\n");
            }

            input = getInt(inputReader);
        }

        System.out.print(sb.toString());
    }
}
