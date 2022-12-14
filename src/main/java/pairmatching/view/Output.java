package pairmatching.view;

import pairmatching.type.ErrorMessage;
import pairmatching.type.GuideMessage;

public class Output {

    public void printSelectMessage() {
        System.out.println(GuideMessage.selectMessage);
    }

    public void printSelectErrorMessage() {
        System.out.println(ErrorMessage.SELECTION_ERROR);
    }
}
