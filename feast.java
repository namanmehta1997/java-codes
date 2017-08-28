import java.util.*;
class feast{
	public static void main(String rgs[]){
		int p;
		Scanner in = new Scanner(System.in);
		p= in.nextInt();
		while(p>0){
			p--;
			int n = in.nextInt();
			int t[] = new int[n];
			boolean flag= true;
			long count=0,result=0,sum=0;
			for(int i=0;i<n;i++){
				t[i]=in.nextInt();
			}
			Arrays.sort(t);
			for(int i=n-1;i>=0;i--){
				if(t[i] >=0){
					sum = sum + t[i];
					count++;
				}
				else{
					long temp = sum * count ;
					long nextTemp = (sum + t[i])*(count+1);
					if(nextTemp > temp){
						count++;
						sum = sum + t[i];
					}
					else
						break;
				}
			}
			sum = sum*count;
			for(int i=0;i<n-count;i++){
				sum = sum + t[i];
			}
			System.out.println(sum);
		}
	}
}
