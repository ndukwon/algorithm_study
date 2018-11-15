package baekjoon_online.p_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Input:
5
5
2
3
4
1

 */
public class p_2750_2 {
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
        // First line
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int count = getInt(inputReader);

        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = getInt(inputReader);
        }

        selectionSort(array);
//        Arrays.sort(array);

        StringBuilder sb = new StringBuilder();
        for (int item : array) {
            sb.append(item).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
}
