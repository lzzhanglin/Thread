package com.lastisee.thread;

import java.util.*;


public class IqiyiExam2 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("请输入NMP:");
        String string = str.nextLine();
        Integer N = Integer.valueOf(string.substring(0, 1));
        Integer M = Integer.valueOf(string.substring(1, 2));
        Integer P = Integer.valueOf(string.substring(2, 3));
        Scanner str2 = new Scanner(System.in);
        System.out.println("请输入N份食物每份的个数:");
        String string2 = str2.nextLine();
        HashMap<Integer, Integer> foodNumMap = new HashMap<>();

        for (int i = 1; i <=N; i++) {
            foodNumMap.put(i, Integer.valueOf(string2.substring(i - 1, i)));
        }
        for (HashMap.Entry<Integer, Integer> entry : foodNumMap.entrySet()) {

            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());


        }
        int rank = 1;
        for (int i = 1; i <= M; i++) {
            Scanner str3 = new Scanner(System.in);
            System.out.println("请输入第" + i + "天每次买或者吃的食物类别:");
            String string3 = str3.nextLine();
            Integer food = Integer.valueOf(string3.substring(1, 2));
            if (string3.substring(0, 1).equals("A")) {
                int num = foodNumMap.get(food);
                foodNumMap.put(food, num + 1);
            } else if (foodNumMap.containsKey(food)){
                int num = foodNumMap.get(food);
                foodNumMap.put(food, num - 1);
            }

        }

        int pNum = foodNumMap.get(P);
        for (HashMap.Entry<Integer, Integer> entry : foodNumMap.entrySet()) {
            if (entry.getValue() > pNum) {
                rank += 1;
            }
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());


        }
        System.out.println("rank is: " + rank);

    }
}
