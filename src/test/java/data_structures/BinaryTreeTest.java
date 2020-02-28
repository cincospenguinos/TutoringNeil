package data_structures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    private BinaryTree root;

    @BeforeEach
    public void setup() {
        root = new BinaryTree();
    }

    @Test
    public void addWorks() {
        int value = 12;

        root.add(value);
        assertTrue(root.contains(value));
    }

    @Test
    public void addTwo() {
        int value1 = 12;
        int value2 = 52;

        root.add(value1);
        root.add(value2);

        assertTrue(root.contains(value1));
        assertTrue(root.contains(value2));
    }
}