package org.ghostface.dev.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public abstract class Prompt {
    private @Nullable String name;
    private static final @NotNull Map<@NotNull String, @NotNull Prompt> myPrompts = new HashMap<>();


    public static void runPrompt(@NotNull String name) {
        try {
            myPrompts.get(name).execute();
        } catch (NullPointerException error) {
            throw new NullPointerException("This prompt name not exist");
        }
    }

    protected abstract void execute();

    protected final @NotNull Map<String, Prompt> getPrompts() {
        return myPrompts;
    }

    public static @NotNull Set<String> getAllPrompts() {
        return myPrompts.keySet();
    }

    public final @Nullable String getName() {
        return name;
    }

    protected void setName(@NotNull String name) {
        this.name = name;
    }
}
