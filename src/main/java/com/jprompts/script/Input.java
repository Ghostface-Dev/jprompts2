package com.jprompts.script;

import com.jprompts.core.Script;
import com.jprompts.util.Out;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.Map;

public final class Input implements Script {
    private final @NotNull Map<@NotNull String, @Nullable String> questions = new LinkedHashMap();

    @Override
    public void addQuestion(@NotNull String question) {
        this.questions.put(question, null);
    }

    @Override
    public void execute() {
        questions.replaceAll((k,v) -> {System.out.print(" - " + k + ": "); return Out.nextLine();});
        if (!checker()) {
            System.out.println("Something is wrong with answers. Try again.");
            execute();
        }
    }

    @Override
    public @Nullable String getAnswer(@NotNull String question) {
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
