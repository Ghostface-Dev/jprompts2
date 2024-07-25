package com.jprompts.core;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public interface Script {

    static @NotNull String response() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    void addQuestion(@NotNull String question);
    void execute();

    @NotNull String getAnswer(@NotNull String question);

    boolean checker();
}
