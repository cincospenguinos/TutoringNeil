package data_structures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericSetTest {
    private GenericSet<String> genericSet;

    @BeforeEach
    public void setup() {
        genericSet = new GenericSet<String>();
    }

    @Test
    void add() {
        genericSet.add("Hello");
        assertTrue(genericSet.contains("Hello"));
    }

    @Test
    void remove() {
        genericSet.add("Hello");
        assertTrue(genericSet.contains("Hello"));
        genericSet.remove("Hello");
        assertFalse(genericSet.contains("Hello"));
    }

    @Test
    public void addAndRemoveLots() {
        for (int i = 0; i < 10000; i++) {
            genericSet.add(Integer.toString(i));
            assertTrue(genericSet.contains(Integer.toString(i)));
        }

        for (int i = 9999; i >= 0; i--) {
            genericSet.remove(Integer.toString(i));
            assertFalse(genericSet.contains(Integer.toString(i)));
        }
    }
}