package baekjoon_online.p_2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_2941 {
    private static String[] CROATIA_CHARS = {
            "c=",
            "c-",
            "dz=",
            "d-",
            "lj",
            "nj",
            "s=",
            "z="
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

        for (String ch : CROATIA_CHARS) {
            line = line.replace(ch, "0");
        }

        System.out.println(line.length());
    }
}
