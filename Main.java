package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Input array size - ");
       int a = sc.nextInt();
       double d[] = new double[a];
       for (int i = 0; i<a; ++i)
           d[i] = (int)(Math.random()*100);
       for (int i = 0;i<a; ++i)
           System.out.print(d[i]+" ");
       double max=d[0],min=d[0],mean=d[0],sum = 0;
       for (int i = 0; i < a; i++) {
           if (d[i] > max) max = d[i];
           if (d[i]<min) min = d[i];
           sum += d[i];
       }
       mean = sum/a;
       System.out.println("");
       System.out.println("max = "+ max);
       System.out.println("min = "+min);
       System.out.println("sum = " + sum);
       System.out.println("mean = " + mean);

    }
}
