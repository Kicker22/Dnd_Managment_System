package com.dnd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CharManager {
    private static List<PlayerCharacter> characters = DataPersistManager.loadCharacters();

    public CharManager() {
        characters = new ArrayList<>();
    }

    public static void addPlayerCharacter(PlayerCharacter pc){
        System.out.println("Character Created! Use option 2 to display created chars");
        characters.add(pc);
        DataPersistManager.saveUserCharacters(characters);
    }

    public static List<PlayerCharacter> getAllCharacters() {
        // Loop through characters and print each on new line
        return characters;
    }
}
