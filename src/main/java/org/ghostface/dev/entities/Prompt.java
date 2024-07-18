package org.ghostface.dev.entities;

import org.ghostface.dev.impl.ConfirmScript;
import org.ghostface.dev.impl.InputScript;
import org.ghostface.dev.impl.ListScript;
import org.ghostface.dev.root.Command;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.Objects;

public class Prompt extends Command {

    private @NotNull Script script;
    private final LinkedList<@NotNull String> questionList = new LinkedList<>();

    public Prompt(@NotNull String scriptType) {
        if (scriptType.equalsIgnoreCase("list")) {
            this.script = new ListScript();
        } else if (scriptType.equalsIgnoreCase("confirm")) {
            script = new ConfirmScript(scriptType);
        } else if (scriptType.equalsIgnoreCase("input")) {
            this.script = new InputScript();
        }
    }

    public final void addQuestion(@NotNull String question) {
        if (this.script.equals(new ConfirmScript("confirm"))) {
            this.questionList.addFirst(question);
        } else if (this.script.equals(new ListScript())) {
            this.questionList.add(question);
        }
    }

    private void addList(@NotNull String question) {
        questionList.add(question);
    }

    public LinkedList<@NotNull String> getQuestionList() {
        return questionList;
    }

    public @NotNull Script getScript() {
        return script;
    }

}
