import java.util.*;

public class MergeSort{
	public static void main(String[] args){
		int[] lst = {15,6,20,1,5,8};
		int[] preSortL = {1,3,5};
		int[] preSortR = {2,4,6};
		MergeSort sol = new MergeSort();
		int[] ansPre = sol.merge(preSortL,preSortR);
		System.out.println("--preSort---");
		System.out.println(Arrays.toString(ansPre));
		System.out.println("------mergeSort-----");
		int[] ans = sol.mergeSort(lst);
		System.out.println("---Done---");
		System.out.println(Arrays.toString(ans));
	}

	public int[] mergeSort(int[] lst){
		if(lst.length == 1){
			return lst;
		}

		int[] leftLst = Arrays.copyOfRange(lst ,0, lst.length/2);
		
		leftLst = mergeSort(leftLst);
		
		int[] rightLst = Arrays.copyOfRange(lst,(lst.length/2), lst.length);
		
		rightLst = mergeSort(rightLst);

		int[] result = merge(leftLst, rightLst);

		System.out.println("---merge---");
		System.out.println(Arrays.toString(result));
		return result;
	} 

	private int[] merge(int[] leftLst, int[] rightLst){
		int[] result = new int[leftLst.length + rightLst.length];
		int i = 0, j =0, k = 0;
		while(i < leftLst.length || j < rightLst.length){
			if(i == leftLst.length){
				result[k] = rightLst[j];
				j++;
				k++;
			}else if(j == rightLst.length){
				result[k] = leftLst[i];
				i++;
				k++;
			}else if(leftLst[i] >= rightLst[j]){
				result[k] = rightLst[j];
				k++;
				j++;
			}else{
				result[k] = leftLst[i];
				i++;
				k++;
			}
		}

		return result;
	}
}