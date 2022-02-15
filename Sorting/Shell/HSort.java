package hsort;
import java.util.*;

public class HSort{
	public static void main(String[] args){
		int[] lst = {3,2,1,6,5,4};
		HSort sol = new HSort();
		System.out.println("-----Result---");
		System.out.println(Arrays.toString(sol.hSort(lst, 2)));
	}

	public int[] hSort(int[] lst, int h){
		boolean hasSwap = true;
		
		while(hasSwap){
			for(int i = 0; i < lst.length-h; i++){
				hasSwap = false;
				if(lst[i] > lst[i+h]){
					int temp = lst[i];
					lst[i] = lst[i+h];
					lst[i+h] = temp; 
					hasSwap = true;
				}
			}

			System.out.println(Arrays.toString(lst));
		}
		
		return lst;
	}
}