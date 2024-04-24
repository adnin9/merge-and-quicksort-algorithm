public class QuickSortDemo {
    public static void main(String[] args) {
        QuickSort demo = new QuickSort();
        char[] characters = {'r', 'd', 't', 'q', ',', '.', 'a', 'm', 'l', '.'};
        String str = new String(characters);
        
        System.out.println("Input array: " + str);
        
        String strSorted = new String (demo.sort(characters));
        
        System.out.println("Sorted array: " + strSorted);
    }
}
