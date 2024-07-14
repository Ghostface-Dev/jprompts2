package org.ghostface.dev.imp;

import com.google.gson.JsonObject;
import org.ghostface.dev.container.Option;
import org.jetbrains.annotations.NotNull;

public class Action implements Option {
    @Override
    public @NotNull JsonObject serialize() {
        return null;
    }

    @Override
    public void add(@NotNull String message) {

    }

    @Override
    public void remove(@NotNull String message) {

    }
}
