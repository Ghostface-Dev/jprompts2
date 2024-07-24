package com.jprompts.request.prompt;

import com.jprompts.request.core.Prompt.*;
import org.jetbrains.annotations.NotNull;

public class PrintHelloWorldPrompt extends AbstractPrompt {

    @Override
    public @NotNull String getName() {
        return "print_hello";
    }

    @Override
    public void execute(@NotNull String @NotNull ... args) {
        System.out.println("Hello world");
    }
}
