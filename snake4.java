import java.util.*;
class snake4{
	public static void main(String args[]){
		int t;
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		while(t>0){
			t--;
			int n_snake,q;
			n_snake=in.nextInt();
			q = in.nextInt();
			int length[] = new int[n_snake];
			for(int i=0;i<n_snake;i++){
				length[i] = in.nextInt();
			}
			Arrays.sort(length);
			for(int i=0;i<q;i++){
				int k = in.nextInt();
				int index = snake4.search(length,n_snake,k-1)+1;
				int dynamic_arr[] = new int[n_snake];
				for(int ii=0;ii<n_snake;ii++){
					dynamic_arr[ii]=k-length[ii];
				}
				int j=0;
				while(dynamic_arr[j]>0){
					j++;
				}
				int y_index=j;
				int sum=0;
				int count=n_snake-y_index-1;
				while(sum<index/2){
					sum=sum+dynamic_arr[y_index];
					y_index--;
					count++;
				}
				System.out.println(count);

			}
		}
	}

	public static int search(int arr[],int numElems,int target){
		int low = 0, high = numElems; 
		while (low != high) {
		    int mid = (low + high) / 2;
		    if (arr[mid] <= target) {
		        low = mid + 1;
		    }
		    else {
		        high = mid;
		    }
		}
		return low;
	} 
}