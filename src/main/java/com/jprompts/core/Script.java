package com.jprompts.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

public interface Script {

    /*
    * pass you question here
    * */
    void addQuestion(@NotNull String question);
    /*
    * Execute the Script
    * */
    void execute();

    /*
    * Use the response answer for something.
    * If a input script, all answers will be the same value
    * */
    @Nullable String getAnswer(@NotNull String question);


    /*
    * Abstract class provides a implementation of the Script interface to
    * minimize the enffort required to implement script interface
    * */
    abstract class AbstractScript implements Script {
        private final @NotNull Map<@NotNull String, @Nullable String> questions = new HashMap<>();

        @Override
        public void addQuestion(@NotNull String question) {
            questions.put(question, null);
        }

        @Override
        public @Nullable String getAnswer(@NotNull String question) {
            return questions.get(question);
        }

        /*
        * Validate method is a way of to validate some type of checkers
        * */
        protected boolean validate(Predicate<@NotNull String> predicate) {
            return questions.values().stream().allMatch(predicate);
        }

        /*
        * Get memory questions
        * */
        protected @NotNull Map<@NotNull String, @Nullable String> getQuestions() {
            return questions;
        }
    }
}
