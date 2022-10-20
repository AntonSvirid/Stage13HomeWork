package by.itstep.antonsvirid.stage13hm.model.logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task05LogicTest {
    @Test
    public void testCalculatorOfPercentOfFiveMark() {

        int[] vector = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        double expected = 20;

        double actual = Task05Logic.calculatorOfPercentOfFiveMark(vector);

        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void testCalculatorOfPercentOfFourMark() {

        int[] vector = {0, 3, 4, 5, 0, 1, 2, 3, 4, 5};
        double expected = 20;

        double actual = Task05Logic.calculatorOfPercentOfFourMark(vector);

        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void testCalculatorOfPercentOfThreeMark() {

        int[] vector = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        double expected = 20;

        double actual = Task05Logic.calculatorOfPercentOfThreeMark(vector);

        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void testCalculatorOfPercentOfTwoMark() {

        int[] vector = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        double expected = 20;

        double actual = Task05Logic.calculatorOfPercentOfTwoMark(vector);

        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void testCalculatorOfPercentOfOneMark() {

        int[] vector = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        double expected = 20;

        double actual = Task05Logic.calculatorOfPercentOfOneMark(vector);

        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void testCalculatorOfPercentOfZeroMark() {

        int[] vector = {0, 2, 3, 4, 5, 1, 0, 3, 4, 5};
        double expected = 20;

        double actual = Task05Logic.calculatorOfPercentOfZeroMark(vector);

        assertEquals(expected, actual, 0.001);
    }
}
