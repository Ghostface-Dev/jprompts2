package org.ghostface.dev.response.type;

import org.ghostface.dev.response.Input;
import org.jetbrains.annotations.NotNull;

public class InputAsString extends Input {
    private final @NotNull String value = sc.nextLine();

    public @NotNull String getValue() {
        return value;
    }
}
