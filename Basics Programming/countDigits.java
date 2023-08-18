import java.util.*;
public class Solution {
    public static int countDigits(int n){
        // Write your code here.
    int org=n,count=0;
        for(;n>0;n/=10)
        {
            int ld=n%10;
            if(ld==0)
            continue;
            else if(org%ld==0){
                count++;

            }
        }
        return count;
        
    }
}
