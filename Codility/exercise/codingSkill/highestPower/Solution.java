// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int tot = 1;
        int max = 0;
        int init = 2; 
        while(init < N){
            if(N % init == 0)
               max = Math.max(tot, max);
            tot++;
            init = init << 1;
        }

        return max;
    }
}
