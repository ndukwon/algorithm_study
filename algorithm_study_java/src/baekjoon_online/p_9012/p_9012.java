package baekjoon_online.p_9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
6
(())())
(((()())()
(()())((()))
((()()(()))(((())))()
()()()()(()()())()
(()((())()(

 */
public class p_9012 {
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = getInt(br);

        StringBuilder sb = new StringBuilder();
        while (count-- > 0) {
            char[] chars = getLine(br).toCharArray();
            int stackDepthCount = 0;
            for (char item : chars) {
                switch (item) {
                    case '(':
                        stackDepthCount++;
                        break;
                    case ')':
                        stackDepthCount--;
                        break;
                }

                if (stackDepthCount < 0) {
                    break;
                }
            }

            if (stackDepthCount == 0) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb.toString());
    }
}
