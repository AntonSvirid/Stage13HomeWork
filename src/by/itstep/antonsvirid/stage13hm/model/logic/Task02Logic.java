package by.itstep.antonsvirid.stage13hm.model.logic;

public class Task02Logic {
    public static int sort(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new RuntimeException();
        }
        int sort = 4;                            // 4 == "Elements in vector are mirrored." in Printer

        int count = 1;

        for (int i = 0; i <= vector.length / 2; i++) {
            if (vector[i] != vector[vector.length - count]) {
                sort = 5;                       // 5 == "Elements in the vector are not mirrored." in Printer
                break;
            }
            count++;
        }

        return sort;
    }
}
