package com.lastisee.thread;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("请输入正整数N");
        int num = Integer.valueOf(str.next());
        int count = 0;
        //是否互质
        boolean isPrime = false;
        //是否为勾股数
        boolean pythagorean =false;
            for (int c = num; c >0; c--) {
                for (int b = num -1; b > 0; b--) {
                    for (int a = num -2; a > 0; a-- ) {
                        boolean isPrime1 = check(a, b);
                        boolean isPrime2 = check(b, c);
                        boolean isPrime3 = check(a, c);
                        isPrime = isPrime1&&isPrime2&&isPrime3;
                        pythagorean = c * c == b * b + a * a;
                        if ( pythagorean&&isPrime ) {
                            count++;
                            break;

                        }
                    }
                    if (pythagorean&&isPrime) {
                        break;
                    }
                }

            }

        System.out.println("count is: " + count);

    }

    public static boolean check(int a,int b) {

        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        int c;
        while ((c = a % b) != 0) {
            a = b;
            b = c;
        }
        if (b == 1) {
            return true;
        } else {
            return false;
        }
    }
}
