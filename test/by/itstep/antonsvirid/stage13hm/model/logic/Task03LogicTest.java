package by.itstep.antonsvirid.stage13hm.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;


public class Task03LogicTest {
    @Test
    public void testTask03LogicWithNotEqualDigitsInArray() {

        int[] vector = {1, 2, 3, 3, 7, 9};
        int expected = 7;

        int actual = Task03Logic.sort(vector);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testTask03LogicWithEqualDigitsInArray() {

        int[] vector = {4, 4, 4, 4, 4};
        int expected = 6;

        int actual = Task03Logic.sort(vector);

        assertEquals(expected, actual, 0.001);
    }

}
