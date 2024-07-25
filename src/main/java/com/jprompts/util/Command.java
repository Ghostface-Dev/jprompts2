package com.jprompts.util;

import com.jprompts.core.Prompt;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;

public final class Command {
    private static final @NotNull Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static final @NotNull Set<@NotNull Prompt> promptSet = new HashSet<>();

    public static void insert() {
        @NotNull String v = sc.nextLine();
        runPrompt(v);
    }

    public static boolean containsPrompt(@NotNull String name) {
        return promptSet.stream().anyMatch(prompt -> prompt.getName().equalsIgnoreCase(name));
    }

    private static void runPrompt(@NotNull String name) {
        if (containsPrompt(name)) {
            for (@NotNull Prompt prompt : promptSet) {
                if (prompt.getName().equalsIgnoreCase(name)) {
                    prompt.execute();
                }
            }
            System.out.println(name + " executed");
        } else {
            System.out.printf("%nPrompt not found%n");
            insert();
        }
    }

    public static void add(@NotNull Prompt prompt) {
        promptSet.add(prompt);
    }

    public static @NotNull String allPrompts() {
        return promptSet.stream()
                .map(Prompt::getName)
                .collect(Collectors.joining(","));
    }

    // object

    private Command() {
        throw new UnsupportedOperationException();
    }
}
