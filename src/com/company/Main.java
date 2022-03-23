package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] as) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf(" Nhập a["+ i + "] : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập phần tử k : ");
        int k = scanner.nextInt();
        System.out.println("Nhập vi tri : ");
        int index = scanner.nextInt();
        arr = insert(arr, k,index);
        System.out.print("Mảng sau khi chèn: ");
        show(arr);
    }


    public static int[] insert(int[] arr, int k,int index) {
        int[] tempArr = new int[arr.length + 1];
        for (int i = arr.length; i>index; i--) {
            tempArr[i]=arr[i-1];
        }
        tempArr[index]=k;
        for (int j =0; j <index; j++) {
            tempArr[j]=arr[j];
        }
        return tempArr;
    }
    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

