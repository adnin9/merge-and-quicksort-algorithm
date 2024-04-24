import java.util.Arrays;

class QuickSort {
    // calculate pivot index
    public int calcPivot(char[] arr){
        int sum = 0;
        // sum of ascii values
        for (int i = 0; i < arr.length; i++){
            char currentChar = arr[i];
            sum += sum + (int) currentChar;
        }

        int mid = sum / arr.length;
        int index = mid % arr.length;

        return index;
    }

    public void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // array partitioning
    public int partition(char[] arr, int low, int high){
        int index = calcPivot(Arrays.copyOfRange(arr, low, high + 1)) + low;
        char pivot = arr[index];

        swap(arr, index, high);

        int i = low - 1;

        for (int j = low; j < high; j++){
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    public char[] sort(char[] arr){
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    public void quickSort(char[] arr, int l, int h){
        if (l < h){
            int pivot = partition(arr, l, h);
            quickSort(arr, l, pivot - 1);
            quickSort(arr, pivot + 1, h);
        }
    }
}
