import java.util.*;
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        
       int large=a[0]; //l=5
       int secLarge=Integer.MIN_VALUE;

        int small=a[0];
       int secSmall=Integer.MAX_VALUE;
      
                              
       for(int i=1; i<=n-1; i++) 
       {
           if(a[i]>large){  
           secLarge=large;
           large=a[i]; 
           }

           else if(a[i]<large && a[i]>secLarge ){ //
               secLarge=a[i];
           }
       
           if(a[i]<small){ 
               secSmall=small;
               small=a[i];
           }

           else if(a[i]>small && a[i]<secSmall){
               secSmall=a[i];

           }
       }


        int []arr= new int[2];
        arr[0]=secLarge;
        arr[1]=secSmall;

        return arr;
    }
}
