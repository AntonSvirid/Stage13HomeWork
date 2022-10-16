package by.itstep.antonsvirid.stage13hm.model.logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task01LogicTest {

    @Test
    public void testTask01LogicWithIncreaseArray() {

        int[] vector = {1, 2, 3, 4, 5, 6};
        int expected = 1;

        int actual = Task01Logic.sort(vector);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testTask01LogicWithDescendingArray() {

        int[] vector = {6, 5, 4, 3, 2, 1};
        int expected = 2;

        int actual = Task01Logic.sort(vector);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testTask01LogicWithNotSortedArray() {

        int[] vector = {6, 1, 5, 2, 4, 3};
        int expected = 3;

        int actual = Task01Logic.sort(vector);

        assertEquals(expected, actual, 0.001);
    }
}
