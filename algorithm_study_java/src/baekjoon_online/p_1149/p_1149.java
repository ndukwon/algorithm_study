package baekjoon_online.p_1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
3
26 40 83
49 60 57
13 89 99

 */

public class p_1149 {

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
        int bestPathForR = 0;
        int bestPathForG = 0;
        int bestPathForB = 0;
        for (; count > 0; count--) {
            try {
                line = inputReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[] rgbStrings = line.trim().split(" ");
            int nextR = Integer.parseInt(rgbStrings[0]);
            int nextG = Integer.parseInt(rgbStrings[1]);
            int nextB = Integer.parseInt(rgbStrings[2]);

            int currentBestR = (bestPathForG < bestPathForB ? bestPathForG : bestPathForB) + nextR;
            int currentBestG = (bestPathForR < bestPathForB ? bestPathForR : bestPathForB) + nextG;
            int currentBestB = (bestPathForR < bestPathForG ? bestPathForR : bestPathForG) + nextB;
            bestPathForR = currentBestR;
            bestPathForG = currentBestG;
            bestPathForB = currentBestB;

//            System.out.println(bestPathForR + ", " + bestPathForG + ", " + bestPathForB);
        }

        int bestPathResult = Math.min(bestPathForR, Math.min(bestPathForG, bestPathForB));
        System.out.println(bestPathResult);
    }
}
