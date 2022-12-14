package pairmatching.util;

import pairmatching.type.*;

import java.util.List;
import java.util.StringTokenizer;

public class Validator {

    public static final String COMMA = ",";

    public void checkFunction(String function) {
        List<String> functions = Function.getFunctionList();
        if (!functions.contains(function)) {
            throw new IllegalArgumentException();
        }
    }

    public void checkDetailInfo(String detailInfo) {
        String[] info = detailInfo.split(COMMA);
        checkLength(info);
        checkCourse(info[0]);
        checkLevel(info[1]);
        checkMission(info[2]);
    }

    private void checkLength(String[] info) {
        if (info.length != 3) {
            throw new IllegalArgumentException(ErrorMessage.DETAIL_INFO_LENGTH_ERROR);
        }
    }

    private void checkMission(String mission) {
        List<String> missionNames = Mission.getMissionNames();
        if (!missionNames.contains(mission.trim())) {
            throw new IllegalArgumentException(ErrorMessage.DETAIL_INFO_MISSION_ERROR);
        }
    }

    private void checkLevel(String level) {
        List<String> levelNames = Level.getLevelNames();
        if (!levelNames.contains(level.trim())) {
            throw new IllegalArgumentException(ErrorMessage.DETAIL_INFO_LEVEL_ERROR);
        }
    }

    private void checkCourse(String course) {
        List<String> courseNames = Course.getCourseNames();
        if (!courseNames.contains(course.trim())) {
            throw new IllegalArgumentException(ErrorMessage.DETAIL_INFO_COURSE_ERROR);
        }
    }
}
