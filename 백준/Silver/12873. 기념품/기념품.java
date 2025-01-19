import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 인원수를 입력받고
        int N = Integer.parseInt(br.readLine());
        // 게임 단계를 1로 초기화
        int t = 1;
        // 백준이 앞에 서는 사람(탈락자)의 index
        int cutIndex = 0;

        // 인원수 N명을 List에 담는다.
        List<Integer> participants = new ArrayList<>(N);
        for (int i = 1; i <= N; i++) {
            participants.add(i);
        }

        // 게임은 한명이 남을 때 까지 진행된다
        while (participants.size() > 1) {

            // t의 3제곱 만큼 참가자를 순회해야하므로 t의 3제곱을 구함
            long lastNumber = (long) t * t * t;

            // 탈락자 앞에 서는 경우를 구함
            // t의 3만큼 순회했을 때 마지막 앞에 서는 사람의 index를 구해야함
            // 새로운 탈락자는, 이전 탈락자의 다음 인덱스 부터 시작하여 lastNumber만큼 순회했을때 도달하는 사람.
            cutIndex = (int) ((cutIndex + lastNumber - 1) % participants.size());

            // 탈락자 제거
            participants.remove(cutIndex);

            // 한 단계 올림
            t++;
        }

        // 마지막 한 명 남은 참가자를 출력
        System.out.println(participants.get(0));
    }
}