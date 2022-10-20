package by.itstep.antonsvirid.stage13hm.model.logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task04LogicTest {
    @Test
    public void testTask04LogicForEven() {

        int[] vector = {1, 2, 3, 3, 8, 9};
        int expected = 2;

        int actual = Task04Logic.countOfEven(vector);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testTask04LogicForNotEven() {

        int[] vector = {1, 2, 3, 3, 8, 9};
        int expected = 4;

        int actual = Task04Logic.countOfNotEven(vector);

        assertEquals(expected, actual, 0.001);
    }
}
