import java.util.*;

class sumq{
	public static void main(String args[]){
		int t;
		Scanner in = new Scanner(System.in);
		t=in.nextInt();
		while(t>0){
			t--;
			int p,q,r;
			p = in.nextInt();
			q = in.nextInt();
			r = in.nextInt();
			int a[] = new int[p];
			int b[] = new int[q];
			int c[] = new int[r];
			for(int i=0;i<p;i++){
				a[i] = in.nextInt();
			}
			for(int i=0;i<q;i++){
				b[i] = in.nextInt();
			}
			for(int i=0;i<r;i++){
				c[i] = in.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			Arrays.sort(c);
			long result=0;
			long x[] = new long[p];
			long z[] = new long[r];
			x[0]=a[0];
			for(int i=1;i<p;i++){
				x[i]=x[i-1]+a[i];
			}
			z[0]=c[0];
			for(int i=1;i<r;i++){
				z[i]=z[i-1]+c[i];
			}
			long size=0;
			int n=0 , n1=0;
			for(int i=0;i<q;i++){	
				while(n<p && a[n]<=b[i]){
					n++;
				}
				while(n1<r && c[n1] <= b[i]){
					n1++;
				}
				size = (n)*(n1);
				if(n==0 || n1==0){
					continue;
				}
				result = (result + (size*(b[i]*b[i]))%1000000007 + (b[i]*(x[n-1]*n1 + z[n1-1]*n))%1000000007 + (x[n-1]*z[n1-1])%1000000007 )%1000000007; 
			}
			System.out.println(result);

		}
	}
}
