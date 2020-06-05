package com.yout.algorithms;

/**
 * @author yout
 * @date 2020/6/5
 */
public class MergeSort {

    /**
     * @param L 左边界
     * @param M 中间
     * @param R 右边界
     * @return
     */
    public static void merge(int[] arr, int L, int M, int R) {
        if (L > M || R < M || arr == null || arr.length <= 0) {
            return;
        }

        int[] temp = new int[R - L + 1];
        int tempPoint = 0;
        int i = L, j = M + 1;
        while (i <= M && j <= R) {
            if (arr[i] > arr[j]) {
                temp[tempPoint] = arr[j];
                j++;
            } else {
                temp[tempPoint] = arr[i];
                i++;
            }
            tempPoint++;
        }
        while (i <= M) {
            temp[tempPoint] = arr[i];
            i++;
            tempPoint++;
        }
        while (j <= R) {
            temp[tempPoint] = arr[j];
            j++;
            tempPoint++;
        }
        int tempL = L;
        for (int k = 0; k < temp.length; k++) {
            arr[tempL++] = temp[k];
        }
    }


    public static void mergeSort(int[] arr, int L, int R) {
        if (L < R) {
            int middle = (L + R) / 2;
            mergeSort(arr, L, middle);
            mergeSort(arr, middle + 1, R);
            merge(arr, L, middle, R);
        }
    }
}
