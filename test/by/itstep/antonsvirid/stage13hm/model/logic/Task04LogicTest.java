package by.itstep.antonsvirid.stage13hm.model.logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task04LogicTest {
    @Test
    public void testTask04Logic() {

        int[] vector = {1, 2, 3, 3, 8, 9};
        int expected = 2;

        int actual = Task04Logic.countOfEven(vector);

        assertEquals(expected, actual, 0.001);
    }
}
