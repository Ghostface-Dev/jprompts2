package org.ghostface.dev;

import org.ghostface.dev.request.Script;
import org.ghostface.dev.request.impl.ConfirmScript;
import org.ghostface.dev.request.impl.InputScript;
import org.ghostface.dev.request.impl.ListScript;
import org.ghostface.dev.root.Command;
import org.jetbrains.annotations.NotNull;


public class Prompt implements Command {

    private @NotNull Script script;

    private Prompt(@NotNull String scriptType) {
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
    }

    private @NotNull Script getScript() {
        return script;
    }
}
