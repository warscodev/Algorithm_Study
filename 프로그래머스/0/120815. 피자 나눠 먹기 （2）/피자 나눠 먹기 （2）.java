class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 1;
        int sliceOfPizza = 6;
        
        // 사람이 1명이면 혼자 6조각 먹음
        // 두 명이면 1판을 3조각씩
        // 세 명이면 2조각씩
        // 피자 조각의 수가 사람 수의 배수 중 가장 작은 수여야함. (최소 공배수)
        // sliceOfPizza%n == 0 이어야 하는 수 중에 가장 작은 수
        while(sliceOfPizza%n != 0){
            pizza++;
            sliceOfPizza+=6;
        }
        
        return answer=pizza;
    }
}