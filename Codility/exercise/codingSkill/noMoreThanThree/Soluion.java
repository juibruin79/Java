// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public String solution(int A, int B) {
        // write your code in Java SE 8
        String longStr = "";
        String result ="";
        char cL, cS;
        int lenL;
        int lenS;
        if(B == A){
            for(int i = 0; i < A; i++){
                result = result + 'a' + 'b';
            }

            return result;
        }



        if(B > A){
            cL = 'b';
            cS = 'a';
            lenL = B;
            lenS = A;
        }else{ 
            cL = 'a';
            cS = 'b';
            lenL = A;
            lenS = B;
        }
        int j = 0;
        for(int i = 0; i < lenS; i++){
            int flag = 0;
            while(j < lenL){
                if(flag != 2){
                    result = result + cL;
                    flag++;
                    j++;
                }else{
                    break;
                }
            }
            result =result + cS;
            
        }
        
        while(j < lenL){
            result = result + cL;
            j++;
        }
        //abbaabab
        return result;
    }
}
