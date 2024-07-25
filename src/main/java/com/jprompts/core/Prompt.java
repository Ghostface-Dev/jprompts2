package com.jprompts.core;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public interface Prompt {

    /*
    * The name of command prompt
    * */
    @NotNull String getName();
    /*
    * executable
    * */
    void execute(@NotNull String @NotNull... args);


    /*
    * AbstractPrompt provide less effort required to implement prompt interface
    * */

}
