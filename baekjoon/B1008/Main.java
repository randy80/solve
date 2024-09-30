package baekjoon.B1008;

// 백준 1008번 - A/B
// 문제: 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
// 해결 방법: 간단한  나눗셈 문제로, Java의 Scanner와 System.out.println()을 사용하여 해결

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        double result = (double) a / b;
        System.out.println(result);
    }
}