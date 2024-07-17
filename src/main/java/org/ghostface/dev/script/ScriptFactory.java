package org.ghostface.dev.script;

import org.ghostface.dev.exceptions.InvalidCommandException;
import org.ghostface.dev.input.Input;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;

interface ScriptFactory {

    Input execute(LinkedList<@NotNull String> promptList) throws InvalidCommandException;
    LinkedList<@NotNull String> getPrompt(LinkedList<@NotNull String> promptList);

}
