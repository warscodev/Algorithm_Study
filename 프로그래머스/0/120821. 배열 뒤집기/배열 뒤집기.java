class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        // num_list.length=100;
        // i = 99;
        // answer[100-99-1] = num_list[99];
        for(int i = num_list.length-1; i>=0; i--){
            answer[num_list.length-i-1] = num_list[i];
        }
        
        return answer;
    }
}