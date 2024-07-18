package org.ghostface.dev.root;


import org.ghostface.dev.entities.Prompt;
import org.ghostface.dev.exceptions.NullCommandException;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* A command interface for control the prompts
* */
public class Command {

    private static final @NotNull Map<@NotNull String, Command> commandList = new HashMap<>();

    public static void execute(@NotNull Prompt instance) {

    }

    public static void execute(@NotNull String commandName) throws NullCommandException {
        if (commandList.containsKey(commandName)) {

        }
        if (commandList.containsKey(commandName)) {
            throw new NullCommandException("Command not exist");
        }
    }

    public static @NotNull Set<@NotNull String> commandSet() {
        return commandList.keySet();
    }

    protected void addCommand(@NotNull String commandName, @NotNull Command command) {
        commandList.put(commandName, command);
    }



}
