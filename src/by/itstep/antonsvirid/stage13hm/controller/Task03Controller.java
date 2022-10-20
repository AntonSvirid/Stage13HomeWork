// sort = 6: "Vector elements are not equal to each other."
// sort = 7: "Vector elements are equal to each other."

package by.itstep.antonsvirid.stage13hm.controller;

import by.itstep.antonsvirid.stage13hm.model.logic.Task03Logic;
import by.itstep.antonsvirid.stage13hm.view.InterpretationOfStatus;
import by.itstep.antonsvirid.stage13hm.view.Printer;

import java.util.Scanner;

public class Task03Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length of vector: ");
        int length = scanner.nextInt();

        int[] vector = new int[length];

        System.out.println("Input vector's elements: ");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = scanner.nextInt();
        }

        int sort = Task03Logic.sort(vector);

        String status = InterpretationOfStatus.msg(sort);

        Printer.print(status);
    }
}

