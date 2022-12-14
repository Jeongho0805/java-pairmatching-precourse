package pairmatching.controller;

import pairmatching.type.Function;
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
        while (true) {
            String function = selectFunction();
            if (function.equals(Function.QUIT.getFunction())) {
                break;
            }
            activateFunction(function);
        }
    }

    private void activateFunction(String function) {
        if (function.equals(Function.MATCH_PAIR.getFunction())) {
            matchPair();
            return;
        }
        if (function.equals(Function.INQUIRE_PAIR.getFunction())) {
            InquirePair();
            return;
        }
        initPair();

    }

    private void initPair() {
    }

    private void InquirePair() {
    }

    private void matchPair() {
        String detailInfo = getInfoDetail();

    }

    private String getInfoDetail() {
        while (true) {
            output.printMissionInfo();
            String detailInfo = input.printDetailInfo();
            try {
                validator.checkDetailInfo(detailInfo);
            } catch (IllegalArgumentException e) {
                output.printErrorMessage(e);
                continue;
            }
            return detailInfo;
        }
    }

    private String selectFunction() {
        while (true) {
            output.printSelectMessage();
            String function;
            try {
                function = input.readSelection();
                validator.checkFunction(function);
            } catch (IllegalArgumentException e) {
                output.printSelectErrorMessage();
                continue;
            }
            return function;
        }
    }
}
