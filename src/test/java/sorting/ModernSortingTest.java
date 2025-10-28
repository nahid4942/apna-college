package sorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for ModernSorting using JUnit 5 and Java 21 features
 */
@DisplayName("Modern Sorting Algorithms Tests")
class ModernSortingTest {

    @Nested
    @DisplayName("Bubble Sort Tests")
    class BubbleSortTests {

        @Test
        @DisplayName("Should sort empty array")
        void shouldSortEmptyArray() {
            var input = new int[]{};
            var result = ModernSorting.bubbleSort(input);
            assertArrayEquals(new int[]{}, result);
        }

        @Test
        @DisplayName("Should sort single element array")
        void shouldSortSingleElementArray() {
            var input = new int[]{42};
            var result = ModernSorting.bubbleSort(input);
            assertArrayEquals(new int[]{42}, result);
        }

        @Test
        @DisplayName("Should sort already sorted array")
        void shouldSortAlreadySortedArray() {
            var input = new int[]{1, 2, 3, 4, 5};
            var result = ModernSorting.bubbleSort(input);
            assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
        }

        @Test
        @DisplayName("Should sort reverse sorted array")
        void shouldSortReverseSortedArray() {
            var input = new int[]{5, 4, 3, 2, 1};
            var result = ModernSorting.bubbleSort(input);
            assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
        }

        @Test
        @DisplayName("Should sort array with duplicates")
        void shouldSortArrayWithDuplicates() {
            var input = new int[]{5, 3, 6, 2, 3, 1, 7};
            var result = ModernSorting.bubbleSort(input);
            assertArrayEquals(new int[]{1, 2, 3, 3, 5, 6, 7}, result);
        }
    }

    @Nested
    @DisplayName("Selection Sort Tests")
    class SelectionSortTests {

        @Test
        @DisplayName("Should sort empty array")
        void shouldSortEmptyArray() {
            var input = new int[]{};
            var result = ModernSorting.selectionSort(input);
            assertArrayEquals(new int[]{}, result);
        }

        @Test
        @DisplayName("Should sort random array")
        void shouldSortRandomArray() {
            var input = new int[]{64, 34, 25, 12, 22, 11, 90};
            var result = ModernSorting.selectionSort(input);
            assertArrayEquals(new int[]{11, 12, 22, 25, 34, 64, 90}, result);
        }

        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> {
                var result = ModernSorting.selectionSort(null);
                assertNull(result);
            });
        }
    }

    @Nested
    @DisplayName("Complexity Analysis Tests")
    class ComplexityTests {

        @ParameterizedTest
        @ValueSource(strings = {"bubble", "selection", "insertion", "merge", "quick"})
        @DisplayName("Should return complexity for known algorithms")
        void shouldReturnComplexityForKnownAlgorithms(String algorithm) {
            var complexity = ModernSorting.getSortingComplexity(algorithm);
            assertNotNull(complexity);
            assertFalse(complexity.equals("Unknown algorithm"));
            assertTrue(complexity.contains("O("));
        }

        @Test
        @DisplayName("Should return unknown for unsupported algorithm")
        void shouldReturnUnknownForUnsupportedAlgorithm() {
            var complexity = ModernSorting.getSortingComplexity("unsupported");
            assertEquals("Unknown algorithm", complexity);
        }
    }

    @Test
    @DisplayName("Should not modify original array")
    void shouldNotModifyOriginalArray() {
        var original = new int[]{5, 3, 6, 2, 3, 1, 7};
        var originalCopy = original.clone();
        
        ModernSorting.bubbleSort(original);
        ModernSorting.selectionSort(original);
        
        assertArrayEquals(originalCopy, original, 
            "Original array should not be modified by sorting methods");
    }
}