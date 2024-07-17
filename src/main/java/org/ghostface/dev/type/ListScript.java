package org.ghostface.dev.type;

import org.ghostface.dev.Prompt;
import org.ghostface.dev.input.types.ResponseInt;
import org.ghostface.dev.script.Script;
import org.ghostface.dev.exceptions.InvalidCommandException;
import org.ghostface.dev.input.Input;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class ListScript extends Script {

    @Override
    public Input execute(LinkedList<@NotNull String> promptList) throws InvalidCommandException {
        try {
            design(promptList);
            return new ResponseInt();
        } catch (Exception e) {
            throw new InvalidCommandException("Something is wrong with input value");
        }
    }

    @Override
    public LinkedList<@NotNull String> getPrompt(LinkedList<@NotNull String> promptList) {
        return promptList;
    }

    @Override
    protected void design(LinkedList<@NotNull String> promptList) {
        System.out.println();
        for (int i = 0; i < promptList.size(); i++) {
            System.out.println((i + 1) + " - " + promptList.get(i));
        }
    }

    @Override
    public Map<@NotNull String, @NotNull Script> scriptList() {
        return new HashMap<>();
    }
}
