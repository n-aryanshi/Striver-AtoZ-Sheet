import java.util.ArrayList;
 class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		int count = 1;

		for(int i=0; i<n-1 ; i++) {
			if( arr.get(i) != arr.get(i+1) ) { 
					count++ ; 
				}
		}return count;
	}
}
