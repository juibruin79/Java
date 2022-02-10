import java.util.*;

class Selection{
	public static void main(String[] args){

		int[] arr = {2,3,1,5};
		Selection sol = new Selection();
		int[] solArr = sol.selectionSort(arr);
		System.out.println(Arrays.toString(solArr));
	}

	public int[] selectionSort(int[] lst){

		for(int i = 0; i < lst.length; i++){
			int min = lst[i];
			int minDex = i;
			for(int j = i +1 ; j < lst.length; j++){
				if(min > lst[j]){
					min = lst[j];
					minDex = j;
				}
			}
			int temp = lst[i];
			lst[i] = min;
			lst[minDex] = temp; 
		}

		return lst;
	}
}