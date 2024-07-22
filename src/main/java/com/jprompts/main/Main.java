package com.jprompts.main;

import com.jprompts.command.Prompt;

public class Main {

    public static void main(String[] args) {

        Prompt prompt = new Prompt("confirm");

        prompt.addQuestion("test1");
        prompt.addQuestion("test2");
        prompt.addQuestion("test3");

        prompt.run();

        if (prompt.anwser("test2").equalsIgnoreCase("y")) {
            System.out.println("hello world!");
        }


    }

}
