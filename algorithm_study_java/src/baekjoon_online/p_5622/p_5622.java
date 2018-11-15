package baekjoon_online.p_5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
INPUT
UNUCIC

OUT
36
 */

public class p_5622 {
    private static int [] NUMBER_MAP = {
            2, 2, 2,    // ABC
            3, 3, 3,    // DEF
            4, 4, 4,    // GHI
            5, 5, 5,    // JKL
            6, 6, 6,    // MNO
            7, 7, 7, 7,    // PQRS
            8, 8, 8,    // TUV
            9, 9, 9, 9     // WXYZ
    };

    public static void main(String[] args) {
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

        char[] chars = line.trim().toCharArray();
        int count = chars.length;
        for (int i = 0; i < chars.length; i++) {
            count += NUMBER_MAP[chars[i] - 'A'];
        }

        System.out.println(count);
    }
}
