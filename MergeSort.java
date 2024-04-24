public class MergeSort { 

    public void sort(int arr[], int low, int high){ 
		if (low < high) { 
			int mid = (low + high) / 2; 

			sort(arr, low, mid); 
			sort(arr, mid + 1, high); 

			merge(arr, low, mid, high); 
		} 
	} 

	public void merge(int arr[], int l, int m, int h){ 
		int size1 = m - l + 1; 
		int size2 = h - m; 

		int L[] = new int[size1]; 
		int R[] = new int[size2]; 

		// copy data to temp arrays 
		for (int i = 0; i < size1; ++i) 
			L[i] = arr[l + i]; 
		for (int j = 0; j < size2; ++j) 
			R[j] = arr[m + 1 + j]; 

		// merge temp arrays 
		int i = 0;
        int j = 0; 
		int k = l; 
		while (i < size1 && j < size2){ 
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

		// kopirat ostatak L
		while (i < size1){ 
			arr[k] = L[i]; 
			i++; 
			k++; 
		} 

		// kopirat ostatak R
		while (j < size2){ 
			arr[k] = R[j]; 
			j++; 
			k++; 
		} 
	} 

    public void evenOddSort(int[] arr){
        int even = 0;
        int odd = 0;

		for(int z = 0; z < arr.length; z++){
			if (arr[z] % 2 == 0){
				even++;
			}
			else{
				odd++;
			}
        }

        int ind1 = 0;
        int ind2 = 0;

        int[] eArr = new int[even];
        int[] oArr = new int[odd];

        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                eArr[ind1++] = arr[i];
            }
        }

        for (int j = 0; j < arr.length; j++){
            if(arr[j] % 2 != 0){
                oArr[ind2++] = arr[j];
            }
        }

        //printArray(eArr); test
        //printArray(oArr); test


        for (int i = 0; i < eArr.length; i++){
            arr[i] = eArr[i];
        }

        for (int i = 0; i < oArr.length; i++){
            arr[even + i] = oArr[i];
        }

    }


	public void printArray(int arr[]){ 
		for (int i = 0; i < arr.length; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 
}

