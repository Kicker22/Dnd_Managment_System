package com.dnd;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class UserIntputLogic {
    public static void run() {

        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            TerminalUI.displayUi();
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    String name = ValidateUserInput.getNonEmptyInput(scanner, "Enter character name: ");
                    String charClass = ValidateUserInput.validateClassEntry(scanner, "Enter Character class");
                    String race = ValidateUserInput.getNonEmptyInput(scanner, "Enter character race: ");
                    int lvl = ValidateUserInput.validateLevel(scanner);

                    PlayerCharacter pc = new PlayerCharacter(name, charClass, race, lvl);
                    CharManager.addPlayerCharacter(pc);
                    break;
                case "2":
                    List<PlayerCharacter> allCharacters = CharManager.getAllCharacters();
                    if (allCharacters.isEmpty()) {
                        System.out.println("No characters to display.");
                    } else {
                        for (PlayerCharacter all : allCharacters) {
                            System.out.println(all);
                        }
                    }
                    break;
                case "3":
                    running = false;
                    System.out.println("Program Stopped.");
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}
