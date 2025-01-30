package level1.dto;

public class Member extends Human {

    private Integer age;
    private String email;

    public Member(String name, Integer age, String email) {
        super(name);
        this.age = age;
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(getName() + " | " + this.age + " | " + this.email);
    }
}
