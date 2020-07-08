package arithmetic;

import java.util.Arrays;

/**
 * Created by ${陈广波} on 2020/7/1.
 */
public class bubblingSort {

    public static void main(String[] args) {

        int[] arr = {4, 3, 1, 2, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void BubbleSort(int[] arr) {
        int temp;//定义一bai个临时变量du
        for (int i = 0; i < arr.length - 1; i++) {//冒泡趟数
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
