package com.jprompts.request;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public final class Command {

    private static final @NotNull Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    // set amarzenando todos os comandos
    private static final @NotNull Set<@NotNull Prompt> promptSet = new HashSet<>();

    // vá atrás de input no terminal
    public static void insert() {
        @NotNull String v = sc.next();
        runPrompt(v);
    }

    // verificadores de prompt (se existe)
    private static boolean checker(@NotNull String name) {
        for (@NotNull Prompt prompt : promptSet) {
            if (prompt.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    // rodar o prompt
    private static void runPrompt(@NotNull String name) {
        if (checker(name)) {
            for (@NotNull Prompt prompt: promptSet) {
                if (prompt.getName().equalsIgnoreCase(name)) {
                    prompt.execute();
                }
            }
        }
    }

    // contem prompt?
    public static boolean containsPrompt(@NotNull String name) {
        return checker(name);
    }

    // adicionar prompt

    // remover prompt

    // listar prompts


}
