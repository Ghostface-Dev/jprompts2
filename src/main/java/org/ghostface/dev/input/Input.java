package org.ghostface.dev.input;

import com.google.gson.internal.Primitives;
import com.sun.jdi.IntegerType;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.Charset;
import java.util.Scanner;

public abstract class Input {
    protected static @NotNull Scanner scanner;

    public abstract @NotNull String getResponse();
}

