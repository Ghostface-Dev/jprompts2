package org.ghostface.dev;

import org.ghostface.dev.core.Commandline;
import org.ghostface.dev.input.Input;
import org.ghostface.dev.script.Script;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public abstract class Command implements Commandline {
    private final @NotNull String commandName;
    private final @NotNull Map<String,Command> commandList = new LinkedHashMap<>();

    Command(@NotNull String commandName) {
        this.commandName = commandName;
    }

    @Override
    public final Input executeScript(Map<@NotNull String, Script> scriptList, @NotNull String scriptName) {
        return scriptList.get(scriptName).execute();
    }

    @Override
    public final boolean containsCommand(@NotNull String commandName) {
        return commandList.containsKey(commandName);
    }

    @Override
    public final @NotNull Set<@NotNull String> commandSet() {
        return commandList.keySet();
    }

    protected @NotNull Map<@NotNull String, Command> getCommand() {
        return commandList;
    }

}
