package pairmatching.type;

import java.util.ArrayList;
import java.util.List;

public enum Mission {

    CAR_RACE("자동차경주"),

    LOTTO("로또"),

    BASEBALL("숫자야구게임"),

    SHOPPING_BASKET("장바구니"),

    PAYMENT("결제"),

    SUBWAY("지하철노선도"),

    IMPROVEMENT("성능개선"),

    DISTRIBUTE("배포");

    private final String name;

    Mission(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<String> getMissionNames() {
        List<String> missionNames = new ArrayList<>();
        for (Mission mission : Mission.values()) {
            missionNames.add(mission.getName());
        }
        return missionNames;
    }
}
