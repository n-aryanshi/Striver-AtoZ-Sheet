import java.util.*;
public class Solution {
	public static String isPrime(int num) {
		//Your code goes here
		String prime = "YES";

			if(num==1){  //since constraints are taken from 1
				prime = "NO";
			}
			if(num==2){  //it is ony prime no. which is even
				prime = "YES";
			}
		 for(int i=2; i<Math.sqrt(num);i++){ //optimal soln
			if(num%i==0){
				prime = "NO";
				break;
		 		}
       }
	   return prime;
	}	  
	   
}
