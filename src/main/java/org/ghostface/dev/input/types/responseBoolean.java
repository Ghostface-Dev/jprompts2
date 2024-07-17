package org.ghostface.dev.input.types;

import org.ghostface.dev.input.Input;
import org.jetbrains.annotations.NotNull;

public final class responseBoolean extends Input {
    private final boolean responseBoolean = scanner.nextBoolean();

    @Override
    public @NotNull String getResponse() {
        return String.valueOf(responseBoolean);
    }
}
