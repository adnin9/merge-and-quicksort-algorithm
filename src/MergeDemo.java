public class MergeDemo {
    public static void main(String[] args) throws Exception {
        int arr[] = { 12, 11, 13, 5, 6, 7 }; 

		System.out.println("Given Array"); 
		printArray(arr); 

		// Calling of Merge Sort 
		MergeSort ob = new MergeSort(); 
		ob.sort(arr, 0, arr.length - 1); 

		System.out.println("\nSorted array"); 
		printArray(arr); 

    }
}
