package com.lastisee.thread;

public class QuickSort {
    //快速排序，不稳定
    public static void main(String[] args) {
        int[] arr = {9, 2, 4, 1, 5, 7, 19, 6, 8,3, 23, 13, 11, 34, 23, 43, 15};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr);
//        double ramdom = Math.random();
//        int base = (int)(ramdom * arr.length);
//        int baseNum = arr[base];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= baseNum) {
//
//            }
//        }
//
//        System.out.println(ramdom+"  "+base);
    }


    public void quickSort(int[] arr) {
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];
        int count1 = 0;
        int count2 = 0;
        int baseNum = arr[0];
        System.out.println("baseNum is: " + baseNum);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= baseNum) {
                arr1[count1] = arr[i];
                count1++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < baseNum) {
                arr2[count2] = arr[j];
                count2++;
            }
        }
        if (arr1.length == 1 || arr2.length == 1) {
            return;
        }
        quickSort(arr1);
        quickSort(arr2);
//        for (int k = 0; k < arr.length; k++) {
//            System.out.println("arr2 is: " + arr2[k]);
//        }
    }

//    public void quickSort(int[] arr1) {
//        int[] arr11 = new int[arr1.length];
//        int[] arr22 = new int[arr2.length];
//        int count1 = 0;
//        int count2 = 0;
//        int baseNum = arr[0];
//        System.out.println("baseNum is: " + baseNum);
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= baseNum) {
//                arr1[count1] = arr[i];
//                count1++;
//            }
//        }
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] < baseNum) {
//                arr2[count2] = arr[j];
//                count2++;
//            }
//        }
//
//    }
}
