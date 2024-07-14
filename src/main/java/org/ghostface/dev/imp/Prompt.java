package org.ghostface.dev.imp;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prompt {
    private final @NotNull Scanner sc = new Scanner(System.in);
    private final @NotNull Map<String, Method> choices = new HashMap<>();

    private Prompt() {

    }

}
