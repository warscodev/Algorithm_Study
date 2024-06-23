class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int oddCnt = 0;
        int evenCnt = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i]%2==0){
                evenCnt++;
            }else{
                oddCnt++;
            }
        }
        
        answer[0] = evenCnt;
        answer[1] = oddCnt;    
        
        return answer;
    }
}