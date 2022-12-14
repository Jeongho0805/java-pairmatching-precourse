package pairmatching.type;

public class ErrorMessage {

    public static final String ERROR = "[ERROR] ";

    public static final String SELECTION_ERROR = ERROR + "기능 선택은 (1, 2, 3, Q) 넷 중에 하나만 가능합니다.";
    public static final String DETAIL_INFO_LENGTH_ERROR = ERROR + "과정, 레벨, 미션 항목으로 3가지를 콤마로 나누어 입력해야 합니다.";
    public static final String DETAIL_INFO_MISSION_ERROR = ERROR + "해당 이름과 일치하는 미션이 존재하지 않습니다.";
    public static final String DETAIL_INFO_LEVEL_ERROR = ERROR + "해당 하는 레벨이 존재하지 않습니다.";
    public static final String DETAIL_INFO_COURSE_ERROR = ERROR + "해당 하는 과정이 존재하지 않습니다.";


}
