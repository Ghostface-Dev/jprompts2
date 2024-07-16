package org.ghostface.dev.types;

import org.ghostface.dev.core.Prompt;
import org.jetbrains.annotations.NotNull;

public final class ConfirmPrompt extends Prompt {

    public ConfirmPrompt(@NotNull String promptName) {
        super(promptName);
    }

    @Override
    public void execute() {

    }

    @Override
    public void addQuestion(@NotNull String question) {

    }
}
