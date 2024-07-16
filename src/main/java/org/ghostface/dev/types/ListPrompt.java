package org.ghostface.dev.types;

import org.ghostface.dev.core.Prompt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class ListPrompt extends Prompt {
    private final @NotNull List<String> allQuestions = new ArrayList<>();
    private final @NotNull Scanner scannerList = new Scanner(System.in);
    private final @NotNull String message;
    private int input;

    public ListPrompt(@NotNull String initialMessage , @NotNull String promptName) {
        this.message = initialMessage;
        this.input = 0;
        setName(promptName);
        getPrompts().put(this.getName(), this);
    }

    public ListPrompt(@NotNull String promptName) {
        this.message = "";
        this.input = 0;
        setName(promptName);
        getPrompts().put(this.getName(), this);
    }

    @Override
    public void execute() {
        input = 0;
        System.out.println(message);
        for (int i = 0; i < allQuestions.size(); i++) {
            System.out.println((i + 1) + " - " + allQuestions.get(i));
        }
        input = checkers(input);
    }

    /*
    * Is a god practice deal with possibles users responses;
    *
    * */
    private int checkers(int choice) {
        choice = scannerList.nextInt();
        while (choice <= 0 || choice > (allQuestions.size())) {
            System.out.println("Invalid command");
            System.out.println(getInput());
            choice = scannerList.nextInt();
        }
        return choice;
    }

    @Override
    public void addQuestion(@NotNull String question) {
        allQuestions.add(question);
    }

    // getters
    public @NotNull List<String> getAllQuestions() {
        return allQuestions;
    }

    public int getInput() {
        return input;
    }
}
