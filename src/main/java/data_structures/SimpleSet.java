package data_structures;

/**
 * A set is a data structure that holds
 */
public class SimpleSet {
    private int[] storage;
    private int endIndex;

    public SimpleSet() {
        storage = new int[8];
        endIndex = 0;
    }

    public void add(int value) {
        storage[endIndex] = value;
        endIndex++;

        if (endIndex == storage.length) {
            grow();
        }
    }

    public boolean contains(int value) {
        if (indexOf(value) != -1) {
            return true;
        }

        return false;
    }

    public void remove(int value) {
        int indexToRemove = indexOf(value);

        if (indexToRemove > -1) {
            storage[indexToRemove] = storage[endIndex];
            endIndex--;
        }
    }

    private void grow() {
        int[] newArray = new int[storage.length * 2];

        for (int i = 0; i < endIndex; i++) {
            newArray[i] = storage[i];
        }

        storage = newArray;
    }

    private int indexOf(int value) {
        for (int i = 0; i < endIndex; i++) {
            if (storage[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
