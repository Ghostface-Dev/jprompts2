package org.ghostface.dev.imp;

import com.google.gson.JsonObject;
import org.ghostface.dev.container.Option;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Question implements Option {
    final @NotNull String message;
    protected final @NotNull Map<String, Method> prompts = new HashMap<>();

    protected Question(@NotNull String message) {
        this.message = message;
    }

    // return all infos
    @Override
    public @NotNull JsonObject serialize() {
        return new JsonObject();
    }

    @Override
    public void add(@NotNull String message) {

    }

    @Override
    public void remove(@NotNull String message) {

    }

    public @NotNull String getMessage() {
        return message;
    }
}
