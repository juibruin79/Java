import java.util.*;

public class QuickSort{
	public static void main(String[] args ){
		int[] lst = {30,1,77,13,69,40,21,46};
		QuickSort sol = new QuickSort();
		// System.out.println("---Partition---");
		// int pivot = sol.partition(lst, 0, 7);
		// System.out.println(pivot);
		// System.out.println(Arrays.toString(lst));

		sol.quickSort(lst, 0, lst.length-1);
		System.out.println("---Done---");
		System.out.println(Arrays.toString(lst)); 
	}

	public void quickSort(int[] lst, int first, int last){

		if(last - first >= 1){
			int pivotIndex = partition(lst, first, last);
			System.out.println("Left");
			quickSort(lst, first, pivotIndex-1);

			System.out.println("Right");
			quickSort(lst, pivotIndex+1, lst.length-1);
		}

	}

	//return pivot index
	private int partition(int[] lst, int low, int high){
		int pivot = lst[low];
		//System.out.println(pivot);
		int pi = low;

		do{
		 	while(pivot >= lst[low] && low <= high){
		 		low++;
		 	}

		 	while(pivot < lst[high]){
		 		high--;
		 	}

		 	if(high > low){
		 		int temp = lst[high];
		 		lst[high] = lst[low];
		 		lst[low] = temp;
		 	}

		}while(high > low);

		int temp = lst[pi];
		lst[pi] = lst[high];
		lst[high] = temp;
		pi = high;
		System.out.println(Arrays.toString(lst));
		return pi; // return pivot index
	}
		
	
}