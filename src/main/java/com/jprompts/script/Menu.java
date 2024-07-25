package com.jprompts.script;

import com.jprompts.core.Script;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Menu implements Script {
    private final @NotNull Map<@NotNull String, @NotNull String> questions = new LinkedHashMap<>();
    private @NotNull String answer;

    public Menu() {
    }

    public void addQuestion(@NotNull String msg) {
        questions.put(msg, "");
    }

    @Override
    public void execute() {
        int i = 1;
        for (Map.Entry<@NotNull String, @NotNull String> question : questions.entrySet()) {
            System.out.println(i + " - " + question.getKey());
            i++;
        }
        answer = Script.response();
        questions.replaceAll((key, value) -> answer);
    }

    @Override
    public @NotNull String getAnswer(@NotNull String question) {
        return questions.get(question);
    }

    @Override
    public boolean checker() {
        return Integer.parseInt(answer) > 0 && Integer.parseInt(answer) <= questions.size();
    }

}
