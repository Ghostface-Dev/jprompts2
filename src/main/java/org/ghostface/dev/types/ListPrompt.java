package org.ghostface.dev.types;

import org.ghostface.dev.core.Prompt;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ListPrompt extends Prompt {
    private final @NotNull List<String> listPrompts = new ArrayList<>();

    public ListPrompt() {
        super("list");
    }

    public void addListPrompt(String question) {
        getListPrompts().add(question);
    }

    @Override
    protected void execute() {

    }

    public @NotNull List<String> getListPrompts() {
        return listPrompts;
    }
}
