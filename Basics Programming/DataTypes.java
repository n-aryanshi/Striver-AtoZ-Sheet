import java.util.*;
public class Solution {
    public static int dataTypes(String type) {
        // Write your code here
       int val=0;

        if(type.equals("Integer")|| type.equals("Float")){
            val = 4;
        }
        if(type.equals("Long")|| type.equals("Double")){
            val = 8;
        }
        if(type.equals("Character")){
            val = 1;
        }
        return val;
        
    
}
}
