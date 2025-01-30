package level2;

import java.util.List;
import level2.dto.Member;

public interface IRepository {
    Member create(Member entity);
    Member read(Integer id);
    List<Member> read();
    Member update(Integer id, Member entity);
    void delete(Integer id);
}