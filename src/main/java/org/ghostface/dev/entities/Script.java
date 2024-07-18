package org.ghostface.dev.entities;

import org.ghostface.dev.response.Input;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;

public interface Script {

    void outDesign(@NotNull LinkedList<@NotNull String> questionList);

    @NotNull Input getInput();

    @NotNull Input execute(@NotNull LinkedList<@NotNull String> questionList);

}
