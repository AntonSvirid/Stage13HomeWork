package by.itstep.antonsvirid.stage13hm.controller;


import by.itstep.antonsvirid.stage13hm.model.logic.Task05Logic;
import by.itstep.antonsvirid.stage13hm.view.Printer;

import java.util.Scanner;

public class Task05Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length of vector: ");
        int length = scanner.nextInt();

        int[] vector = new int[length];

        System.out.println("Input vector's elements: ");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = scanner.nextInt();
        }

        double fiveMarkPercent = Task05Logic.calculatorOfPercentOfFiveMark(vector);
        double fourMarkPercent = Task05Logic.calculatorOfPercentOfFourMark(vector);
        double threeMarkPercent= Task05Logic.calculatorOfPercentOfThreeMark(vector);
        double twoMarkPercent = Task05Logic.calculatorOfPercentOfTwoMark(vector);
        double oneMarkPercent = Task05Logic.calculatorOfPercentOfOneMark(vector);
        double zeroMarkPercent = Task05Logic.calculatorOfPercentOfZeroMark(vector);

       String msg = "Fives - " + fiveMarkPercent + "\nfours - " + fourMarkPercent + "\ntriplets - "
               + threeMarkPercent + "\ndeuces - " + twoMarkPercent + "\nunits - " + oneMarkPercent + "\n"
               + "zeros - " + zeroMarkPercent;

        Printer.print(msg);
    }
}
