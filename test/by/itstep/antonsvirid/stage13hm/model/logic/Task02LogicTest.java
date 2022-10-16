package by.itstep.antonsvirid.stage13hm.model.logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task02LogicTest {

    @Test
    public void testTask02LogicWithMirrorArray() {

        int[] vector = {1, 2, 3, 3, 2, 1};
        int expected = 4;

        int actual = Task02Logic.sort(vector);

        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void testTask02LogicWithMirrorArrayWithOddNumberOfNumbers() {

        int[] vector = {1, 2, 3, 2, 1};
        int expected = 4;

        int actual = Task02Logic.sort(vector);

        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void testTask02LogicWithNotMirrorArray() {

        int[] vector = {1, 2, 3, 4, 5, 6};
        int expected = 5;

        int actual = Task02Logic.sort(vector);

        assertEquals(expected, actual, 0.001);
    }

}
