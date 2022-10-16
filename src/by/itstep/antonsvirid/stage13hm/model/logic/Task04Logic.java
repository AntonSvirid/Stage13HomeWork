package by.itstep.antonsvirid.stage13hm.model.logic;

public class Task04Logic {
    public static int countOfEven(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new RuntimeException();
        }

        int countOfEven = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                countOfEven++;
            }
        }

        return countOfEven;
    }

}

