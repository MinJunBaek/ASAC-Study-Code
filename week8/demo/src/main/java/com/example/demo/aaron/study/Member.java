package aaron.study;

public class Member {
    private Integer id;
    private String name;
    private Integer age;
    private String email;

    public Member(Integer id, String name, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public static boolean equals(Member o1, Member o2) {
        return o1.id.equals(o2.id) &&
            o1.name.equals(o2.name) &&
            o1.age.equals(o2.age) &&
            o1.email.equals(o2.email);
        // o1의 this.을 바꿔서 객체내에 메서드로 반환해도 된다
    }

    @Override
    public String toString() {
        return this.id + " | " + this.name + " | " + this.age + " | " + this.email;
    }
}
