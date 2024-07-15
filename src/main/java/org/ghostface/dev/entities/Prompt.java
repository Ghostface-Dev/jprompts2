package org.ghostface.dev.entities;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

abstract class PromptContainer {
    private final @NotNull Scanner sc = new Scanner(System.in);
    private final @NotNull Map<String, Runnable> prompt = new HashMap<>();

    private @NotNull String message;

    public PromptContainer(@NotNull String message) {
        this.message = message;
    }

    abstract public void run();

    @NotNull Map<String, Runnable> getPrompt() {
        return this.prompt;
    }

}
public class Prompt extends PromptContainer{


    public Prompt(@NotNull String message) {
        super(message);
    }


    @Override
    public void run() {

    }
}

