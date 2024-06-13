class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int num1 = (numer1*denom2+numer2*denom1);
        int num2 = denom1*denom2;
        
        int max = Math.max(num1, num2);
        int GCD = 1;
        for(int i=1; i<=max; i++){
            if(num1%i==0 && num2%i ==0){
               GCD = i;
            }
        }
        
        int[] answer = {num1/GCD, num2/GCD};
        
        return answer;
    }
}