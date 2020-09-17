package com.m.test;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int arr[] = new int[]{5, 4, 3, 2, 1};
////        Arrays.sort(arr);
//        chaPai(arr);
//        System.out.println(Arrays.toString(arr));
//
//        chaPai1();

//        chaPai2();
    }




    public static void test() {
        //希尔排序

        int[] arr = {13, 11, 15, -11, 99, -10, 0, 22};

        //准备跨度的序列
        int k = 1;
        while (k < arr.length) {
            k = k * 2 + 1;
        }

//		int[] ts = {5,3,2,1};//跨度可以自己定义：只要保证tk = 1就行

        //循环跨度 13 4 1
        while (k > 0) {
            //根据跨度来进行分组
            //思考：为什么从g开始而不是从0开始：子序列是插入排序
            for (int i = k; i < arr.length; i++) {
                //找到当前分组的第一个要排序的值
                int temp = arr[i];//这是我们要插入的值
                int j = i - k;//找到当前子序列的前一位
                //插入排序
                //倒序找前一位，允许游标为负值，游标为负值，不再进入
                while (j >= 0 && arr[j] > temp) {
                    //谁和谁交换
                    arr[j + k] = arr[j];//把当前的交给前面一位
                    j -= k;//继续找下一个，直到下一个的游标小于0
                }
                //把最后一位补上
                arr[j + k] = temp;
            }
            System.out.println("跨度:" + k);
            k /= 2;
        }

        System.out.println(Arrays.toString(arr));

    }

    //面向对象
    public void sort(int[] arr) {
        int[] temp = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        sort(arr, left, right, temp);
    }

    public void sort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            //左分
            sort(arr, left, mid, temp);
            //右分
            sort(arr, mid + 1, right, temp);
            //合并
            hebing(arr, left, mid, right, temp);
        }

    }

    public void hebing(int[] arr, int left, int mid, int right, int[] temp) {

    }

    int test1() {

        return 1;
    }
}
