/*
Take the following as input.

A number (N1)
A number (N2)
Write a function which returns the LCM of N1 and N2. Print the value returned.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt();
		int lcm=1;
		int it = 2;
		while(n1>1 || n2>1){
				if(n1%it==0 && n2%it==0){
					n1/=it;
					n2/=it;
					lcm*=it;
				}
				else if(n1%it==0){
					n1/=it;
					lcm*=it;
				}else if(n2%it==0){
					n2/=it;
					lcm*=it;
				}else{
					it++;
				}

		}
		System.out.println(lcm);

    }
}
