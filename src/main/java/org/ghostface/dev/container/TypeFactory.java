package org.ghostface.dev.container;

import com.google.gson.JsonObject;
import org.jetbrains.annotations.NotNull;

public interface TypeFactory {

    @NotNull String getTypePrompt();

    @NotNull String setMessage(@NotNull String message);

    @NotNull JsonObject serialize();

    boolean isRequired();
}
