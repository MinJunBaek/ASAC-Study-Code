package level3.dto;

public class Member extends Human{

    private Integer age;
    private String email;

    public Member(String name, Integer age, String email) {
        super(name);
        this.age = age;
        this.email = email;
    }

    public Member(Integer id, String name, Integer age, String email) {
        super(id, name);
        this.age = age;
        this.email = email;
    }

    public Member(Integer id, String name, boolean isDeleted, Integer age, String email) {
        super(id, name, isDeleted);
        this.age = age;
        this.email = email;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return this.getId() + " | "
            + this.getName() + " | "
            + this.getAge() + " | "
            + this.getEmail() + " | "
            + this.getIsDeleted() + " | ";
    }
}
