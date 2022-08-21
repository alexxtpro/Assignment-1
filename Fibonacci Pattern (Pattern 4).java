/*
Take N (number of rows), print the following pattern (for N = 4)
0
1 1
2 3 5
8 13 21 34

Input Format
Constraints
0 < N < 100

Output Format
Sample Input
4
Sample Output
0 
1    1 
2    3     5 
8   13    21    34
*/

// code 
import java.util.*;
public class Main {
	static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
        
		for(int i=0;i<N;i++){
			int counter = 0;
			 while (counter <= i) {
            System.out.print(num1+"      ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
		System.out.println();
		}
       
    }
    public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Fibonacci(N);

    }
}
