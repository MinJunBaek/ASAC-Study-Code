package level3;

import java.util.HashMap;
import java.util.Map;
import level3.dto.Human;

public abstract class AbstractRepository<T extends Human, ID> implements IRepository<T, ID>{
    protected Map<ID, T> repository = new HashMap<>();

    private Integer REPOSITORY_KEY = 0;

    protected Integer idGenerator() {
        return REPOSITORY_KEY++;
    }

    public void current() {
        repository.values().forEach(each -> System.out.print(each));
        System.out.println();
    }
}
