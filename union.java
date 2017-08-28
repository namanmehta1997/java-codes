import java.util.*;

class union{
	public static void main(String rgs[]){
		int t;
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		while(t>0){
			t--;
			int n,k;
			n = in.nextInt();
			k = in.nextInt();
			int a[][] = new int[n][k+1];
			for(int i=0;i<n;i++){
				int len = in.nextInt();
				for(int j=0;j<len;j++){
					int x = in.nextInt();
					a[i][x] = 1;
				}
			}
			int count=0;
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					int temp=0;
					for(int z=1;z<=k;z++){
						if(a[i][z] == 1 || a[j][z] == 1)
							temp++;
						else
							break;
					}
					if(temp==k)
						count++;
				}
			}
			System.out.println(count);
		}
	}
}