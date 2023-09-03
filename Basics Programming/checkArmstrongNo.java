import java.util.*;
public class Main {
	public static void main(String[] args) {
		// Write your code here
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		
		if(n==0 || n==1){
			flag = true;
			}
		else{
			int n1= n; // we are storing n in n1 as in the last originaal no. i.e. n becomes 0;
			int powercount = 0;
			while(n1>0){
				int ld = n1%10;
				powercount++;
				n1= n1/10;
				}

			int result = 0;	
			n1= n; //nd we have to use original no here thats why resetting it 
			while(n1>0){
				int ld = n1%10;
				int power = (int)Math.pow(ld,powercount);
				result = result + power;
				n1= n1/10;
				}
		
		if(n==result){
			flag = true;
		    }
		}
		System.out.println(flag);
	}
}
