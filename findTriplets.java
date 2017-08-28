import java.util.*;

class findTriplets{
	public static void main(String args[]){
		int arr[]={12, 3, 4, 1, 6, 9};
		Arrays.sort(arr);
		for(int i=0;i<5;i++){
			int l=i+1,r=5;
			while(l<r)
			{
				if(arr[l]+arr[r]+arr[i]==8)
					{
						System.out.print(arr[l]+" "+arr[r]+" "+arr[i]);
						break;
					}
				else if(arr[l]+arr[r]+arr[i]>8)
					r--;
				else
					l++;
			}
		}

	}
}