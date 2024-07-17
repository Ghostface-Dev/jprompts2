package org.ghostface.dev.core;

import org.ghostface.dev.script.Script;
import org.ghostface.dev.input.Input;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Set;

public interface Commandline {

    boolean containsCommand(@NotNull String commandName);

    Input executeScript(Map<@NotNull String, Script> scriptList, @NotNull String scriptName);

    @NotNull Set<@NotNull String> commandSet();


}
