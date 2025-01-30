package level3;

import java.util.List;
import java.util.Optional;
import level3.dto.Member;

public class MemberRepository extends AbstractRepository<Member, Integer>{
    public Member create(Member entity) {
        Integer memberKey = idGenerator();
        Member member = new Member(memberKey, entity.getName(), entity.getAge(), entity.getEmail());
        repository.put(memberKey, member);
        current();
        return member;
    }

    public Member read(Integer id) {
        current();
        return Optional.ofNullable(repository.get(id))
            .filter((each) -> !each.getIsDeleted())
            .orElseThrow(() -> {
                throw new RuntimeException("해당 " + id + "가 없습니다.");
            });
    }

    public List<Member> read() {
        return repository.values()
            .stream()
            .filter(each -> !each.getIsDeleted())
            .toList();
    }

    public Member update(Integer id, Member entity) {
        System.out.print("수정 전: ");
        read(id);
        Member newMember = new Member(id, entity.getName(), entity.getAge(), entity.getEmail());
        System.out.print("수정 후: ");
        repository.put(id, newMember);
        current();
        return repository.get(id);
    }

    public void delete(Integer id){
        System.out.print("삭제 전: ");
        Member member = read(id);
        Member deletdMember = new Member(member.getId(), member.getName(), true, member.getAge(), member.getEmail());
        repository.put(deletdMember.getId(), deletdMember);
        System.out.print("삭제 후: ");
        current();
    }
}
