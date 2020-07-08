package com.example.demo01.test;

/**
 * @author jiahao
 * @create 2020-06-29 9:04
 */
public class MaoPaoPaiXuTest {
    public static void main(String[] args) {
        int[] arr = {12, 23, 456, 8, 7, 66};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);

        }
    }
}
