package arithmetic;

import java.util.Arrays;

/**
 * Created by ${陈广波} on 2020/7/1.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - i; j++) {
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


}
