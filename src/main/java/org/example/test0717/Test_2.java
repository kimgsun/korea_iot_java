package org.example.test0717;

import java.util.Random;
import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("정수 N을 입력하세요: ");
        int N = sc.nextInt();

        int min = Integer.MAX_VALUE;

        for ( int i = 0; i < N; i++ ) {
            int num = random.nextInt(101)-50;
            System.out.print(num + " ");

            if (num < min) {
                min = num;
            }
        }

        System.out.println();
        System.out.println(min);

        sc.close();
    }
}