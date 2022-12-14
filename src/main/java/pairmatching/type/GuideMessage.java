package pairmatching.type;

public class GuideMessage {

    public static final String SELECT_MESSAGE = "기능을 선택하세요.\n1. 페어 매칭\n2. 페어 조회\n3. 페어 초기화\nQ. 종료";

    public static final String START_END_LINE = "#############################################\n";

    public static final String COURSE_INFO = "과정: 백엔드 | 프론트엔드\n";

    public static final String MISSION = "미션:\n";

    public static final String LEVEL1_MISSION = "  - 레벨1: 자동차경주 | 로또 | 숫자야구게임1\n";

    public static final String LEVEL2_MISSION = "  - 레벨2: 장바구니 | 결제 | 지하철노선도\n";

    public static final String LEVEL3_MISSION = "  - 레벨3: \n";

    public static final String LEVEL4_MISSION = "  - 레벨4: 성능개선 | 배포\n";

    public static final String LEVEL5_MISSION = "  - 레벨5: ";

    public static final String MISSION_INFO_MESSAGE = START_END_LINE + COURSE_INFO + MISSION +
            LEVEL1_MISSION + LEVEL2_MISSION + LEVEL3_MISSION + LEVEL4_MISSION +
            LEVEL5_MISSION + START_END_LINE;

    public static final String MISSION_SELECT_MESSAGE = "과정, 레벨, 미션을 선택하세요.\nex) 백엔드, 레벨1, 자동차경주";
}
