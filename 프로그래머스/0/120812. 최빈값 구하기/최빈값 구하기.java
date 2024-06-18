import java.util.*;

class Solution {
    public int solution(int[] array) {
        int frequency = 0; //빈도수
        int mode = -1; //최빈값
        
        boolean isDuplicated = false;
        
        Map<Integer, Integer> numberMap = new HashMap<>();
        
        for (int num : array) {
            int count; 
            
            if (numberMap.containsKey(num)) {
                count = numberMap.get(num) + 1;
                numberMap.put(num, count);
            } else {
                count = 1;
                numberMap.put(num, count);
            }
            
            if (count > frequency) {
                frequency = count;
                mode = num;
                isDuplicated = false;
            } else if (count == frequency && mode != num) {
                isDuplicated = true;
            }
        }
        
        return isDuplicated ? -1 : mode;
    }
}