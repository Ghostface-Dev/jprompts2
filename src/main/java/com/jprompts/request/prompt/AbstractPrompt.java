package com.jprompts.request.prompt;

import com.jprompts.request.core.Prompt;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

abstract class AbstractPrompt implements Prompt {
    private final @NotNull Scanner sc = new Scanner(System.in);

    protected AbstractPrompt() {
    }

    // requests
    protected @NotNull String requestString() {
        return sc.next();
    }

    protected int requestInt() {
        return sc.nextInt();
    }

    protected double requestDouble() {
        return sc.nextDouble();
    }
}
