package Baekjoon;

import java.util.Scanner;

public class Bigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            // while문으로 트루이면 돌게하고
            // a b 0일경우 break 로 에러 안뜨게한다다
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a ==0& b==0) {
                break;
            } else if(a>b){
                System.out.println("Yes");
            }else{
                System.out.println("No");

            }

        }
    }
}
