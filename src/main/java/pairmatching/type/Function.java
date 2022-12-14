package pairmatching.type;

import java.util.ArrayList;
import java.util.List;

public enum Function {

    MATCH_PAIR("1"),
    INQUIRE_PAIR("2"),

    INIT_PAIR("3"),
    QUIT("Q");

    private final String function;

    Function(String function) {
        this.function = function;
    }

    public String getFunction() {
        return function;
    }

    public static List<String> getFunctionList() {
        List<String> functions = new ArrayList<>();
        Function[] values = Function.values();
        for (Function value : values) {
            functions.add(value.getFunction());
        }
        return functions;
    }
}
