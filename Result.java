/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zer0leet.result;

import java.util.Scanner;

/**
 *
 * @author Deepika
 */
public class Result {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Name");
            String name = input.next();
            System.out.println("Symbol No");
            int s = input.nextInt();
            System.out.println("Science");
            int a = input.nextInt();
            System.out.println("English");
            int b = input.nextInt();
            System.out.println("C.Math");
            int c = input.nextInt();
            System.out.println("Opt.Math");
            int d = input.nextInt();
            System.out.println("Computer");
            int e = input.nextInt();
            System.out.println("Nepali");
            int f = input.nextInt();
            System.out.println("===========");
            int total = 0;
            int max = 600;
            float percentage;
            if (a >= 32 && b >= 32 && c >= 32 && d >= 32 && e >= 32 && f >= 32) {
                System.out.println("Status:Pass");

                total = a + b + c + d + e + f;

                System.out.println(total);
                percentage = (float) ((total * 100) / max);
                System.out.println("Percentage is" + percentage + "%");
                if (percentage > 80) {
                    System.out.println("Distinction");
                } else if (percentage > 70) {
                    System.out.println("First Division");
                } else if (percentage > 60) {
                    System.out.println("Second Division");
                }
            } else {
                System.out.println("failed");
                System.out.println("Do u want to continue [y/n]");
            String ch = input.next();
            if (ch.equalsIgnoreCase("n")) {
                System.exit(0);
            }
          }
        }
    }

}
