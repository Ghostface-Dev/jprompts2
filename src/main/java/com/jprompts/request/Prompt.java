package com.jprompts.request;

import org.jetbrains.annotations.NotNull;

public interface Prompt {

    @NotNull String getName();

    void execute(@NotNull String @NotNull... args);

}
