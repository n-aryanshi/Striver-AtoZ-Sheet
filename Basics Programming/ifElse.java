import java.util.Scanner;
public class Solution {
    public static String compareIfElse(int a, int b) {
        // Write your code here
        
        String str =" ";
        if(a>b){
             str = "greater";
        }

        if(a<b){
            str = "smaller";
        }

        if(a==b){
            str = "equal";
                    }
                    return str;
}
}
