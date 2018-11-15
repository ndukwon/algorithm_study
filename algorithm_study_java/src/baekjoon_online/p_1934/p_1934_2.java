package baekjoon_online.p_1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Input
3
1 45000
6 10
13 17

Output
45000
30
221
 */
public class p_1934_2 {
    public static void main(String[] args) {
        // First line
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = inputReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int count = Integer.parseInt(line.trim());
        while (count-- > 0) {
            try {
                line = inputReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[] abStrings = line.trim().split(" ");
            int a = Integer.parseInt(abStrings[0].trim());
            int b = Integer.parseInt(abStrings[1].trim());

            System.out.println(a * b / gcd(a, b));
        }
    }

    private static int gcd(int a, int b) {
        int max = a;
        int min = b;
        do {
            int temp = max % min;
            max = min;
            min = temp;
        } while (min != 0);

        return max;
    }
}
