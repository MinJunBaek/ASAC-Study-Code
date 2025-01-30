package level1;

import java.util.HashMap;
import level1.dto.Member;

public class MemberRepository implements IRepository {

    private static HashMap<Integer, Member> hashMap = new HashMap<>();
    private static Integer COUNT_ID = 0;

    private Integer idGenerator() {
        return COUNT_ID++;
    }

    @Override
    public Member create(Member member) {
        Integer memberKey = idGenerator();
        member.setId(memberKey);
        hashMap.put(memberKey, member);
        System.out.println(memberKey + "가 정상적으로 생성되었습니다");
        return member;
    }

    @Override
    public Member read(Integer id) {
        System.out.println(id + "를 출력합니다");
        return hashMap.get(id);
    }

    @Override
    public Member update(Member member) {
        Integer memberKey = member.getId();
        hashMap.put(memberKey, member);
        System.out.println(memberKey + "수정이 정상적으로 반영되었습니다");
        return hashMap.get(memberKey);
    }

    @Override
    public void delete(Integer id) {
        if (!hashMap.containsKey(id)) {
            System.out.println("해당 " + id + "가 없습니다.");
            return;
        }
        hashMap.remove(id);
        System.out.println(id + "가 정상적으로 삭제되었습니다");
    }

    public void allRead() {
        hashMap.forEach((key, value) -> System.out.println(key + " | " + value));
    }
}
