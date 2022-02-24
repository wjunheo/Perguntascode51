package Baekjoon;


import java.util.Scanner;

public class AB2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = a + b -2;
        sc.close();
        System.out.println(answer);
    }
}