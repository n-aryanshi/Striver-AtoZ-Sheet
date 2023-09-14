public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
            int res =0;
        for(int i=0; i<n-1; i++){
            if(a[i]>a[i+1]){
                res= 0;
                break;
            }
            else
            res =1;
        }
        return res;
    }
}
