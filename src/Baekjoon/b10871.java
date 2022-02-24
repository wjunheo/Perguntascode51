package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class b10871 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> answer = new ArrayList<>();

        int N = sc.nextInt();
        int X = sc.nextInt();

        for (int i = 0; i < N; i++) {
            answer.add(sc.nextInt());
            System.out.println("넣음");

            if (answer.get(i) < X) {
                System.out.print("정답"+ answer.get(i) + " ");

            }

        }
    }
}