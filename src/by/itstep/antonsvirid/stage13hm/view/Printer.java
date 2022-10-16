package by.itstep.antonsvirid.stage13hm.view;

public class Printer {
    public static final String MESSAGE_FOR_ONE = "Vector is increase ordered.";
    public static final String MESSAGE_FOR_TWO = "Vector is descending ordered.";
    public static final String MESSAGE_FOR_THREE = "Vector is not ordered.";
    public static final String MESSAGE_FOR_FOUR = "Elements in vector are mirrored.";
    public static final String MESSAGE_FOR_FIVE = "Elements in the vector are not mirrored.";
    public static final String MESSAGE_FOR_SIX = "Vector elements are equal to each other.";
    public static final String MESSAGE_FOR_SEVEN = "Vector elements are not equal to each other.";

    public static void print(int sort) {
        
        String msg = null;
        
        if (sort == 1) {
            msg = MESSAGE_FOR_ONE;
        } else if (sort == 2) {
            msg = MESSAGE_FOR_TWO;
        } else if (sort == 3) {
            msg = MESSAGE_FOR_THREE;
        } else if (sort == 4) {
            msg = MESSAGE_FOR_FOUR;
        } else if (sort == 5) {
            msg = MESSAGE_FOR_FIVE;
        } else if (sort == 6) {
            msg =  MESSAGE_FOR_SIX;
        } else if (sort == 7) {
            msg =  MESSAGE_FOR_SEVEN;
        }

        System.out.println(msg);
    }
}
