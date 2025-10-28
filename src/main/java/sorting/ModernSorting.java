package sorting;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Modern sorting algorithms implementation using Java 21 features
 * Demonstrates enhanced language features and best practices
 */
public class ModernSorting {

    // Using AtomicInteger for thread-safe swap counting
    private static final AtomicInteger swapCount = new AtomicInteger(0);

    /**
     * Enhanced bubble sort with Java 21 features
     * @param arr array to sort
     * @return sorted array (defensive copy)
     */
    public static int[] bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr.clone();
        }

        int[] result = arr.clone(); // Defensive copy
        swapCount.set(0);

        for (int turn = 0; turn < result.length - 1; turn++) {
            boolean swapped = false;
            
            for (int j = 0; j < result.length - 1 - turn; j++) {
                if (result[j] > result[j + 1]) {
                    swap(result, j, j + 1);
                    swapped = true;
                }
            }
            
            // Early termination if no swaps occurred
            if (!swapped) {
                break;
            }
        }
        
        return result;
    }

    /**
     * Enhanced selection sort with modern Java features
     * @param arr array to sort
     * @return sorted array (defensive copy)
     */
    public static int[] selectionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr.clone();
        }

        int[] result = arr.clone();
        swapCount.set(0);

        for (int i = 0; i < result.length - 1; i++) {
            int minIndex = findMinIndex(result, i);
            
            if (minIndex != i) {
                swap(result, i, minIndex);
            }
        }
        
        return result;
    }

    /**
     * Find minimum element index starting from given position
     */
    private static int findMinIndex(int[] arr, int startIndex) {
        int minIndex = startIndex;
        
        for (int j = startIndex + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        
        return minIndex;
    }

    /**
     * Swap two elements in array and increment counter
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        swapCount.incrementAndGet();
    }

    /**
     * Print array with modern formatting using text blocks
     */
    public static void printArray(int[] arr, String sortType) {
        if (arr == null) {
            System.out.println("Array is null");
            return;
        }

        System.out.println("""
                %s Result:
                Array: %s
                Swaps: %d
                """.formatted(
                    sortType,
                    Arrays.toString(arr),
                    swapCount.get()
                ));
    }

    /**
     * Demonstrate different sorting algorithms
     */
    public static void demonstrateSorting() {
        int[] originalArray = {5, 3, 6, 2, 3, 1, 7};
        
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("=".repeat(50));

        // Bubble Sort
        var bubbleSorted = bubbleSort(originalArray);
        printArray(bubbleSorted, "Bubble Sort");

        // Selection Sort
        var selectionSorted = selectionSort(originalArray);
        printArray(selectionSorted, "Selection Sort");

        // Compare with built-in sort
        int[] javaSort = originalArray.clone();
        Arrays.sort(javaSort);
        System.out.println("Java Built-in Sort: " + Arrays.toString(javaSort));
    }

    /**
     * Performance comparison using switch expressions
     */
    public static String getSortingComplexity(String algorithm) {
        return switch (algorithm.toLowerCase()) {
            case "bubble" -> "O(n²) - Best: O(n), Worst: O(n²)";
            case "selection" -> "O(n²) - Consistent O(n²) performance";
            case "insertion" -> "O(n²) - Best: O(n), Worst: O(n²)";
            case "merge" -> "O(n log n) - Consistent performance";
            case "quick" -> "O(n log n) - Best: O(n log n), Worst: O(n²)";
            default -> "Unknown algorithm";
        };
    }

    public static void main(String[] args) {
        demonstrateSorting();
        
        System.out.println("\nTime Complexities:");
        String[] algorithms = {"bubble", "selection", "insertion", "merge", "quick"};
        
        for (var algorithm : algorithms) {
            System.out.println("%s sort: %s".formatted(
                algorithm.substring(0, 1).toUpperCase() + algorithm.substring(1),
                getSortingComplexity(algorithm)
            ));
        }
    }
}