package org.ghostface.dev.core;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public abstract class Prompt {
    private final @NotNull String name;
    private static final @NotNull Map<String, Prompt> myPrompts = new HashMap<>();

    protected Prompt(@NotNull String promptName) {
        this.name = promptName;
    }

    public static void execute(String name) {
        myPrompts.get(name).execute();
    }

    public abstract void execute();

    protected @NotNull Map<String, Prompt> getPrompts() {
        return myPrompts;
    }

    public @NotNull Set<String> getMyPrompts() {
        return getPrompts().keySet();
    }

    public @NotNull String getName() {
        return name;
    }
}
