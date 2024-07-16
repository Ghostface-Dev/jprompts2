package org.ghostface.dev.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public abstract class Prompt {
    /*
    * The prompt name is important for run the prompt thoughts Prompt Class
    * */
    private final @NotNull String name;

    /*
    * All prompts and its objects are storage in this map
    * */
    private static final @NotNull Map<@NotNull String, @NotNull Prompt> allPrompts = new HashMap<>();

    protected Prompt(@NotNull String name) {
        this.name = name;
    }

    /*
    *
    * New prompts types must have their own design in the terminal
    *
    * */
    public abstract void execute();

    /*
    *
    * The prompt type must have a way to add new questions
    *
    * */
    public abstract void addQuestion(@NotNull String question);

    /*
    *
    * get the prompt map for constructors implements
    *
    * */
    protected final @NotNull Map<String, Prompt> getPrompts() {
        return allPrompts;
    }

    // static initializers
    public static void runPrompt(@NotNull String name) {
        try {
            allPrompts.get(name).execute();
        } catch (NullPointerException error) {
            throw new NullPointerException("This prompt name not exist");
        }
    }

    public static @NotNull Set<String> getAllPrompts() {
        return allPrompts.keySet();
    }

    // getters

    public final @NotNull String getName() {
        return name;
    }

}
