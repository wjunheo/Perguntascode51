package Baekjoon;

import java.util.Scanner;

public class shootTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            } else {

                if (3 * n % 2 == 0) {
                    n = 3 * n;
                    n = n / 2;
                    n = 3 * n;
                    n = n / 9;
                    i++;
                    System.out.println(i+". "+"even" + " " + n);
                } else {
                    n = 3 * n;
                    n = (n + 1) / 2;
                    n = 3 * n;
                    n = n / 9;
                    i++;
                    System.out.println(i+". "+"odd" + " " + n);
                }
            }
        }
    }
}
