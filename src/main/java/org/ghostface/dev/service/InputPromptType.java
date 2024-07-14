package org.ghostface.dev.service;

import org.ghostface.dev.container.TypeFactory;
import org.ghostface.dev.imp.TypeFactoryImp;
import org.jetbrains.annotations.NotNull;

public class InputPromptType extends TypeFactoryImp {

    public InputPromptType(@NotNull String type, @NotNull String message) {
        super(type, message);
    }

    @Override
    public void runPrompt() {
        System.out.println();
        System.out.println(getMessage());
    }
}
