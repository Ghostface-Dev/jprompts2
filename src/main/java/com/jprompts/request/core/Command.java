package com.jprompts.request.core;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public final class Command {
    private static final @NotNull Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static final @NotNull Set<@NotNull Prompt> promptSet = new HashSet<>();

    public static void insert() {
        @NotNull String v = sc.nextLine();
        runPrompt(v);
    }

    public static boolean containsPrompt(@NotNull String name) {
        for (@NotNull Prompt prompt : promptSet) {
            if (prompt.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    private static void runPrompt(@NotNull String name) {
        if (containsPrompt(name)) {
            for (@NotNull Prompt prompt: promptSet) {
                if (prompt.getName().equalsIgnoreCase(name)) {
                    prompt.execute();
                }
            }
        }
    }

    public static void add(@NotNull Prompt prompt) {
        promptSet.add(prompt);
    }

    public static @NotNull String allPrompts() {
        @NotNull ArrayList<@NotNull String> array = new ArrayList<>();
        for (@NotNull Prompt prompt : promptSet) {
            array.add(prompt.getName());
        }
        return array.toString();
    }

}
