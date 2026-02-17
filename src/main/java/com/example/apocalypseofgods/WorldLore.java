package com.example.apocalypseofgods;

/**
 * Simple domain class to keep static world information.
 */
public final class WorldLore {

    public static final String WORLD_NAME = "Apocalypse of Gods";

    private WorldLore() {
        // Utility class
    }

    public static String intro() {
        return "Welcome to " + WORLD_NAME + ".";
    }
}
