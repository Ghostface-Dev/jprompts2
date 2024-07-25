package com.jprompts.prompt;

import com.jprompts.core.Script;
import org.jetbrains.annotations.NotNull;

import com.jprompts.script.Menu;

import java.util.Objects;

public class PrintHelloWorldPrompt extends AbstractPrompt {
    private final @NotNull Script menu = new Menu();

    @Override
    public @NotNull String getName() {
        return "print_hello";
    }

    @Override
    public void execute(@NotNull String @NotNull ... args) {
        menu.addQuestion("Hello World!");
        menu.addQuestion("Olá Mundo!");

        menu.execute();

        if (Objects.equals(menu.getAnswer("Hello World!"), "2")) {
            System.out.println("This is brazil!");
        }
    }
}
