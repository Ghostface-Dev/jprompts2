package com.jprompts.request.main;

import com.jprompts.request.core.Command;
import com.jprompts.request.core.Prompt;
import com.jprompts.request.prompt.PrintHelloWorldPrompt;
import org.jetbrains.annotations.NotNull;


public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        Command.add(new PrintHelloWorldPrompt());

        Command.insert();

    }

}
