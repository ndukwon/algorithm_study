package baekjoon_online.p_1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
INPUT
1 3

Output
0.3333333333333333
 */

public class p_1008_2 {

    public static void main(String[] args) throws IOException {
        StringTokenizer token = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        token = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(token.nextToken());
        double b = Double.parseDouble(token.nextToken());

        System.out.println(a/b);
    }
}
