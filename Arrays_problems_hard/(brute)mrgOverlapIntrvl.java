import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
        // Write your code here.
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List< List< Integer > > ans=new ArrayList<>();

         int n = arr.length;
        for(int i=0; i<n ; i++){
            int start=arr[i][0];
            int end=arr[i][1];
            
            if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)){
                continue;
            }

            for(int j = i+1;j<n;j++){
                if(arr[j][0]<=end){
                    end=Math.max(end,arr[j][1]);
                }
                else{
                    break;
                }

            }
            ans.add(Arrays.asList(start, end));

        }
        return ans;

 

    }
}
