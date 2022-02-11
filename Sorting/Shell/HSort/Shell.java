import java.util.*;
//Shell Sort extends the idea of H-Sort

class Shell{
	public static void main(String[] args){
		int[] seq = {3,2,1};
		int[] lst = {3,1,5,4,6,2};

		Shell sol = new Shell();
		lst = sol.shellSort(lst, seq);
		System.out.println("---Result---");
		System.out.println(Arrays.toString(lst));
	}

	public int[] shellSort(int[] lst, int[] sequence){
		int[] result = lst;
		HSort h = new HSort();
		for(Integer i:sequence){
			result = h.hSort(result, i);
			System.out.println(Arrays.toString(result));
		}

		return result;
	}
}