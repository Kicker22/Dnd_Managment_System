package com.dnd;

public class PlayerCharacter {
    //Basic character info
    private String name = null;
    private String charClass = null;
    private String race = null;
    private int lvl = 0 ;

    // Constructor
    public PlayerCharacter(String name, String charClass, String race, int lvl) {
        this.name = name;
        this.charClass = charClass;
        this.race = race;
        this.lvl = lvl;
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Race: %s | Class: %s | Lvl: %d", name, race, charClass, lvl);
    }
}
