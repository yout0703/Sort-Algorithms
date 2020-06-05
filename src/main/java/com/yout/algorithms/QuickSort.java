package com.yout.algorithms;

/**
 * @author yout
 * @date 2020/6/5
 */
public class QuickSort {

    private static int count = 0;

    public static void quickSort(int[] arr, int left, int right) {
        if (arr == null || arr.length <= 1 || left >= right) {
            return;
        }

        int L = left, R = right;
        int baseNum = arr[L];// 始终取第一个数为中间基准数
        while (L < R) {
            while (L < R && arr[R] >= baseNum) {
                R--;
            }
            if (arr[R] < baseNum) {
                arr[L] = arr[R];
            }
            while (L < R && arr[L] <= baseNum) {
                L++;
            }
            if (arr[L] > baseNum) {
                arr[R] = arr[L];
            }
            if (L >= R) {
                arr[L] = baseNum;
            }
        }
        quickSort(arr, left, L - 1);
        quickSort(arr, R + 1, right);
    }
}
