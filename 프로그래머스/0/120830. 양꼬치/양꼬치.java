class Solution {
    public int solution(int n, int k) {
        int priceOfFoods = 12000*n;
        int priceOfDrinks = 2000*(k-(int)(0.1*n));
        
        return priceOfFoods + priceOfDrinks;
    }
}