package baekjoon_online.p_2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_2839 {
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
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        final int DIVIDER_1 = 5;
        final int DIVIDER_2 = 3;
        int given = getInt(inputReader);

        int best = -1;
        for (int i = given/DIVIDER_1; i >= 0; i--) {
            int rest = given - (DIVIDER_1 * i);
            if (rest % DIVIDER_2 == 0) {
                best = i + rest / DIVIDER_2;
                break;
            }
        }

        System.out.println(best);
    }
}
