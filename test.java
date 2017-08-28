class test{
	public static void main(String args[]){
		int arr[] = {0,1,3,4,6,8};
		System.out.println(searchGreater(arr,6,100));
		System.out.println(searchLess(arr,6,-10));
	}

	public static int searchGreater(int arr[],int numElems,int target){
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
		if(low==numElems){
			low = -1;
		}
		return low;
	}

	public static int searchLess(int arr[],int numElems,int target){
		int low = 0, high = numElems; 
		while (low != high) {
		    int mid = (low + high) / 2;
		    if (arr[mid] >= target) {
		        high = mid - 1;
		    }
		    else {
		        low = mid;
		    }
		}
		if(low == 0){
			low = -1;
		}
		return low;
	}
}