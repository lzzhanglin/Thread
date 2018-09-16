package com.lastisee.thread;

public class ByteAndInt {

    public static void main(String[] args) {
        byte[] arr = {12, 23, 45, 123};
        int result = byteArrayToInt(arr);
        System.out.println("result is: " + result);
        System.out.println( 123+11520+1507328+201326592);
        int num = 202845563;
        byte[] result1 = intToByteArray(num);

    }

    public static int byteArrayToInt(byte[] b) {
        System.out.println(b[3] & 0xff);
        System.out.println((b[2] & 0xff) << 8);
        System.out.println((b[1] & 0xff) << 16);
        System.out.println((b[0] & 0xff) << 24);
        return   b[3] & 0xFF |
                (b[2] & 0xFF) << 8 |
                (b[1] & 0xFF) << 16 |
                (b[0] & 0xFF) << 24;
    }

    public static byte[] intToByteArray(int a) {
        System.out.println(((a >> 24) & 0xFF));
        System.out.println(((a >> 16) & 0xFF));
        System.out.println(((a >> 8) & 0xFF));
        System.out.println((a & 0xFF));
        return new byte[] {
                (byte) ((a >> 24) & 0xFF),
                (byte) ((a >> 16) & 0xFF),
                (byte) ((a >> 8) & 0xFF),
                (byte) (a & 0xFF)
        };
    }
}
