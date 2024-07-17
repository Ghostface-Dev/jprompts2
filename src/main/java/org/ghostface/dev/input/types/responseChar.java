package org.ghostface.dev.input.types;

import org.ghostface.dev.input.Input;
import org.jetbrains.annotations.NotNull;

public final class responseChar extends Input {
    private final char responseChar = scanner.next().charAt(0);

    @Override
    public @NotNull String getResponse() {
        return String.valueOf(responseChar);
    }
}
