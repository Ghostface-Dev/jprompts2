package org.ghostface.dev.imp;

import com.google.gson.JsonObject;
import org.ghostface.dev.container.TypeFactory;
import org.jetbrains.annotations.NotNull;

public abstract class TypeFactoryImp implements TypeFactory {
    private final @NotNull String type;
    private @NotNull String message;
    private boolean required;

    protected TypeFactoryImp(@NotNull String type, @NotNull String message) {
        this.type = type;
        this.message = message;

        if (this.required) {
            runPrompt();
        }
    }

    protected abstract void runPrompt();


    @Override
    public @NotNull String setMessage(@NotNull String message) {
        return this.message = message;
    }

    @Override
    public @NotNull JsonObject serialize() {
        JsonObject object = new JsonObject();

        return object;
    }

    // getters


    public @NotNull String getMessage() {
        return message;
    }

    @Override
    public @NotNull String getTypePrompt() {
        return "";
    }

    @Override
    public boolean isRequired() {
        return this.required;
    }

}
