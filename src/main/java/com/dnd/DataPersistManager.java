package com.dnd;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DataPersistManager {
    private static final String FILE_PATH = "characters.json";

    public static void saveUserCharacters(List<PlayerCharacter> characters){
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(characters, writer);
            System.out.println("Characters saved: " + characters.size()); // ← debug log
        } catch (IOException e) {
            System.out.println("Character failed to save: " + e.getMessage());
        }
    }

    public static List<PlayerCharacter> loadCharacters() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Type characterListType = new TypeToken<List<PlayerCharacter>>() {}.getType();
            List<PlayerCharacter> characters = gson.fromJson(reader, characterListType);
            return (characters != null) ? characters : new ArrayList<>();
        } catch (IOException e) {
            System.out.println("No saved characters found. Starting fresh.");
            return new ArrayList<>();
        }
    }


}
