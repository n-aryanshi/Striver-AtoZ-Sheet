import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
         
        String s = sc.next();
        char c = s.charAt(0);
        
        if(Character.isUpperCase(c))
        {
           System.out.println("1");
        }
        else if(Character.isLowerCase(c))
        {
            System.out.println("0");

        }
        else {
            System.out.println("-1");
        }
    }
}
