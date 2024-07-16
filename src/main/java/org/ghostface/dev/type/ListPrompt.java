package org.ghostface.dev.type;

import org.ghostface.dev.core.Prompt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class ListPrompt extends Prompt {
    private final @NotNull List<String> allQuestions = new ArrayList<>();
    private final @NotNull Scanner scannerList = new Scanner(System.in);
    private @Range(from = 0, to = 10) int input;


    public ListPrompt(@NotNull String promptName) {
        super(promptName);
        this.input = 0;
        addPrompt(this.getName(), this);
    }

    @Override
    public void execute() {
        input = 0;
        System.out.println();
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
            choice = scannerList.nextInt();
        }
        return choice;
    }

    @Override
    public void addQuestion(@NotNull String question) {
        allQuestions.add(question);
    }

    // getters
    public @NotNull ArrayList<String> getAllQuestions() {
        return new ArrayList<>(allQuestions);
    }

    public int getInput() {
        return input;
    }
}
