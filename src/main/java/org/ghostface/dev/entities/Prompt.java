package org.ghostface.dev.entities;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prompt {
    private final @NotNull Scanner sc = new Scanner(System.in);
    private final @NotNull Map<String, Method> prompt = new HashMap<>();

    private @NotNull String message;

    public Prompt(@NotNull String message) {
        this.message = message;
    }


}
