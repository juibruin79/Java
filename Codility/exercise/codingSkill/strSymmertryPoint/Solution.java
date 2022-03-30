// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        if(S.length() == 1)
            return 0;
        if(S.length() == 0 || S.length() % 2 == 0)
            return -1;

        int i = 0, j = S.length()-1;
        while(i < j){
            if(S.charAt(i) != S.charAt(j)){
                return -1;
            }
            i++;
            j--;
        }

        return i;

    }
}
