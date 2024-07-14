package org.ghostface.dev.service;

import org.ghostface.dev.imp.Question;
import org.jetbrains.annotations.NotNull;

public class PromptService extends Question {

    protected PromptService(@NotNull String message) {
        super(message);
    }

}
