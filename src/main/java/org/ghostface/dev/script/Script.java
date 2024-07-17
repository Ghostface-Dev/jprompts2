package org.ghostface.dev.script;

import org.ghostface.dev.exceptions.InvalidCommandException;
import org.ghostface.dev.input.Input;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public abstract class Script implements ScriptFactory {

    public abstract Map<@NotNull String, @NotNull Script> scriptList();
    protected abstract void design(LinkedList<@NotNull String> promptList);


}
