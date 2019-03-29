package com.czf.common;

/**
 * @Author chenzf
 * @Description //TODO
 * @Date 2019/3/21 15:40
 */
public class StudyTest {

    public static void main(String[] args) {
        System.out.println(signReversal(234));
        System.out.println(myAbs(-213));

        System.out.println(Math.abs(-23));

    }

    public static int signReversal(int a) {
        return ~a + 1; // 取反+1
    }

    public static int myAbs(int a) {
        int i = a >> 31;
        //return i == 0 ? a : (~a + 1);
        return ((a^i) - i);
    }

}
