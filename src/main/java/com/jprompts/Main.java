package com.jprompts;

import com.jprompts.util.Command;
import com.jprompts.prompt.PrintHelloWorldPrompt;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        Command.add(new PrintHelloWorldPrompt());

        while (true) {
            Command.insert();
        }
    }

}
