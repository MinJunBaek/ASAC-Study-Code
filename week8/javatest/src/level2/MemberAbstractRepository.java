package level2;

import java.util.HashMap;
import java.util.Map;
import level2.dto.Member;

public abstract class MemberAbstractRepository implements IRepository {

    protected static Map<Integer, Member> repository = new HashMap<>();

    private static Integer MEMBER_ID = 0;

    protected Integer idGenerator() {
        return MEMBER_ID++;
    }
}
