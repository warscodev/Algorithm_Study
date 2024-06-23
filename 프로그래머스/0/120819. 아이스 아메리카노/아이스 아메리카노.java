class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int aa = 5500;
        
        answer[0] = money/aa;
        answer[1] = money%aa;
        
        return answer;
    }
}