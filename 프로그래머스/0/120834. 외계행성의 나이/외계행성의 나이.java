class Solution {
    public String solution(int age) {
        String[] alphabet = new String[10];
        char currentChar = 'a';

        for (int i = 0; i < 10; i++) {
            alphabet[i] = String.valueOf(currentChar);
            currentChar++;
        }
        
        String ageToString = Integer.toString(age);
        StringBuilder sb = new StringBuilder();
        
        for(int j=0; j < ageToString.length(); j++){
           sb.append(alphabet[Integer.parseInt(ageToString.substring(j,j+1))]);
        }
        
        return sb.toString();
    }
}