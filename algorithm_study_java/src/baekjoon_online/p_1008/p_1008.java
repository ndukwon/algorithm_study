package baekjoon_online.p_1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
INPUT
1 3

Output
0.3333333333333333
 */

public class p_1008 {

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

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = getLine(br);

        String[] items = line.split(" ");
        int a = Integer.parseInt(items[0]);
        double b = Double.parseDouble(items[1]);

        System.out.println(a/b);
    }
}
