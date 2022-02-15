import java.util.*;

class Bubble{
	public static void main(String[] args){
		int[] lst = {6,5,3,4,2,1};
		Bubble sol = new Bubble();
		System.out.println("init : " + Arrays.toString(lst));
		lst = sol.bubbleSort(lst);
		System.out.println(Arrays.toString(lst));

	}

	public int[] bubbleSort(int[] lst){
		boolean hasSwap = true;
		while(hasSwap){
			hasSwap = false;
			for(int i = 0; i < lst.length-1; i++){
				if(lst[i] > lst[i+1]){
					int temp = lst[i];
					lst[i] = lst[i+1];
					lst[i+1] = temp;
					System.out.println(temp + " swap " + lst[i]);

					hasSwap = true;
				}
				
			}

			System.out.println("func " + Arrays.toString( lst));
		}

		return lst;
	}
}