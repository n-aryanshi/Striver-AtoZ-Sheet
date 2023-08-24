public class Solution {
	public static long reverseBits(long n) {
		// Write your code here

		long [] binary = new long[32];
		int index = 0;
		 while(n>0)
		 {
			binary[index++]=n%2;
			n=n/2;
		 }

		 long base=1;
		long revdec= 0;
		 for(int i = 31; i>=0; i--){
			 revdec = revdec + (binary[i] * base);
			 base= base*2;

		 }
		 return revdec;
	}
}
