package Baekjoon;

import java.util.Scanner;

public class b10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            String[] str= sc.next().split(",");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
                System.out.println(a+b);
            }
        }

    }

