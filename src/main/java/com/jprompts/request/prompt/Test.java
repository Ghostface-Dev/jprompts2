package com.jprompts.request.prompt;

import com.jprompts.request.Prompt;
import org.jetbrains.annotations.NotNull;

public class Test implements Prompt {
    @Override
    public @NotNull String getName() {
        return "test";
    }

    @Override
    public void execute(@NotNull String @NotNull... args) {
        if (args.length == 0) {
            System.out.println("Comando 'console' requer pelo menos um argumento.");
            return;
        }

        System.out.println("Argumentos fornecidos ao comando 'console':");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
