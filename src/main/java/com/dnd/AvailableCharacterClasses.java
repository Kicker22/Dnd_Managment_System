package com.dnd;

import java.util.ArrayList;
import java.util.List;

public class AvailableCharacterClasses{
    private static final List<String> validClasses = new ArrayList<>();

    static {
        // Add default classes
        validClasses.add("fighter");
        validClasses.add("wizard");
        validClasses.add("cleric");
        validClasses.add("rogue");
        validClasses.add("paladin");
        validClasses.add("barbarian");
        validClasses.add("druid");
        validClasses.add("ranger");
        validClasses.add("monk");
        validClasses.add("sorcerer");
        validClasses.add("warlock");
        validClasses.add("bard");
    }
    public static List<String> getAllClasses() {
        return new ArrayList<>(validClasses);
    }
    public static boolean isValidClass(String className) {
        return validClasses.contains(className);
    }
    public static void addCustomClass(String newClass) {
        if (!validClasses.contains(newClass)) {
            validClasses.add(newClass);
        }
    }
}
