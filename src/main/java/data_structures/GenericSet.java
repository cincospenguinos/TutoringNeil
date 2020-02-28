package data_structures;

public class GenericSet<TYPE> implements Set<TYPE> {
    private TYPE[] storage;
    private int endIndex;

    public GenericSet() {
        storage = (TYPE[]) new Object[8];
        endIndex = 0;
    }

    public void add(TYPE value) {
        storage[endIndex] = value;
        endIndex++;

        if (endIndex == storage.length) {
            grow();
        }
    }

    public void remove(TYPE value) {
        int indexToRemove = indexOf(value);

        if (indexToRemove >= 0) {
            storage[indexToRemove] = storage[endIndex];
            storage[endIndex] = null;
            endIndex--;
        }
    }

    public boolean contains(TYPE value) {
        return indexOf(value) >= 0;
    }

    private int indexOf(TYPE value) {
        for (int i = 0; i < endIndex; i++) {
            if (storage[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    private void grow() {
        TYPE[] newArray = (TYPE[]) new Object[storage.length * 2];

        for (int i = 0; i < endIndex; i++) {
            newArray[i] = storage[i];
        }

        storage = newArray;
    }
}
