package algorithms.search;

public interface Search<T extends Comparable<T>> {
    public boolean contains(T item);

    public int getComparisons();
}
