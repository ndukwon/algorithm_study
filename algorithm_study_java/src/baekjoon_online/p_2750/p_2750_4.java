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
public class p_2750_4 {
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

//        normalSort(array);
//        Arrays.sort(array);
//        quickSort(array);
        mergeSort(array);

        StringBuilder sb = new StringBuilder();
        for (int item : array) {
            sb.append(item).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static void normalSort(int[] array) {
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

    private static void quickSort(int[] array) {
        boolean isChanged = true;
        while (isChanged) {
            isChanged = false;
            for (int i = 0; i < array.length - 1; i++) {
                int j = i + 1;
                if (array[i] > array[j]) {
                    isChanged = true;

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static void mergeSort(int[] array) {
        sort(array, 0, array.length);
    }

    private static void sort(int[] array, int start, int end) {
        if (start + 1 >=  end) {
            return;
        }

        int length = end - start;
        int halfStart = start + ((end - start) / 2);
//        System.out.println("start=" + start + ", halfStart=" + halfStart + ", end=" + end);
        sort(array, start, halfStart);
        sort(array, halfStart, end);
        merge(array, start, halfStart, end);

//        StringBuilder sb = new StringBuilder();
//        for (int item : array) {
//            sb.append(item).append(" ");
//        }
//        System.out.println(sb.toString());
    }

    private static void merge(int[] array, int start, int halfStart, int end) {
        int[] left = Arrays.copyOfRange(array, start, halfStart);
        int[] right = Arrays.copyOfRange(array, halfStart, end);

        int poL = 0;
        int poR = 0;
        int poA = start;

        while (poL < left.length && poR < right.length) {
            if (left[poL] < right[poR]) {
                array[poA++] = left[poL++];
            } else {
                array[poA++] = right[poR++];
            }
        }

        while (poL < left.length) {
            array[poA++] = left[poL++];
        }
        while (poR < right.length) {
            array[poA++] = right[poR++];
        }
    }
}
