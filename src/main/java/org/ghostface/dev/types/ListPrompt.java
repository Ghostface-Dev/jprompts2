package org.ghostface.dev.types;

import org.ghostface.dev.core.Prompt;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class ListPrompt extends Prompt {
    private final @NotNull List<String> listPrompts = new ArrayList<>();
    private @NotNull Scanner scanner;

    public ListPrompt(String promptName) {
        super(promptName);
        this.scanner = new Scanner(System.in);
        getPrompts().put(this.getName(), this);
    }


    /*
     public void prompt(@NotNull String message, List<String> options) {
        System.out.println(message);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + "-" + options.get(i));
        }
    } */

    @Override
    public void execute() {
        System.out.println("running");
    }

    public @NotNull List<String> getListPrompts() {
        return listPrompts;
    }
}
