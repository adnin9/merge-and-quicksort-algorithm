public class MergeSort { 

    void sort(int arr[], int l, int r) { 
		if (l < r) { 
			int m = (l + r) / 2; 
 
			sort(arr, l, m); 
			sort(arr, m + 1, r); 

			merge(arr, l, r); 
		} 
	} 


	public void merge(int arr[], int l, int r) { 
        int evenCount = 0;
		int oddCount = 0;
        int size1 = 0;
        int size2 = 0;
		int m = (l+r)/2;
        
		for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
				System.out.println("ev con" + evenCount);
            }

			else if(arr[i] % 2 != 0){
                oddCount++;
				System.out.println("odd con" + oddCount);
			}
			
        }

		size1 = evenCount + 1;
		size2 = r - oddCount;./;''

		// Create temp arrays 
		int L[] = new int[size1]; 
		int R[] = new int[size2]; 

		// Copy data to temp arrays 
		for (int i = 0; i < size1; i++) 
			L[i] = arr[l + i]; 
		for (int j = 0; j < size2; j++) 
			R[j] = arr[m + 1 + j]; 

		// Merge the temp arrays 
		// Initial indexes of first and second subarrays 
		int i = 0, j = 0; 

		// Initial index of merged subarray array 
		int k = l; 

        while (i < size1 && j < size2) { 
			if (L[i] <= R[j]) { 
				arr[k] = L[i]; 
				i++; 
			} 
			else { 
				arr[k] = R[j]; 
				j++; 
			} 
			k++; 
		} 

		// Copy remaining elements of L[] if any 
		while (i < size1) { 
			arr[k] = L[i]; 
			i++; 
			k++; 
		} 

		// Copy remaining elements of R[] if any 
		while (j < size2) { 
			arr[k] = R[j]; 
			j++; 
			k++; 
		} 
    }


	// A utility function to print array of size n 
	void printArray(int arr[]) { 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	// Driver method 
	public static void main(String args[]) { 
		int ar[] = { 12, 11, 13, 5, 6, 7 }; 

		System.out.println("Given Array"); 
		printArray(ar); 

		// Calling of Merge Sort 
		MergeSort ob = new MergeSort(); 
		ob.sort(ar, 0, ar.length - 1); 

		System.out.println("\nSorted array"); 
		printArray(ar); 
	} 
}

