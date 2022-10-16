//sort = 1: "Vector is increase ordered."
//sort = 2: "Vector is descending ordered."
//sort = 3: "Vector is not ordered."

package by.itstep.antonsvirid.stage13hm.controller;

import by.itstep.antonsvirid.stage13hm.model.logic.Task01Logic;
import by.itstep.antonsvirid.stage13hm.view.Printer;

import java.util.Scanner;

public class Task01Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length of vector: ");
        int length = scanner.nextInt();

        int[] vector = new int[length];

        System.out.println("Input vector's elements: ");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = scanner.nextInt();
        }

        int sort = Task01Logic.sort(vector);

        Printer.print(sort);
    }
}
