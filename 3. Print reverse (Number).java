// Take N as input, Calculate it's reverse also Print the reverse.

import java.util.*;
public class Main{
    public static void main(String args[]) {
        // Your Code Here
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int rev = 0;
        while(N>0){
            int temp = N%10;
            rev = rev*10 +temp;
            N = N/10;

        }
        System.out.println(rev);
    }
}
