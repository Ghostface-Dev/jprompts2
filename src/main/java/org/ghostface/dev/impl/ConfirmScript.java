package org.ghostface.dev.impl;

import org.ghostface.dev.entities.Script;
import org.ghostface.dev.response.Input;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.Objects;

public final class ConfirmScript implements Script {
    private final @NotNull String name = "confirm";

    public ConfirmScript(@NotNull String string) {
    }

    @Override
    public void outDesign(@NotNull LinkedList<@NotNull String> questionList) {
        for (@NotNull String question: questionList) {
            System.out.println("- " + question + " (y/n)");
        }
    }

    @Override
    public @NotNull Input getInput() {
        return new Input();
    }

    @Override
    public @NotNull String execute(@NotNull LinkedList<@NotNull String> questionList) {
        System.out.println();
        outDesign(questionList);
        @NotNull String inputValue = getInput().value();
        while (!checkers(inputValue)) {
            System.out.println("invalid command");
            outDesign(questionList);
            inputValue = getInput().value();
        }
        return inputValue;
    }

    private boolean checkers(@NotNull String inputValue) {
        return inputValue.equalsIgnoreCase("y") || inputValue.equalsIgnoreCase("n");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConfirmScript that = (ConfirmScript) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
