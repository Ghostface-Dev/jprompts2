package org.ghostface.dev.types;

import org.ghostface.dev.core.Prompt;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class ListPrompt extends Prompt {
    private final @NotNull List<String> allQuestions = new ArrayList<>();
    private final @NotNull Scanner scannerList = new Scanner(System.in);

    public ListPrompt(@NotNull String promptName) {
        super(promptName);
        getPrompts().put(this.getName(), this);
    }

    public void addQuestion(@NotNull String name) {

    }

    @Override
    public void execute() {
        System.out.println("running");
    }

    public @NotNull List<String> getAllQuestions() {
        return allQuestions;
    }
}
