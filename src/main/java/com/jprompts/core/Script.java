package com.jprompts.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Scanner;

public interface Script {

    static @NotNull String response() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    void addQuestion(@NotNull String question);
    void execute();

    @Nullable String getAnswer(@NotNull String question);
}
