package org.ghostface.dev.entities;

import org.ghostface.dev.impl.ConfirmScript;
import org.ghostface.dev.impl.InputScript;
import org.ghostface.dev.impl.ListScript;
import org.ghostface.dev.root.Command;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;

public class Prompt extends Command {

    private @NotNull Script script;
    private final LinkedList<@NotNull String> questionList = new LinkedList<>();

    public Prompt(@NotNull String scriptType) {
        if (scriptType.equalsIgnoreCase("list")) {
            this.script = new ListScript();
        } else if (scriptType.equalsIgnoreCase("confirm")) {
            script = new ConfirmScript();
        } else if (scriptType.equalsIgnoreCase("input")) {
            this.script = new InputScript();
        }
    }

    public final void addQuestion(@NotNull String question, @NotNull Command command) {
        addCommand(question, this);
        addList(question);
    }

    private void addList(@NotNull String question) {
        questionList.add(question);
    }

    LinkedList<@NotNull String> getQuestionList() {
        return questionList;
    }

    private @NotNull Script getScript() {
        return script;
    }
}
