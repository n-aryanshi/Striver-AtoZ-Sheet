import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here

		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int even = 0;
		int odd = 0 ;

		while (n>0)
		{
			int lastDigit = n%10;

			if(lastDigit%2==0 ){
			even= even+lastDigit;
		}
		else{
			odd = odd+lastDigit;
		}
			 n= n/10;
		}
		System.out.println(even + " " + odd);

	}
}
