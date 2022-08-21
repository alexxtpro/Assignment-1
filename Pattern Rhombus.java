/*
Take N (number of rows), print the following pattern (for N = 3).

                         1
                       2 3 2
                     3 4 5 4 3
                       2 3 2
                         1
Constraints
0 < N < 10
Each number is separated from other by a tab.

*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
		 Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i =1;i<=N;i++){
            int it = i;
            for(int j=1;j<=N-i;j++){
                System.out.print("       ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print(it+"      ");
                if(j<i){

                    it++;
                }else{
                    it--;
                }
            }
            System.out.println();
        }
        for(int i =1;i<N;i++){
            int it=N-i;
            for(int j=1;j<=i;j++){
                System.out.print("       ");
            }
            for(int j=1;j<=(N*2-1)-(i*2);j++){
                System.out.print(it+"      ");
                if(j<N-i){
                    it++;
                }else{
                    it--;
                }
            }

            System.out.println();
        }

    }
}
