package pairmatching.controller;

import pairmatching.util.Validator;
import pairmatching.view.Input;
import pairmatching.view.Output;

public class Controller {

    private final Input input;

    private final Output output;

    private final Validator validator;

    public Controller(Input input, Output output, Validator validator) {
        this.input = input;
        this.output = output;
        this.validator = validator;
    }

    public void run() {
        String function = selectFunction();

    }

    private String selectFunction() {
        while (true) {
            output.printSelectMessage();
            String function = "";
            try {
                function = Input.readSelection();
                validator.checkFunction(function);
            } catch (IllegalArgumentException e) {
                output.printSelectErrorMessage();
                continue;
            }
            return function;
        }
    }
}
