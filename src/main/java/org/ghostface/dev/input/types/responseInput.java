package org.ghostface.dev.input.types;

import org.ghostface.dev.input.Input;
import org.jetbrains.annotations.NotNull;

public final class responseInput extends Input {
    private final @NotNull String responseInput = scanner.nextLine();

    @Override
    public @NotNull String getResponse() {
        return String.valueOf(responseInput);
    }
}
