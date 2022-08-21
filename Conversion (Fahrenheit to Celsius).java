/*
Take the following as input.

Minimum Fahrenheit value
Maximum Fahrenheit value
Step

Print as output the Celsius conversions. Use the formula C = (5/9)(F – 32) E.g. for an input of 0, 100 and 20 the output is
0 -17
20 -6
40 4
60 15
80 26
100 37

*/
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner in = new Scanner(System.in);
		int minF = in.nextInt();
		int maxF = in.nextInt();
		int steps = in.nextInt();
		
		while(minF<=maxF){
			int C;
        C = ((5)*(minF-32));
       C=C/9;
       System.out.println(minF+" " +C);
       minF+=steps;
		}
		
    }
}
