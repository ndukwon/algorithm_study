package baekjoon_online.p_2750;

import java.util.Arrays;
import java.util.Scanner;


/*
Input:
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
public class p_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfList = sc.nextInt();

        int[] list = new int[sizeOfList];
        for (int i=0; i < sizeOfList; i++) {
            list[i] = sc.nextInt();
        }
        sc.close();

        list = mergeSortRecursive(list);

        for (int i=0; i < sizeOfList; i++) {
            System.out.println(list[i]);
        }
    }

    private static int[] mergeSortRecursive(int[] list) {
        int sizeOfList = list.length;
        if (sizeOfList > 2) {
            int half = sizeOfList/2;
            int[] listA = mergeSortRecursive(Arrays.copyOfRange(list, 0, half));
            int[] listB = mergeSortRecursive(Arrays.copyOfRange(list, half, sizeOfList));
            return merge(listA, listB);

        } else if (sizeOfList == 2) {
            if (list[0] > list[1]) {
                int temp = list[0];
                list[0] = list[1];
                list[1] = temp;
            }
        }

        return list;
    }

    private static int[] merge(int[] listA, int[] listB) {
        int totalSize = listA.length + listB.length;
        int[] merged = new int[totalSize];

        int pointerA = 0;
        int pointerB = 0;
        int pointerMerged = 0;
        while (pointerA < listA.length && pointerB < listB.length) {
            if (listA[pointerA] < listB[pointerB]) {
                merged[pointerMerged++] = listA[pointerA++];
            } else {
                merged[pointerMerged++] = listB[pointerB++];
            }
        }

        while (pointerB < listB.length) {
            merged[pointerMerged++] = listB[pointerB++];
        }
        while (pointerA < listA.length) {
            merged[pointerMerged++] = listA[pointerA++];
        }

        return merged;
    }

    private static void selectionSort(int[] list) {
        int sizeOfList = list.length;

        for (int i=0; i < sizeOfList - 1; i++) {
            int minIndex = i;
            for (int j=i+1; j < sizeOfList; j++) {
                if (list[minIndex] > list[j]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
    }

    private static void bubbleSort(int[] list) {
        int sizeOfList = list.length;

        boolean keepGoing = true;
        while (keepGoing) {
            keepGoing = false;
            for (int i=0; i < sizeOfList - 1; i++) {
                if (list[i] > list[i+1]) {
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    keepGoing = true;
                }
            }
        }
    }
}
