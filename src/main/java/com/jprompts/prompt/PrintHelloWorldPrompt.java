package com.jprompts.prompt;

import com.jprompts.core.Prompt;
import com.jprompts.core.Script;

import com.jprompts.script.Menu;
import org.jetbrains.annotations.NotNull;

public final class PrintHelloWorldPrompt implements Prompt {
    private final @NotNull Script menu = new Menu();

    @Override
    public @NotNull String getName() {
        return "print_hello";
    }

    @Override
    public void execute(@NotNull String @NotNull ... args) {
        menu.addQuestion("Hello World");
        menu.addQuestion("Olá Mundo");

        menu.execute();

        System.out.println(menu.getAnswer("Olá Mundo"));
    }
}
