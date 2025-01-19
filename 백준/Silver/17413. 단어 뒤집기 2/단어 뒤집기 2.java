import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        StringBuilder temp = new StringBuilder();
        StringBuilder result = new StringBuilder();
        boolean isTag = false;

        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(c == '<'){
                // 태그인 경우 -> 직전 까지 단어를 뒤집어서 저장
                isTag = true;
                temp.reverse();
                result.append(temp);
                temp.setLength(0);  // 임시 문자열 초기화
                result.append(c);
            } else if(c == '>') {
                // 태그가 닫히면 그대로 결과에 저장
                isTag = false;
                result.append(c);
            } else if(isTag) {
                // 태그 내부면 그대로 저장
                result.append(c);
            } else {
                if(c==' '){
                    // 태그 내부가 아니면서 공백이면 앞에까지 뒤집어서 저장
                    result.append(temp.reverse());
                    temp.setLength(0);
                    result.append(c); // 이후에 공백도 저장해줌
                }else {
                    // 나머지는 임시 결과에 저장
                    temp.append(c);
                }
            }
        }

        result.append(temp.reverse());

        System.out.println(result);
    }


}