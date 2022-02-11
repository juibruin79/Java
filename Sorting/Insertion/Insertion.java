import java.util.*;

class Insertion{
	public static void main(String[] args){
		int[] lst = {5,3,2,4,6,1};
		Insertion sol = new Insertion();
		
		System.out.println(Arrays.toString(sol.insertionSort(lst)));
	}

	public int[] insertionSort(int[] lst){

		for(int i = 2; i <= lst.length; i++){
			int min = lst[i-1];
			int s = i -2;
			while(s >= 0 && min < lst[s]){
				lst[s+1] = lst[s];
				s--;
			}

			lst[s+1] = min;
			System.out.println(Arrays.toString(lst));
		}

		return lst;
	}
}