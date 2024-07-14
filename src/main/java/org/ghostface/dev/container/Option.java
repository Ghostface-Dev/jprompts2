package org.ghostface.dev.container;

import com.google.gson.JsonObject;
import org.jetbrains.annotations.NotNull;

public interface Option {

    @NotNull JsonObject serialize();

    void add(@NotNull String message);
    void remove(@NotNull String message);


}
