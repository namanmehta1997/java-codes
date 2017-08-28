import java.util.*;
 
class june555{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0)
		{
			int i=0,j=0,hap=0,psum=0,temp=0;
			int N=sc.nextInt();
			int[] a=new int[N];
			for(i=0;i<N;i++)
				a[i]=sc.nextInt();	
			Arrays.sort(a);
			for( int k = 0;k<N/2;++k ) 
			{ 
			  temp = a[k]; 
			  a[k] = a[N-k-1]; 
			  a[N-k-1] = temp; 
			}
			i=0;		
			while(i<N)
			{
				if(a[i]>=0)
					psum+=a[i++];
				else
					break;				
			}
			while(i<N)
			{
				if((a[i]*i+psum)>=0)
					psum+=a[i++];
				else
					break;
			}
			hap=psum*i;
			while(i<N)
				hap+=a[i++];
			System.out.println(hap);
			T--;
		}
	}
 
}