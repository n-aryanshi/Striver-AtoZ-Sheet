public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.

        int result =-1;
        while(n>0&&m>0){
            if(n>m){
                n=n%m;
            }
            else{
                m=m%n;
            }
        }
        if(m==0){
            result = n;
        }
        if(n==0){
            result = m;
        }

        return result;
        }
    }
