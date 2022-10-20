package by.itstep.antonsvirid.stage13hm.model.logic;

public class Task05Logic {
    public static double calculatorOfPercentOfFiveMark(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new RuntimeException();
        }

        int sumOfFive = 0;
        double percentOfFiveMark = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 5) {
                sumOfFive++;
            }
            percentOfFiveMark = (sumOfFive * 100.0) / vector.length;
        }
        return percentOfFiveMark;
    }

    public static double calculatorOfPercentOfFourMark(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new RuntimeException();
        }

        int sumOfFour = 0;
        double percentOfFourMark = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 4) {
                sumOfFour++;
            }
            percentOfFourMark = (sumOfFour * 100.0) / vector.length;
        }
        return percentOfFourMark;
    }

    public static double calculatorOfPercentOfThreeMark(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new RuntimeException();
        }

        int sumOfThree = 0;
        double percentOfThreeMark = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 3) {
                sumOfThree++;
            }
            percentOfThreeMark = (sumOfThree * 100.0) / vector.length;
        }
        return percentOfThreeMark;
    }

    public static double calculatorOfPercentOfTwoMark(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new RuntimeException();
        }

        int sumOfTwo = 0;
        double percentOfTwoMark = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 2) {
                sumOfTwo++;
            }
            percentOfTwoMark = (sumOfTwo * 100.0) / vector.length;
        }
        return percentOfTwoMark;
    }

    public static double calculatorOfPercentOfOneMark(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new RuntimeException();
        }

        int sumOfOne = 0;
        double percentOfOneMark = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 1) {
                sumOfOne++;
            }
            percentOfOneMark = (sumOfOne * 100.0) / vector.length;
        }
        return percentOfOneMark;
    }

    public static double calculatorOfPercentOfZeroMark(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new RuntimeException();
        }

        int sumOfZero = 0;
        double percentOfZeroMark = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0) {
                sumOfZero++;
            }
            percentOfZeroMark = (sumOfZero * 100.0) / vector.length;
        }
        return percentOfZeroMark;
    }

}