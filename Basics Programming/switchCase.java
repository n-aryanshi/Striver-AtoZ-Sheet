import java.util.*;
import static java.lang.Math.PI;
public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        double area = 0.0;
        // Write your code here
        switch(ch) {
            case 1 : {
                area = PI*a[0]*a[0];
           }
           break;

           case 2 : {
               area = a[0] * a[1];
           }
           break;
        }return area;


    }
}
