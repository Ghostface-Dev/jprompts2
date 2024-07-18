package org.ghostface.dev.impl;

import org.ghostface.dev.entities.Script;
import org.ghostface.dev.response.Input;
import org.ghostface.dev.response.type.InputAsInt;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;

public class ListScript implements Script {

    @Override
    public void outDesign(@NotNull LinkedList<@NotNull String> questionList) {
        for (int i = 0; i < questionList.size(); i++) {
            System.out.println((i + 1) + " - " + questionList.get(i));
        }
    }

    @Override
    public @NotNull InputAsInt getInput() {
        return new InputAsInt();
    }


}
