package com.lastisee.thread;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("请输入两个正负数的值,以英文逗号分隔:");
        String input1[] = str.next().split(",");
        Integer red = Integer.valueOf(input1[0]);
        Integer black = Integer.valueOf(input1[1]);
        System.out.println(red + "--" + black);
        ArrayList<Integer> arrarList = new ArrayList<>();
//        for (int i = 0; i < 11; i++) {
//            for (int j = 0; j<7; j++) {
//                arrarList.add();
//            }
//        }
    }

}
