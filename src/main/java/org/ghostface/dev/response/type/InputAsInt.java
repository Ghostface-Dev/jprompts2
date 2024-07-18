package org.ghostface.dev.response.type;

import org.ghostface.dev.response.Input;

public class InputAsInt extends Input {
    private final int value = sc.nextInt();

    public int getValue() {
        return value;
    }
}
