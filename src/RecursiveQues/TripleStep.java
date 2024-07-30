package RecursiveQues;


import java.util.Arrays;

public class TripleStep {
    public static void main(String[] args) {

        int way = 5;
        int[] dp = new int[way+1];
        for(int n : dp){
            Arrays.fill(dp,-1);
        }
        int ans = solve(way,dp,0);
        System.out.println(ans);
    }


    static int solve(int n,int[] dp){
        if(n <= 1){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = solve(n-2,dp) + solve(n-1,dp) + solve(n-3,dp);
    }
}
