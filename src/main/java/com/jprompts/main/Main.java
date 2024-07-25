package com.jprompts.main;

import com.jprompts.core.Command;
import com.jprompts.prompt.AbstractPrompt;
import com.jprompts.prompt.PrintHelloWorldPrompt;
import com.jprompts.script.Input;


public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        Command.add(new PrintHelloWorldPrompt());

        Command.insert();

    }

}
