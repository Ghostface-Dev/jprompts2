package com.jprompts.prompt;

import com.jprompts.core.Prompt;
import com.jprompts.core.Script;
import com.jprompts.script.Input;
import com.jprompts.script.Menu;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public abstract class AbstractPrompt implements Prompt {
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
