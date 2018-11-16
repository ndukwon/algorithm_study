package baekjoon_online.p_11652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Input
6
1
2
1
2
1
2

Output
1
 */
public class p_11652 {
    private static String getLine(BufferedReader inputReader) {
        try {
            return inputReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private static int getInt(BufferedReader inputReader) {
        return Integer.parseInt(getLine(inputReader).trim());
    }
    private static long getLong(BufferedReader inputReader) {
        return Long.parseLong(getLine(inputReader).trim());
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = getInt(br);
        long[] array = new long[count];
        while (count-- > 0) {
            array[count] = getLong(br);
        }

        Arrays.sort(array);

        int bestCount = 0;
        int currCount = 0;
        long bestItem = 0;
        long prevItem = 0;
        for (int i=0; i < array.length; i++) {
            if (prevItem == array[i]) {
                currCount++;
            } else {
                prevItem = array[i];
                currCount = 1;
            }

            if (bestCount < currCount) {
                bestCount = currCount;
                bestItem = prevItem;
            }
        }
        System.out.println(bestItem);
    }
}
