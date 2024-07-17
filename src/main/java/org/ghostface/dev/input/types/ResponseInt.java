package org.ghostface.dev.input.types;

import com.google.gson.internal.Primitives;
import com.sun.jdi.PrimitiveType;
import org.ghostface.dev.input.Input;
import org.jetbrains.annotations.NotNull;

public final class ResponseInt extends Input {
    private final int responseInt = scanner.nextInt();

    @Override
    public @NotNull String getResponse() {
        return String.valueOf(responseInt);
    }
}
