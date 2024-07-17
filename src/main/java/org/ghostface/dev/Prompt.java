package org.ghostface.dev;

import org.ghostface.dev.exceptions.UnsuportedTypeException;
import org.ghostface.dev.script.Script;
import org.ghostface.dev.type.ListScript;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.LinkedList;

public class Prompt extends Command {
    private final LinkedList<@NotNull String> questions = new LinkedList<>();
    private final @NotNull String scriptType;

    public Prompt(@NotNull String promptName, @NotNull String scriptType) {
        super(promptName);
        this.scriptType = scriptType;
    }


    public void addCommand() {

    }

    private Script getScriptType() throws UnsuportedTypeException {
        if (this.scriptType.equalsIgnoreCase("list")) {
            return new ListScript();
        } else if (this.scriptType.equalsIgnoreCase("confirm")) {
            return new ConfirmScript();
        } else {
            throw new UnsuportedTypeException("Invalid script type");
        }
    }

    public String getQuestions() {
        return Arrays.toString(questions.toArray());
    }
}
