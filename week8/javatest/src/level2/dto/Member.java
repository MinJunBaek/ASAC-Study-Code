package level2.dto;

public class Member extends Human{
    private Integer age;
    private String email;

    public Member(String name, Integer age, String email) {
        super(name);
        this.age = age;
        this.email = email;
    }

    public String toString() {
        return id + " | " + name + " | " + age + " | " + email;
    }

    public void setIsDeleted() {
        this.isDeleted = true;
    }

    public boolean getIsDeleted() {
        return this.isDeleted;
    }

    public void setId(Integer id){
        this.id = id;
    }
}