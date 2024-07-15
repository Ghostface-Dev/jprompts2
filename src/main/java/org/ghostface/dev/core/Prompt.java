package org.ghostface.dev.core;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public abstract class Prompt implements PromptFactory {
    private final @NotNull String promptName;
    private final @NotNull List<Prompt> prompts = new ArrayList<>();

    protected Prompt(@NotNull String promptName) {
        this.promptName = promptName;
    }

    protected abstract void execute();

    @Override
    public final @NotNull String getName() {
        return promptName;
    }

    @Override
    public final @NotNull List<Prompt> getPrompts() {
        return this.prompts;
    }
}
