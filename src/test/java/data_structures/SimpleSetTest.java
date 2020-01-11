package data_structures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleSetTest {
    private SimpleSet simpleSet;

    @BeforeEach
    public void setup() {
        simpleSet = new SimpleSet();
    }

    @Test
    public void addWorks() {
        int value = 12;

        assertFalse(simpleSet.contains(value));
        simpleSet.add(value);
        assertTrue(simpleSet.contains(value));
    }

    @Test
    public void removeWorks() {
        int value = -11235;

        simpleSet.add(value);
        assertTrue(simpleSet.contains(value));
        simpleSet.remove(value);
        assertFalse(simpleSet.contains(value));
    }

    @Test
    public void addAndRemoveLots() {
        for (int i = 0; i < 10000; i++) {
            simpleSet.add(i);
            assertTrue(simpleSet.contains(i));
        }

        for (int i = 9999; i >= 0; i--) {
            simpleSet.remove(i);
            assertFalse(simpleSet.contains(i));
        }
    }
}