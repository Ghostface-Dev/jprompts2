package com.jprompts.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Scanner;

public interface Script {

    void addQuestion(@NotNull String question);
    void execute();

    @Nullable String getAnswer(@NotNull String question);
}
