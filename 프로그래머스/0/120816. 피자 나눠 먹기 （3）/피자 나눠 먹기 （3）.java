class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int pizza = 1;
        
        while(pizza*slice < n){
            pizza++;
        }
        
        return answer=pizza;
    }
}