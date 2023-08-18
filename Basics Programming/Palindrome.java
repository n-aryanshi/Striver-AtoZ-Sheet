import java.util.*;
public class Solution {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int num=n,res=0;
        for(;n>0;n/=10){
            int lasDigit=n%10;
            res=res*10+lasDigit;
        }
        if(num==res)
        return true;
        else        
        return false; 

    }
}
