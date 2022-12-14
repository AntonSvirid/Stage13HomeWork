package by.itstep.antonsvirid.stage13hm.view;

public class InterpretationOfStatus {
    public static final String MESSAGE_FOR_ONE = "Vector is increase ordered.";
    public static final String MESSAGE_FOR_TWO = "Vector is descending ordered.";
    public static final String MESSAGE_FOR_THREE = "Vector is not ordered.";
    public static final String MESSAGE_FOR_FOUR = "Elements in vector are mirrored.";
    public static final String MESSAGE_FOR_FIVE = "Elements in the vector are not mirrored.";
    public static final String MESSAGE_FOR_SIX = "Vector elements are equal to each other.";
    public static final String MESSAGE_FOR_SEVEN = "Vector elements are not equal to each other.";

    public static String msg(int sort) {

        String msg = null;

        switch (sort){
            case 1: msg = MESSAGE_FOR_ONE; break;
            case 2: msg = MESSAGE_FOR_TWO; break;
            case 3: msg = MESSAGE_FOR_THREE; break;
            case 4: msg = MESSAGE_FOR_FOUR; break;
            case 5: msg = MESSAGE_FOR_FIVE; break;
            case 6: msg = MESSAGE_FOR_SIX; break;
            case 7: msg = MESSAGE_FOR_SEVEN; break;

        }

        return msg;
    }
}
