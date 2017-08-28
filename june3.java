import java.util.*;
 
class june3{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0)
		{
			int i=0,j=0,k=0,m=0,n=0;
			long sumA=0L,sumB=0L,one=0L,two=0L,three=0L;
			long sum=0L;
			int p=sc.nextInt();
			int q=sc.nextInt();
			int r=sc.nextInt();
			long[] A=new long[p];
			long[] B=new long[q];
			long[] C=new long[r];
 
			for(i=0;i<p;i++)
				A[i]=sc.nextLong();
			for(i=0;i<q;i++)
				B[i]=sc.nextLong();
			for(i=0;i<r;i++)
				C[i]=sc.nextLong();		
			Arrays.sort(C);
			Arrays.sort(B);
			Arrays.sort(A);	
			for(i=0;i<q;i++)
			{
				while(j<p && A[j]<=B[i])
					j++;
				while(k<r && C[k]<=B[i])
					k++;
				for(int x=m;x<j;x++)
					sumA=(sumA+A[x])%1000000007;
				for(int y=n;y<k;y++)
					sumB=(sumB+C[y])%1000000007;
				m=j;n=k;
				one=(sumA*sumB)%1000000007;
				two=(B[i]*(((sumA*k)%1000000007)+((sumB*j)%1000000007))%1000000007)%1000000007;
				three=(((B[i]*j)%1000000007)*((B[i]*k)%1000000007))%1000000007;
				sum=(sum+one+two+three)%1000000007;
			}
			System.out.println(sum);
			T--;
		}
	}
 
} 