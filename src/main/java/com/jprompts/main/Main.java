package com.jprompts.main;

import com.jprompts.core.Command;
import com.jprompts.prompt.PrintHelloWorldPrompt;


public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        Command.add(new PrintHelloWorldPrompt());

        while (true) {
            Command.insert();
        }

    }

}
