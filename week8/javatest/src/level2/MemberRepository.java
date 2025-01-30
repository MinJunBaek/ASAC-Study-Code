package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import level2.dto.Member;

public class MemberRepository extends MemberAbstractRepository{

    public Member create(Member entity) {
        Integer memberKey = idGenerator();
        repository.put(memberKey, entity);
        entity.setId(memberKey);
        current();
        return entity;
    }

    public Member read(Integer id){
        current();
        return Optional.ofNullable(repository.get(id))
            .filter(member -> member.getIsDeleted() == false) // !member.getIsDeleted()를 해도 됨.
            .orElseThrow(() -> {
                throw new RuntimeException("해당 아이디가 없습니다.");
            });
    }

    public List<Member> read(){
        List<Member> members = new ArrayList<>(repository.values())
            .stream()
            .filter(member -> !member.getIsDeleted())
            .toList();
        return members;
    }

    public Member update(Integer id, Member entity){
        read(id);
        entity.setId(id);
        return repository.put(id, entity);
    }

    public void delete(Integer id){
        read(id);
        repository.get(id).setIsDeleted();
        current();
    }

    private void current() {
        read().forEach(each -> System.out.print(each));
        System.out.println();
    }
}