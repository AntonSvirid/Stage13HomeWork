package by.itstep.antonsvirid.stage13hm.model.logic;

public class Task03Logic {
    public static int sort(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new RuntimeException();
        }

        int sort = 6;               // 6 == "Vector elements are equal to each other." in InterpretationOfStatus

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] != vector[i - 1]) {
                sort = 7;           // 7 == "Vector elements are not equal to each other." in InterpretationOfStatus
                break;
            }
        }

        return sort;
    }
}
