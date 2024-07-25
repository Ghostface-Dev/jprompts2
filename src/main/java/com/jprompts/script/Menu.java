package com.jprompts.script;

import com.jprompts.core.Script.*;
import com.jprompts.util.Out;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.atomic.AtomicInteger;

public final class Menu extends AbstractScript {
    private @NotNull String answer = "0";

    public Menu() {
    }

    @Override
    public void execute() {
        AtomicInteger i = new AtomicInteger(1);
        getQuestions().forEach((k, v) -> System.out.println(i.getAndIncrement() + " - " + k));
        answer = Out.nextLine();
        if (!checker(answer)) {
            System.out.printf("You need to choose between 1 and %d%n", getQuestions().size());
            execute();
        }
        getQuestions().replaceAll((key, value) -> answer);
    }

    private boolean checker(@NotNull String answer) {
        try {
            int value = Integer.parseInt(answer);
            return value > 0 && value <= getQuestions().size();
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
