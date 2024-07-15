package org.ghostface.dev.core;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public abstract class Prompt {
    private final @NotNull String name;
    private static final @NotNull Map<@NotNull String, @NotNull Prompt> myPrompts = new HashMap<>();

    protected Prompt(@NotNull String promptName) {
        this.name = promptName;
    }

    public static void run(@NotNull String name) {
        try {
            myPrompts.get(name).execute();
        } catch (NullPointerException error) {
            throw new NullPointerException("This prompt name not exist");
        }
    }

    public abstract void execute();

    protected final @NotNull Map<String, Prompt> getPrompts() {
        return myPrompts;
    }

    public static @NotNull Set<String> getMyPrompts() {
        return myPrompts.keySet();
    }

    public final @NotNull String getName() {
        return name;
    }
}
