// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {


    public static void main(String[] args){
        System.out.println("test");
    }
    public int solution(Tree T) {
        // write your code in Java SE 8
        return treeHeight(T, 0);
    }

    public int treeHeight(Tree T, int height){
        if(T == null){
            return height-1;
        }

        return Math.max(treeHeight(T.l, height + 1), treeHeight(T.r, height + 1));
    }


}

class Tree{
    public int x ;
    public Tree l;
    public Tree r;        
}