package org.ghostface.dev.impl;

import org.ghostface.dev.entities.Script;
import org.ghostface.dev.response.Input;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;

public final class ListScript implements Script {

    @Override
    public void outDesign(@NotNull LinkedList<@NotNull String> questionList) {
        for (int i = 0; i < questionList.size(); i++) {
            System.out.println((i + 1) + " - " + questionList.get(i));
        }
    }

    @Override
    public @NotNull Input getInput() {
        return new Input();
    }

    @Override
    public @NotNull String execute(@NotNull LinkedList<@NotNull String> questionList) {
        outDesign(questionList);
        @NotNull String inputValue = getInput().value();
        while (!checkers(inputValue, questionList)) {
            System.out.println("Invalid command");
            outDesign(questionList);
            inputValue = getInput().value();
        }
        return inputValue;
    }

    private boolean checkers(@NotNull String inputValue, @NotNull LinkedList<@NotNull String> questionList) {
        return Integer.parseInt(inputValue) <= 0 || Integer.parseInt(inputValue) > questionList.size();
    }

}
