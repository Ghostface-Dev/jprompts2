package org.ghostface.dev.types;

import org.ghostface.dev.core.Prompt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPrompt extends Prompt {
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

    @Override
    public final void execute() {
        System.out.println(message);
        for (int i = 0; i < allQuestions.size(); i++) {
            System.out.println((i + 1) + " - " + allQuestions.get(i));
        }
        this.input = checkers(scannerList.nextInt());
    }

    private int checkers(int choice) {
        while (choice > (allQuestions.size() + 1) || choice <= 0) {
            System.out.println("Invalid command");
            execute();
        }
        return choice;
    }

    public void addQuestion(@NotNull String question) {
        allQuestions.add(question);
    }

    public @NotNull List<String> getAllQuestions() {
        return allQuestions;
    }

    public int getInput() {
        return input;
    }
}
