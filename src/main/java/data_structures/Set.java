package data_structures;

public interface Set<TYPE> {
    public void add(TYPE value);
    public void remove(TYPE value);
    public boolean contains(TYPE value);
}
