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
public class p_1934 {
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

            int min = Math.min(a, b);
            int max = Math.max(a, b);
            int commonMultiple = max;

            while (commonMultiple % min != 0) {
                commonMultiple += max;
            }

            System.out.println(commonMultiple);
        }
    }
}
