package com.jprompts.prompt;

import com.jprompts.core.Script;
import org.jetbrains.annotations.NotNull;

import com.jprompts.script.Menu;

public class PrintHelloWorldPrompt extends AbstractPrompt {
    private final @NotNull Script menu = new Menu();

    @Override
    public @NotNull String getName() {
        return "print_hello";
    }

    @Override
    public void execute(@NotNull String @NotNull ... args) {

    }
}
