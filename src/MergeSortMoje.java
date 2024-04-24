public class MergeSortMoje{
    private static int[] array;
    private int elems;

    public MergeSortMoje(int m){
        array = new int[m];
        elems = 0;
    }

    public void insert(int value){
        array[elems] = value;
        elems++;
    }

    public void sort(){
        int[] nesto = new int[elems];
        mergeSort(array, 0, elems-1);
    }

    public void mergeSort(int a[], int low, int up){
        if (low == up){
            return;
        }

        else{
            int mid = (low + up) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid+1, up);
            merge(a, low, mid+1, up);
        }

    }

    public static void merge(int arr[], int l, int m, int h) {
        int leftSize = m - l + 1;
        int rightSize = h - m;

        // Create temporary arrays to hold left and right subarrays
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // Copy data to temporary arrays
        for (int i = 0; i < leftSize; i++)
            leftArray[i] = arr[l + i];
        for (int j = 0; j < rightSize; j++)
            rightArray[j] = arr[m + 1 + j];

        // Merge the two subarrays back into the original array
        int i = 0, j = 0, k = l;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left and right subarrays
        while (i < leftSize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public void print(){
        for(int i = 0; i < elems; i++){
            System.out.println(array[i]);
        }
    }

}



/*
		while (i < size1 && L[i] % 2 == 0) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Continue with the rest of the array
        while (i < size1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Reset indices for the second array
        i = 0;
        while (j < size2 && R[j] % 2 == 0) {
            arr[k] = R[j];
            j++;
            k++;
        }

        // Continue with the rest of the array
        while (j < size2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        */
	} 