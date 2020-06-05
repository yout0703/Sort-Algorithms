import com.yout.algorithms.MergeSort;
import com.yout.algorithms.QuickSort;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

/**
 * @author yout
 * @date 2020/6/5
 */
public class SortTest {

    public static void main(String[] args) throws IOException {
        final int ARRAY_LENGTH = 100000; // 设置数组长度

        // 初始化排序数组
        int[] array = new int[ARRAY_LENGTH];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(ARRAY_LENGTH * 100);
            //System.out.print(array[i] + ","); // debug 看初始数组
        }


        /**
         * 快速排序
         */
        int[] tempArray = Arrays.copyOf(array, ARRAY_LENGTH); // 先拷贝数组，保留现场
        Instant startMergeSortTime = Instant.now();
        MergeSort.mergeSort(tempArray, 0, ARRAY_LENGTH - 1);
        Instant endMergeSortTime = Instant.now();

        System.out.println();
        System.out.println("MergeSort cost : " + Duration.between(startMergeSortTime, endMergeSortTime).toMillis() + "毫秒");
//        System.out.println("after sort : ");
//        for (int i = 0; i < tempArray.length; i++) {
//            System.out.print(tempArray[i] + ",");
//        }


        /**
         * 归并排序
         */
        tempArray = Arrays.copyOf(array, ARRAY_LENGTH); // 先拷贝数组，保留现场
        Instant startQuickSortTime = Instant.now();
        QuickSort.quickSort(tempArray, 0, ARRAY_LENGTH - 1);
        Instant endQuickSortTime = Instant.now();

        System.out.println();
        System.out.println("QuickSort cost : " + Duration.between(startQuickSortTime, endQuickSortTime).toMillis() + "毫秒");
//        System.out.println("after sort : ");
//        for (int i = 0; i < tempArray.length; i++) {
//            System.out.print(tempArray[i] + ",");
//        }

    }
}
