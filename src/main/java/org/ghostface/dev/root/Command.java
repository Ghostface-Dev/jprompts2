package org.ghostface.dev.root;


import org.ghostface.dev.exceptions.NullCommandException;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* A command interface for control the prompts
* */
public interface Command {

    static void execute(@NotNull Command instance) {

    }

    static void execute(@NotNull String commandName) throws NullCommandException {
        if (commandList().containsKey(commandName)) {

        }
        if (!commandList().containsKey(commandName)) {
            throw new NullCommandException("Command not exist");
        }
    }

    default void addCommand(@NotNull String commandName, @NotNull Command command) {
        commandList().put(commandName, command);
    }

    private static @NotNull Map<@NotNull String, Command> commandList() {
        return new HashMap<>();
    }

    static @NotNull Set<@NotNull String> commandSet() {
        return commandList().keySet();
    }

}
