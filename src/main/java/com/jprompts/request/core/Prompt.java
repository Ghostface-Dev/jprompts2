package com.jprompts.request.core;

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
    abstract class AbstractPrompt implements Prompt {
        private final @NotNull Scanner sc = new Scanner(System.in);

        private AbstractPrompt() {
        }

        // requests
        protected @NotNull String requestString() {
            return sc.next();
        }

        protected int requestInt() {
            return sc.nextInt();
        }

        protected double requestDouble() {
            return sc.nextDouble();
        }
    }
}
