package baekjoon_online.p_10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
10
5
2
3
1
4
2
3
5
1
7

 */
public class p_10989 {
    private static final int MAX_NUMBER = 10000;
    private static String getLine(BufferedReader inputReader) {
        try {
            return inputReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private static int getInt(BufferedReader inputReader) {
        String line = getLine(inputReader);
        return Integer.parseInt(line.trim());
    }

    public static void main(String[] args) {
        int[] countingHash = new int[MAX_NUMBER + 1];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = getInt(br);

        while (count-- > 0) {
            countingHash[getInt(br)]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < countingHash.length; i++) {
            int itemCount = countingHash[i];
            while (itemCount-- > 0){
                sb.append(i).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
