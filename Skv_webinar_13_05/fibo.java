// 0  1 1 2 3 5 8 13 .....

// Tn = Tn-1 + Tn-2

// recursion
// overlapping subproblems -> exponential -> expensive

// dynamic programing -> solve overlapping subproblems

// step 1 : define storage : 1D -> dp (Array)
// dp[n] = value of nth fibonacci number
// dp[0] = 0
// dp[1] = 1
//dp[2] = 1
// dp[n] = nth fibo number
public class fibo
{
    // tc : 2^n
    // recursion
    public static int fibo_rec(int n)
    {
        if(n==0) return 0;
        if(n==1) return 1;

       int f1 = fibo_rec(n-1);   // faith 1
       int f2 = fibo_rec(n-2);   // faith 2

       int ans  = f1 + f2;          // faith bridging idea

       return ans;
    }

    // memoization
    // t.c -> 0(n)
    public static int fibo_rec_memo(int n,int[] dp)
    {
        if(n==0) return 0;
        if(n==1) return 1;
        if(dp[n]!=0)
        {
            return dp[n];
        }
       int f1 = fibo_rec_memo(n-1,dp);   // faith 1
       int f2 = fibo_rec_memo(n-2,dp);   // faith 2
       int ans  = f1 + f2;          // faith bridging idea
       dp[n] = ans;
       return ans;
    }


    public static void main(String[] args)
    {
        int n = 5;
        System.out.print(fibo_rec(n));
    }

}