package com.jprompts.prompt;

import com.jprompts.core.Prompt;
import com.jprompts.core.Script;
import com.jprompts.script.Input;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class PrintHelloWorldPrompt implements Prompt {
    private final @NotNull Script input = new Input();

    @Override
    public @NotNull String getName() {
        return "print_hello";
    }

    @Override
    public void execute(@NotNull String @NotNull ... args) {
        input.addQuestion("Hello World");
        input.addQuestion("Olá Mundo");

        input.execute();

        if (Objects.equals(input.getAnswer("Olá Mundo"), "brazil")) {
            System.out.println("correct");
        }
    }
}
