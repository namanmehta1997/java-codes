import java.util.*;
class goodset{
	public static void main(String rgs[]){
		int p;
		Scanner in = new Scanner(System.in);
		p= in.nextInt();
		while(p>0){
			p--;
			int n = in.nextInt();
			int a=300;
			while(n>0){
				n--;
				System.out.println(a);
				a++;
			}
		}
	}
}