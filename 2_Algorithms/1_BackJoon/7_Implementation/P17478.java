import java.util.*;
import java.io.*;
import java.lang.*;

// 풀이
// https://velog.io/@halo_3735/%EA%B5%AC%ED%98%84-%EB%B0%B1%EC%A4%80-17478-%EC%9E%AC%EA%B7%80%ED%95%A8%EC%88%98%EA%B0%80-%EB%AD%94%EA%B0%80%EC%9A%94
public class P17478 {


    public static void gogo(int n, int cnt) {
        System.out.println("____".repeat(cnt) + "\"재귀함수가 뭔가요?\"");
        if (cnt == n) {
            System.out.println("____".repeat(cnt) + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            System.out.println("____".repeat(cnt) + "라고 답변하였지.");

            return;
        }
        System.out.println("____".repeat(cnt) + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        System.out.println("____".repeat(cnt) + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        System.out.println("____".repeat(cnt) + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");


        gogo(n, cnt + 1);
        System.out.println("____".repeat(cnt) + "라고 답변하였지.");

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N;

        N = sc.nextInt();
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        gogo(N, 0);


    }
}
