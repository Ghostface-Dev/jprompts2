package com.jprompts.script;

import com.jprompts.core.Script.*;
import com.jprompts.util.Out;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Input extends AbstractScript {

    @Override
    public void execute() {
        getQuestions().replaceAll((k,v) -> {
            System.out.print(" - " + k + ": "); return Out.nextLine();
        });

        if (!validate(this::checker)) {
            System.out.printf("%nSomething is wrong with answers. Try again.%n");
            execute();
        }
    }

    @Override
    public @Nullable String getAnswer(@NotNull String question) {
        return getQuestions().get(question);
    }

    private boolean checker(@NotNull String answer) {
        return !answer.isEmpty() && answer.length() <= 30;
    }
}
