import java.util.*;
class xenny{
	public static void main(String args[]){
		int t;
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		while(t>0){
			t--;
			long u = in.nextLong();
			long v = in.nextLong();
			long start = (u+1)*(u+2)/2;
			long result = start + (v)*(u+1) + (v*(v-1))/2; 
			System.out.println(result);
		}
	}
}