//sort = 4: "Elements in the vector are mirrored."
//sort = 5: "Elements in vector are not mirrored."

package by.itstep.antonsvirid.stage13hm.controller;

import by.itstep.antonsvirid.stage13hm.model.logic.Task02Logic;
import by.itstep.antonsvirid.stage13hm.view.InterpretationOfStatus;
import by.itstep.antonsvirid.stage13hm.view.Printer;

import java.util.Scanner;

public class Task02Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length of vector: ");
        int length = scanner.nextInt();

        int[] vector = new int[length];

        System.out.println("Input vector's elements: ");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = scanner.nextInt();
        }

        int sort = Task02Logic.sort(vector);

        String status = InterpretationOfStatus.msg(sort);

        Printer.print(status);
    }
}
