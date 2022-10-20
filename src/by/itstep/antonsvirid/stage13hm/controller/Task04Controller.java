package by.itstep.antonsvirid.stage13hm.controller;

import by.itstep.antonsvirid.stage13hm.model.logic.Task04Logic;
import by.itstep.antonsvirid.stage13hm.view.Printer;

import java.util.Scanner;

public class Task04Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length of vector: ");
        int length = scanner.nextInt();

        int[] vector = new int[length];

        System.out.println("Input vector's elements: ");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = scanner.nextInt();
        }

        int countOfEven = Task04Logic.countOfEven(vector);
        int countOfNotEven = Task04Logic.countOfNotEven(vector);

        String msg = "Count of even numbers is " + countOfEven
                + ", count of not even numbers is " + countOfNotEven;

        Printer.print(msg);
    }
}
