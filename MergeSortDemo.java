public class MergeSortDemo {
    public static void main(String args[]) 
	{ 
		int arr[] = { 12, 11, 13, 5, 28, 6, 7, 9}; 
        MergeSort demo = new MergeSort(); 

		System.out.println("Input Array"); 
		demo.printArray(arr); 

		demo.sort(arr, 0, arr.length - 1); 

		//System.out.println("\nSorted array"); 
		//demo.printArray(arr); 

        demo.evenOddSort(arr);
        System.out.println("\nSorted array"); 
		demo.printArray(arr); 


	} 
}
