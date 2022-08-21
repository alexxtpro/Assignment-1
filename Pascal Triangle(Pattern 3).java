/*
Take N (number of rows), print the following pattern (for N = 6)
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

Constraints
0 < N < 100
-> Each number is separated from other by a tab.
*/

import java.util.*;
public class Main {
	static int binomialCoeff(int n, int k)
    {
        int res = 1;
          
        if (k > n - k)
        k = n - k;
              
        for (int i = 0; i < k; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   for(int i=0;i<n;i++){
		   for(int j=0;j<=i;j++){
			   System.out.print(binomialCoeff(i, j)+"	");
		   }
		   System.out.println();
	   }
    }
}
