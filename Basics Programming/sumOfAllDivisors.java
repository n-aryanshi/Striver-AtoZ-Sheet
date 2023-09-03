public class Solution {
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int sum=0;
       
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(int)Math.sqrt(i); j++) {

                //n=x*y
                if(i%j==0){
                   int x=j;
                   int y=i/j;
                  
                   if(x==y){
                      sum = sum + x;
                      }
                   else{
                     sum = sum + x + y;
                    }
                }
          }
      }
       return sum;
  }
}
