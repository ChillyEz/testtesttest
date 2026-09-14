public class main {
    public static void main(String[] args) {
        
        Integer[] arr = {10, 15, 17, 8, 32, 14, 22};
        // mergesort
        MergeSort.mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

