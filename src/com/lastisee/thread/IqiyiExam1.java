package com.lastisee.thread;

import java.util.Scanner;

public class IqiyiExam1 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("请输入6个整数:");
        String string = str.nextLine();
        int[] array = new int[6];
        for (int i = 0; i < string.length();i++) {
            Integer integer = Integer.valueOf(string.substring(i, i + 1));
            array[i] = integer;
        }


        int count = 0;
        for (int i =0; i < 3; i++) {
            int sum1 = array[0] + array[1] + array[2];
            int sum2 = array[3] + array[4] + array[5];
            if (sum1 == sum2) {
                break;
            } else if (sum1 < sum2) {
                int minIndex = min(array);
                int diff = sum2 - sum1;
                int diff1 = 9 - array[minIndex];
                if (diff < diff1) {
                    array[minIndex] = array[minIndex] + diff;
                    count++;
                    break;

                } else {
                    array[minIndex] = 9;
                    count++;
                }
            } else {
                int maxIndex = max(array);
                int dif = sum1 - sum2;
                int dif1 = array[maxIndex];
                if (dif < dif1) {
                    array[maxIndex] = array[maxIndex] - dif;
                    count++;
                    break;
                } else {
                    array[maxIndex] = 0;
                    count++;
                }

            }


        }
        System.out.println("count is: " + count);
        for (int i = 0; i < array.length; i++) {
            System.out.println("after sort: " + array[i]);
        }
    }

    public static int max(int arr[]) {
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int min = a > b ? a : b;
        min = c > min ? c : min;
        int index = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] == min) {
                index = i;
                break;
            }
        }
        return index;
    }
    public static int min(int[] arr) {
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int min = a < b ? a : b;
        min = c < min ? c : min;
        int index = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] == min) {
                index = i;
                break;
            }
        }
        return index;
    }

}
