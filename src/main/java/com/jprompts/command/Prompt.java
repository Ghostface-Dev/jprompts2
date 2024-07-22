package com.jprompts.command;

import com.jprompts.exceptions.*;
import com.jprompts.request.Script;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public final class Prompt {

    private final @NotNull LinkedList<@NotNull String> questionList = new LinkedList<>();
    private final @NotNull Map<@NotNull String, @Nullable String> questionMap = new LinkedHashMap<>();
    private final @NotNull Script script;
    private @NotNull String anwser;
    // instanceOf
    private final boolean isOption;
    private final boolean isConfirm;

    public Prompt(@NotNull String type) {
        if (type.equalsIgnoreCase("list")) {
            this.script = new OptionScript(this);
        } else if (type.equalsIgnoreCase("confirm")) {
            this.script = new ConfirmScript(this);
        } else {
            throw new RuntimeException("Invalid script type");
        }
        isOption = script instanceof OptionScript;
        isConfirm = script instanceof ConfirmScript;
    }

    public void addQuestion(@NotNull String message) {
        if (isOption) {
            questionList.add(message.toLowerCase());
        }
        if (isConfirm) {
            questionMap.put(message.toLowerCase(), null);
        }
    }

    public void run() {
        this.script.execute();
    }

    public @NotNull String anwser(@Nullable String question) {
        if (isOption) {
            for (@NotNull String msg : questionList) {
                if (msg.equalsIgnoreCase(question) || question == null) {

                }
            }
        }
        if (isConfirm) {
            if (questionMap.containsKey(question)) {

            }
        }
        throw new NullPointerException("The response is not defined because the prompt was not executed");
    }

    public @Nullable String answerIfOption() {
        @NotNull OptionScript option = new OptionScript(this);
        if (!isOption) {
            throw new NotEqualsScriptTypeException("Type is not a 'List', try using the getAnswer method");
        }
        return anwser(null);
    }

    // getters

    @NotNull LinkedList<@NotNull String> getQuestionList() {
        return questionList;
    }

    @NotNull Map<@NotNull String, @Nullable String> getQuestionMap() {
        return questionMap;
    }

    @NotNull String getAnwser() {
        return anwser;
    }

    public void setAnwser(@NotNull String anwser) {
        this.anwser = anwser;
    }

    // objects

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prompt prompt = (Prompt) o;
        return Objects.equals(questionList, prompt.questionList) && Objects.equals(questionMap, prompt.questionMap) && Objects.equals(script, prompt.script);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionList, questionMap, script);
    }
}

/*
*
* estou tendo problema com getAnwser porque nao é meu prompt que deve conter as listas de questoes
* faz sentido tambem que cada script lide com seus proprios 'prompts'
* o parametro continua o mesmo
* nos tipos de scripts:
* getAnwser(question)
* list
* o msm método
* confirm
* o msm método tbm
* sempre retornaram strings
*
* */