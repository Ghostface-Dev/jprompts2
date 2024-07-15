package org.ghostface.dev.core;

import org.jetbrains.annotations.NotNull;

import java.util.List;

interface PromptFactory {

    @NotNull String getName();
    @NotNull List<Prompt> getPrompts();

    default void isAPrompt() {
        if (!getName().equals("list") || !getName().equals("input") || !getName().equals("confirm")) {
            throw new IllegalArgumentException("Prompt name is invalid.");
        }
    }

}
