    import java.util.Random;

    public class main {
        public static void main(String[] args) {
            
            Random rand = new Random();

            int[] arr = new int[10000];
            for (int i = 0; i < 10000; i++) {
                arr[i] = rand.nextInt(100);
            }
            // mergesort
            // System.out.println("Before sorting: ");
            // for (int i = 0; i < arr.length; i++) {
            //     System.out.print(arr[i] + " ");
            // }
            // System.out.println("\n");
            
            long startTime = System.nanoTime();
            MergeSort.mergeSort(arr, 0, arr.length - 1);
            long endTime = System.nanoTime();
            System.out.println("Time taken: " + (endTime - startTime) + " ns");
            // for (int i = 0; i < arr.length; i++) {
            //     System.out.print(arr[i] + " ");
            // }

        }
    }

