import java.util.* ;
import java.io.*; 
public class Solution {
    private static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            int current = arr.get(mid);
            if (current == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (current == 1) {
                mid++;
            } else if (current == 2) {
                swap(arr, mid, high);
                high--;
            }
        }
    }
}
