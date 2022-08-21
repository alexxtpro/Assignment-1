/*
Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers
but he loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t.

Help Chewbacca to transform the initial number x to the minimum possible positive number by 
inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't 
start with a zero.

Input Format
The first line contains a single integer x (1 ≤ x ≤ 10^18) — the number that Luke Skywalker gave to Chewbacca.

Constraints
x <= 100000000000000000


Sample Input
4545
Sample Output
4444
*/
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner in = new Scanner(System.in);
		String str = in.next();
		for(int i=0;i<str.length();i++){
			int temp = Character.getNumericValue(str.charAt(i));
			int out = 9-temp;
			if(temp==9 && i==0){
				System.out.print(temp);

			}else{
				if(out>temp){
				System.out.print(temp);
			}else{
				System.out.print(out);
			}
			}
			
			
		}
    }
}
