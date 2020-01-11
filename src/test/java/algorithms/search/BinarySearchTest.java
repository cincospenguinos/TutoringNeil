package algorithms.search;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void simpleSearch() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        BinarySearch<Integer> search = new BinarySearch<Integer>(list);
        assertTrue(search.contains(6));
        assertNotEquals(0, search.getComparisons());
        assertTrue(search.getComparisons() <= 3);
    }
}