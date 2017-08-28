import java.util.*;
class temp{
	public static void main(String args[]){
		int t;
		Scanner in = new Scanner(System.in);
		t=in.nextInt();
		while(t>0){
			t--;
			int n = in.nextInt();
			int h[] = new int[n];
			int firstIncr=-1;
			int maxIndex=0;
			for(int i=0;i<n;i++){
				h[i]=in.nextInt();
				if(i>0 && h[i-1] < h[i] && firstIncr==-1){
					firstIncr = i-1;
				}
			}
			if(firstIncr==-1){
				int c=0;
				for(int i=0;i<n-1;i++){
					if(h[i]==h[i+1]){
						c++;
					}
				}
				

				if(c==n-1){
					if(2*h[0]-1 <= n){
						int ans = h[0]*(h[0]-1) + (n - 2*h[0] +1)*h[0];
						System.out.println(ans);
						continue;
					}
					else{
						int ans=0;
						if(n%2 ==0){
							for(int i=1;i<n/2;i++){
								ans = ans + h[i] - i;
							}
							ans = ans + ans;
							ans = ans + h[n/2] - n/2;
							ans = ans + h[0];
							System.out.println(ans);
							continue;
						}
						else{
							for(int i=0;i<n/2;i++){
								ans = ans + h[i] - i -1 ;
							}
							ans = ans*2;
							ans = ans + h[0] - n/2 -1;
							System.out.println(ans);
							continue;
						}
					}
				}

				else{
					int result=0;
					if(n%2==0){
						for(int i=0;i<n/2;i++){
							result = result + h[i] - i - 1;
						}
						int count = n/2 -1 ;
						int j = n/2;
						while(count > 0){
							result = result + h[j] - count;
							count --; 
							j++;
						}
						result = result + h[n-1];
						System.out.println(result);
						continue;
					}
					else{
						for(int i=0;i<=n/2;i++){
							result = result + h[i] - i -1;
						}
						int count = n/2 ;
						int j= n/2+1;
						while(count>0){
							result = result + h[j] - count;
							count--;
							j++;
						}
						System.out.println(result);
						continue;
					}
				}
			}
			int c=0;
			for(int i=0;i<n-1;i++){
				if(h[i]<h[i+1])
					c++;
				}
				if(c==n-1){
					int result=0;
					if(n%2 ==0){
						for(int i=0;i<n/2;i++){
							result = result + h[i] - i -1;
						}
						int count = n/2 -1 ;
						int j = n/2;
						while(count > 0){
							result = result + h[j] - count;
							count--;
							j++;
						}
						result = result + h[n-1];
						System.out.println(result);
						continue;
					}
					else{
						for(int i=0;i<=n/2;i++){
							result = result + h[i] - i -1;
						}
						int count = n/2 ;
						int j= n/2+1;
						while(count>0){
							result = result + h[j] - count;
							count--;
							j++;
						}
						System.out.println(result);
						continue;
					}
				}
			for(int i=1;i<n-1;i++){
				if( h[i-1] < h[i] && h[i] > h[i+1]){
					maxIndex=i;
					break;
				}
			}
			int op=0;
			for(int i=0;i<firstIncr;i++){
					op=op+h[i];
			}
			int count=1;
			for(int j=firstIncr;j<=maxIndex;j++){
				op=op+h[j]-count;
				count++;
			}
			count--;
			count--;
			int i;
			for(i=maxIndex+1;count>=1;i++){
				op=op+h[i]-count;
				count--;
			}
			while(i<n){
				op=op+h[i];
				i++;
			}
			System.out.println(op);
		}
	}
}