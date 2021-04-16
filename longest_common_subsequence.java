import java.io.*;
import java.util.*;
class Main{
	public static int longestCommonSubsequence(String text1, String text2) {
        char []x=text1.toCharArray();
        char []y=text2.toCharArray();
        int m=x.length;
        int n=y.length;
        int [][]dp=new int[m+1][n+1];
        
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0|| j==0)
                {
                    dp[i][j]=0;
                }
                if(i>0 && j>0)
                {
                    if(x[i-1]==y[j-1])
                    {
                        dp[i][j]=(1+dp[i-1][j-1]);
                    }
                    else
                    {
                        dp[i][j]= Math.max(dp[i][j-1],dp[i-1][j]);
                    }
                }
                
            }
        }
        return dp[m][n];
    }

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		String text1=scn.next();
		String text2=scn.next();
		System.out.println(longestCommonSubsequence(text1,text2));
		
	}
}