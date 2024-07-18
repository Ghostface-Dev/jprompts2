package org.ghostface.dev.impl;

import org.ghostface.dev.entities.Script;
import org.ghostface.dev.response.Input;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;

public final class InputScript implements Script {
    @Override
    public void outDesign(@NotNull LinkedList<@NotNull String> questionList) {

    }

    @Override
    public @NotNull Input getInput() {
        return null;
    }

    @Override
    public @NotNull String execute(@NotNull LinkedList<@NotNull String> questionList) {
        return null;
    }
}
