package data_structures;

public class BinaryTree {
    private int value;
    private boolean valueAssigned;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree() {
        valueAssigned = false;
    }

    private BinaryTree(int value) {
        this.value = value;
        valueAssigned = true;
    }

    public void add(int value) {
        if (valueAssigned) {
            left = new BinaryTree(value);
            return;
        }

        this.value = value;
        valueAssigned = true;
    }

    public boolean contains(int value) {
        if (valueAssigned && this.value == value) {
            return true;
        }

        if (left != null && left.contains(value)) {
            return true;
        }

        return false;
    }
}
