package by.itstep.antonsvirid.stage13hm.model.logic;

public class Task01Logic {
     public static int sort(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new RuntimeException();
        }

        int sort = 3;                             // 3 == "Vector is not ordered." in InterpretationOfStatus
        boolean increase = true;
        boolean descending = true;

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < vector[i - 1]) {
                increase = false;
                break;
            }
        }

        if (increase == false) {
            for (int i = vector.length - 1; i > 0; i--) {
                if (vector[i] > vector[i - 1]) {
                    descending = false;
                    break;
                }
            }
        }

        if (increase == true) {
            sort = 1;                            // 1 == "Vector is increase ordered." in InterpretationOfStatus
        } else if (increase == false && descending == true) {
            sort = 2;                            // 2 == "Vector is descending ordered." in InterpretationOfStatus
        }

        return sort;
    }
}