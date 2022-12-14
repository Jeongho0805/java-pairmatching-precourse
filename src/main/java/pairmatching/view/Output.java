package pairmatching.view;

import pairmatching.type.ErrorMessage;
import pairmatching.type.GuideMessage;

public class Output {

    public void printSelectMessage() {
        System.out.println(GuideMessage.SELECT_MESSAGE);
    }

    public void printSelectErrorMessage() {
        System.out.println(ErrorMessage.SELECTION_ERROR);
    }

    public void printMissionInfo() {
        System.out.println(GuideMessage.MISSION_INFO_MESSAGE);
        System.out.println(GuideMessage.MISSION_SELECT_MESSAGE);
    }

    public void printErrorMessage(IllegalArgumentException e) {
        System.out.println(e.getMessage());
        System.out.println();
    }
}
