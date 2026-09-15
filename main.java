    import java.util.Random;

    public class main {
        public static void main(String[] args) {
            
            Random rand = new Random();

            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) {
                arr[i] = rand.nextInt(100);
            }
            // mergesort
            // System.out.println("Before sorting: ");
            // for (int i = 0; i < arr.length; i++) {
            //     System.out.print(arr[i] + " ");
            // }
            // System.out.println("\n");
            
            long startTime = System.nanoTime();
            InsertionSort.insertionSort(arr);
            long endTime = System.nanoTime();
            System.out.println("Time taken: " + (endTime - startTime) + " ns");
            // for (int i = 0; i < arr.length; i++) {
            //     System.out.print(arr[i] + " ");
            // }

        }
    }

