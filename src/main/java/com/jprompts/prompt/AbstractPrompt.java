package com.jprompts.prompt;
import com.jprompts.core.Prompt;
import org.jetbrains.annotations.NotNull;
import java.util.Scanner;

public abstract class AbstractPrompt implements Prompt {
    private final @NotNull Scanner sc = new Scanner(System.in);

    protected AbstractPrompt() {
    }

}
