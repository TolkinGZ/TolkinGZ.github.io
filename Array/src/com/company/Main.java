package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your size array - ");
        int a = sc.nextInt();
        double d[] = new double[a];
        for (int i = 0; i < d.length; ++i) {
            d[i] = (int) (Math.random() * 100);
            System.out.print (d[i] + " ");
        }
        System.out.println("");
        System.out.println("Choose increase(1) or decrease(2)");
        int ch = sc.nextInt();
        if (ch == 1){
            double tmp = 0;
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d.length - i - 1; j++) {
                    if (d[j] > d[j + 1]) {
                        tmp = d[j];
                        d[j] = d[j + 1];
                        d[j + 1] = tmp;
                    }
                }
            }
        }
        if (ch == 2){
            double tmp = 0;
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d.length - i - 1; j++) {
                    if (d[j] < d[j + 1]) {
                        tmp = d[j];
                        d[j] = d[j + 1];
                        d[j + 1] = tmp;
                    }
                }
            }
        }
        else {
            System.out.println("Please input 1 or 2");
        System.exit(0);
        }
            for (int i = 0; i < d.length; i++) {
                System.out.print(d[i] + " ");
            }
        }
    }