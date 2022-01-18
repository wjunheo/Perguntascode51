package Programmers;

import java.util.Scanner;

 class AlphabetDuplicateCheck {

    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                //charAt (i) i 번째 문자 반환
                //indexOf 문자 위치 값 리턴
                answer += str.charAt(i);

            }
        }
            return answer;
        }


    public static void main(String[] args) {
        AlphabetDuplicateCheck T = new AlphabetDuplicateCheck();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

     }
    }
