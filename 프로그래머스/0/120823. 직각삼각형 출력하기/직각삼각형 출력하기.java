import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "*";
        String nextStar = "";
        for(int i = 1; i<=n; i++){
            System.out.println(star+nextStar);
            nextStar += star;
        }
    }
}