package com.lastisee.thread;

public class BubbleSort {
    //冒泡排序
    public static void main(String[] args) {
//        int[] arr = {3, 2, 4, 1, 5, 7, 9, 6, 8, 23, 13, 11, 34, 23, 43, 15};
        int[] arr = {3, 2, 4, 1, 5, 7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println("afterSort: " + arr[k]);

        }
    }
}
