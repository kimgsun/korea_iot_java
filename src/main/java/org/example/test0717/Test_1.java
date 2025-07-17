package org.example.test0717;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요: ");
        int A = sc.nextInt();

        System.out.println("두번째 숫자를 입력하세요: ");
        int B = sc.nextInt();

        String result = ( B!=0 ) ? "결과: " + ( A / B ) : "0으로 나눌 수 없습니다.";
        System.out.println(result);

        sc.close();
    }
}