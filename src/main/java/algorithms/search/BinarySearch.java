package algorithms.search;

import java.util.List;

public class BinarySearch<T extends Comparable<T>> implements Search<T> {
    private List<T> _collection;
    private int _comparisons;

    public BinarySearch(List<T> collection) {
        _collection = collection;
        _comparisons = 0;
    }

    public boolean contains(T item) {
        return false;
    }

    public int getComparisons() {
        return _comparisons;
    }

    private int compare(T left, T right) {
        _comparisons++;

        return left.compareTo(right);
    }
}
