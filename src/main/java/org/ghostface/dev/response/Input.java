package org.ghostface.dev.response;

import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.Scanner;

public class Input {
    private final @NotNull Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private final @NotNull String input = sc.nextLine();

    public @NotNull String value() {
        return input;
    }
}
