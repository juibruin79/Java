// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> hs = new HashMap<>();

        for(int i : A){
            hs.put(i, hs.getOrDefault(i,0)+1);
        }

        for(int i : A){
            if(hs.get(i) == 1)
                return i;
        }

        return -1;
    }
}
