package level3.dto;

public class MemberResponseDto{
    private Integer id;
    private String name;
    private Integer age;
    private String email;

    public MemberResponseDto(Integer id, String name, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
