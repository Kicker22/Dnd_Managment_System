package com.dnd;

import com.dnd.AvailableCharacterClasses;

import java.util.Scanner;

public class ValidateUserInput {
    public static String getNonEmptyInput(Scanner scanner, String prompt) {
        String input;
        do {
            System.out.println(prompt);
            input = scanner.nextLine().trim().toLowerCase();
            if (input.isEmpty()) {
                System.out.println("Entry cannot be blank, please try again.");
            }
        } while (input.isEmpty());
        return input;
    }

    public static String validateClassEntry(Scanner scanner, String prompt) {
        String input;
        while (true) {
            input = getNonEmptyInput(scanner, "Enter character class: ");
            if (AvailableCharacterClasses.isValidClass(input)) {
                break;
            } else {
                System.out.println("Invalid class. Try again. Valid options: " + AvailableCharacterClasses.getAllClasses());
            }
        }
        return input;
    }
    public static int validateLevel(Scanner scanner) {
        int level = -1;
        while (true) {
            System.out.println("Enter Character Level (1-20)");
            String input = scanner.nextLine();

            try {
                level = Integer.parseInt(input);
                if (level < 0 || level > 20) {
                    System.out.println("Level must be between 1 - 20. ");
                } else {
                    return level;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
