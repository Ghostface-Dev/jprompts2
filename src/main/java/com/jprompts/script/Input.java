package com.jprompts.script;

import com.jprompts.core.Script;
import com.jprompts.util.Out;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class Input implements Script {
    private final @NotNull Map<@NotNull String, @NotNull String> questions = new LinkedHashMap();

    @Override
    public void addQuestion(@NotNull String question) {
        this.questions.put(question, "");
    }

    @Override
    public void execute() {
        for (Map.Entry<@NotNull String, @NotNull String> s : questions.entrySet()) {
            System.out.print(" - " + s.getKey() + ": ");
            questions.put(s.getKey(), Out.nextLine());
        }
        if (!checker()) {
            System.out.println("Something is wrong with answers. Try again.");
            execute();
        }
    }

    @Override
    public @NotNull String getAnswer(@NotNull String question) {
        return this.questions.get(question);
    }

    private boolean checker() {
        for (Map.Entry<@NotNull String, @NotNull String> entry : questions.entrySet()) {
            if (entry.getValue().isEmpty() || entry.getValue().length() > 30) {
                return false;
            }
        }
        return true;
    }
}
