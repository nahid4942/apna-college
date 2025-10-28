package week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Week 1 lecture examples upgraded to Java 21
 * Demonstrates collections, generics, and modern Java features
 */
public class ModernCollectionsDemo {

    /**
     * Demonstrate ArrayList operations with Java 21 features
     */
    public static void demonstrateArrayList() {
        // Using var for type inference (Java 10+)
        var numbers = new ArrayList<Integer>();
        
        // Adding elements using method chaining
        Collections.addAll(numbers, 4, 8, 15, 16, 23, 42);
        
        System.out.println("""
                ArrayList Operations Demo:
                ========================
                """);
        
        // Enhanced for-each with var
        System.out.print("Elements: ");
        for (var num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("Full list: " + numbers);
        System.out.println("Element at index 4: " + numbers.get(4));
        System.out.println("Size: " + numbers.size());
        
        // Demonstrate swap operation
        System.out.println("\nBefore swap: " + numbers);
        swap(numbers, 0, 4);
        System.out.println("After swapping indices 0 and 4: " + numbers);
    }

    /**
     * Enhanced swap method with proper error handling
     * @param list the list to perform swap on
     * @param i first index
     * @param j second index
     * @param <T> generic type parameter
     */
    public static <T> void swap(List<T> list, int i, int j) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        
        if (i < 0 || i >= list.size() || j < 0 || j >= list.size()) {
            throw new IndexOutOfBoundsException(
                "Invalid indices: i=%d, j=%d, list size=%d".formatted(i, j, list.size())
            );
        }
        
        if (i == j) {
            return; // No need to swap same indices
        }
        
        Collections.swap(list, i, j);
    }

    /**
     * Demonstrate pattern matching with lists (Java 21 preview)
     */
    public static void analyzeList(List<Integer> list) {
        var analysis = switch (list.size()) {
            case 0 -> "Empty list - nothing to analyze";
            case 1 -> "Single element list: " + list.get(0);
            case 2 -> "Pair: %s and %s".formatted(list.get(0), list.get(1));
            case int size when size <= 5 -> {
                var sum = list.stream().mapToInt(Integer::intValue).sum();
                yield "Small list with %d elements, sum: %d".formatted(size, sum);
            }
            case int size when size <= 10 -> {
                var avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
                yield "Medium list with %d elements, average: %.2f".formatted(size, avg);
            }
            default -> {
                var stats = list.stream().mapToInt(Integer::intValue).summaryStatistics();
                yield """
                      Large list analysis:
                      - Size: %d
                      - Min: %d
                      - Max: %d
                      - Average: %.2f
                      """.formatted(stats.getCount(), stats.getMin(), stats.getMax(), stats.getAverage());
            }
        };
        
        System.out.println("List Analysis: " + analysis);
    }

    /**
     * Demonstrate modern collection operations
     */
    public static void demonstrateStreamOperations() {
        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        System.out.println("""
                
                Stream Operations Demo:
                ======================
                """);
        
        // Filter even numbers and square them
        var evenSquares = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList(); // Java 16+ toList()
        
        System.out.println("Original: " + numbers);
        System.out.println("Even numbers squared: " + evenSquares);
        
        // Find sum of odd numbers
        var oddSum = numbers.stream()
                .filter(n -> n % 2 == 1)
                .mapToInt(Integer::intValue)
                .sum();
        
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    /**
     * Demonstrate record usage (Java 14+)
     */
    public record Point(int x, int y) {
        public Point {
            if (x < 0 || y < 0) {
                throw new IllegalArgumentException("Coordinates must be non-negative");
            }
        }
        
        public double distanceFromOrigin() {
            return Math.sqrt(x * x + y * y);
        }
    }

    public static void demonstrateRecords() {
        System.out.println("""
                
                Records Demo:
                =============
                """);
        
        var points = List.of(
            new Point(3, 4),
            new Point(0, 5),
            new Point(8, 6),
            new Point(1, 1)
        );
        
        points.forEach(point -> 
            System.out.println("Point %s - Distance from origin: %.2f"
                .formatted(point, point.distanceFromOrigin()))
        );
    }

    public static void main(String[] args) {
        demonstrateArrayList();
        
        // Analyze different list sizes
        var smallList = List.of(1, 2, 3);
        var mediumList = List.of(1, 2, 3, 4, 5, 6, 7);
        var largeList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        
        analyzeList(List.of());
        analyzeList(smallList);
        analyzeList(mediumList);
        analyzeList(largeList);
        
        demonstrateStreamOperations();
        demonstrateRecords();
    }
}