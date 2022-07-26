package Finished;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] Array1 = {3, 25, 2, 1, 15, 200, 4,2,2,1,525,3};
        System.out.println(Arrays.toString(Array1));
        mergeSort(Array1, 0, Array1.length - 1);
        for (int i : Array1) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (end <= start) return;
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid); //left half
        mergeSort(arr, mid + 1, end); //right half
        merge(arr, start, mid, end);
        System.out.println(Arrays.toString(arr));


    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int i = start, lidx = 0, ridx = 0;
        int[] arrLeft = new int[mid - start + 1];
        int[] arrRight = new int[end - mid];

        for (int j = 0; j < arrLeft.length; j++) arrLeft[j] = arr[start + j];
        for (int k = 0; k < arrRight.length; k++) arrRight[k] = arr[mid + 1 + k];

        while (lidx < arrLeft.length && ridx < arrRight.length) {
            if (arrLeft[lidx] <= arrRight[ridx]) {
                arr[i] = arrLeft[lidx];
                i++;
                lidx++;
            } else {
                arr[i] = arrRight[ridx];
                i++;
                ridx++;
            }
        }
        while (lidx < arrLeft.length) {
            arr[i] = arrLeft[lidx];
            i++;
            lidx++;
        }
        while (ridx < arrRight.length) {
            arr[i] = arrRight[ridx];
            i++;
            ridx++;
        }

    }

}

