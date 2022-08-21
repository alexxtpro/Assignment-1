
// Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int temp1 = 0;
        int temp2 = 1;
        int sum=0;
        for(int i=1;i<N;i++){
            sum = temp1+temp2;
            temp1=temp2;
            temp2=sum;
        }
		System.out.println(sum);
    }
}
