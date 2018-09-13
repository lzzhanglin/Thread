package com.lastisee.thread;

public class InsertSort {
    //插入排序
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 5, 7, 9, 6, 8, 23, 13, 11, 34, 23, 43, 15};
        int len = arr.length;
        int[] arr2 = new int[len];
        arr2[0] = arr[0];
        //外层循环，对数组第二个元素开始进行比较
        for (int i = 0; i < len - 1; i++) {
        for (int j = 0; j < i + 1; j++) {
            //内层循环，构造了一个排好序的数组，当原数组的元素小于排好序的数组的某个元素时，
            // 将排好序的数组向后移一位，当发生后移时，退出内层循环
            if (arr[i + 1] < arr2[j]) {
                for (int k = i ; k >= j ; k--) {
                    arr2[k + 1] = arr2[k];
                }
                int temp = arr[i + 1];
                arr2[j + 1] = arr2[j];
                arr2[j] = temp;
                break;
            }
            //若前面都没有满足比当前需要排序的元素大的条件，则将此元素赋值到排好序的数组末尾
            if (j == i) {
                arr2[i + 1] = arr[i + 1];

            }
        }

        }
        for (int j = 0; j < arr2.length; j++) {
            System.out.println("arr2 is: " + arr2[j]);
        }
    }
}
