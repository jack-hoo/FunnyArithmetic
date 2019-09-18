package it.jackhoo.day1;

/**
 * @ClassName BinnarySearch
 * @Description 二分法查找
 * @Author hushangjie
 * @Date 2019-09-18 14:34
 * @Version 1.0
 * @blame UnKnow
 */
public class BinarySearch {


    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 10};
        int index = search(10, arr);
        System.out.println(index);
    }

    /**
     * 在已排好序的数组里面找出指定的值
     *
     * @param key
     * @param arr
     * @return 未找到返回-1，找到了返回下标
     */
    public static int search(int key, int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {   //等于的目的是用来判断最后high==low的情况，以防止遗漏最后一个元素的判断
            int mid = (low + high) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
