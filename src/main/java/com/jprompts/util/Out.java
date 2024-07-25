package com.jprompts.util;

import org.jetbrains.annotations.NotNull;

import javax.naming.OperationNotSupportedException;
import java.util.Scanner;

public final class Out {
    private static final @NotNull Scanner sc = new Scanner(System.in);

    public static @NotNull String nextLine() {
        return sc.nextLine();
    }

    public static @NotNull String next() {
        return sc.next();
    }

    public static int nextInt() {
        return sc.nextInt();
    }

    public static double nextDouble() {
        return sc.nextDouble();
    }

    // object
    private Out() {
        throw new UnsupportedOperationException();
    }
}
