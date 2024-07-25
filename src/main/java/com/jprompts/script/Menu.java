package com.jprompts.script;

import com.jprompts.core.Script;
import com.jprompts.util.Out;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Menu implements Script {
    private final @NotNull Map<@NotNull String, @Nullable String> questions = new LinkedHashMap<>();
    private @NotNull String answer = "0";

    public Menu() {
    }

    public void addQuestion(@NotNull String msg) {
        questions.put(msg, null);
    }

    @Override
    public void execute() {
        AtomicInteger i = new AtomicInteger(1);
        questions.forEach((k, v) -> System.out.println(i.getAndIncrement() + " - " + k));
        answer = Out.next();
        if (!checker()) {
            System.out.printf("You need to choose between 1 and %d%n", questions.size());
            execute();
        }
        questions.replaceAll((key, value) -> answer);
    }

    @Override
    public @Nullable String getAnswer(@NotNull String question) {
        if (questions.get(question) == null) {
            return null;
        }
        return questions.get(question);
    }

    private boolean checker() {
        try {
            int value = Integer.parseInt(answer);
            return value > 0 && value <= questions.size();
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
