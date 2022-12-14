package pairmatching;

import pairmatching.controller.Controller;
import pairmatching.util.Validator;
import pairmatching.view.Input;
import pairmatching.view.Output;

import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException {
        Controller controller = new Controller(new Input(), new Output(), new Validator());
        controller.run();
    }
}
