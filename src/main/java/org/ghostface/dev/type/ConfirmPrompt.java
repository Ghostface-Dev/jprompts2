package org.ghostface.dev.type;

import org.ghostface.dev.core.Prompt;
import org.ghostface.dev.exceptions.UnsupportedSizeException;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class ConfirmPrompt extends Prompt {
    private final Scanner scannerConfirm = new Scanner(System.in);
    private final List<String> questions = new ArrayList<>();
    private @NotNull char input;

    public ConfirmPrompt(@NotNull String promptName) {
        super(promptName);
        this.input = 0;
    }

    private char checkers(char value) {
        value = scannerConfirm.next().charAt(0);
        while (value != 'y' && value != 'n' && value != 'Y' && value != 'N') {
            System.out.println("invalid command");
            value = scannerConfirm.next().charAt(0);
        }
        return value;
    }

    @Override
    public void execute() {
        input = 0;
        for (String questions : questions) {
            System.out.println("- " + questions + "(Y/N)");
            input = checkers(input);
        }
    }

    @Override
    public void addQuestion(@NotNull String question) {
        if (!this.questions.isEmpty()) {
            try {
                throw new UnsupportedSizeException("This prompt is already used as '" + this.questions.getFirst() + "'");
            } catch (UnsupportedSizeException e) {
                throw new RuntimeException(e);
            }
        }
        this.questions.addFirst(question);
    }

    public char getInput() {
        return input;
    }
}
