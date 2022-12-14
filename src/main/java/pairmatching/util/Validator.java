package pairmatching.util;

import pairmatching.type.Function;

import java.util.List;

public class Validator {

    public void checkFunction(String function) {
        List<String> functions = Function.getFunctionList();
        if (!functions.contains(function)) {
            throw new IllegalArgumentException();
        }
    }
}
