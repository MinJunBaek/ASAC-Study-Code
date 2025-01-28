package level3.dto;

public class VendorResponseDto {

    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private String address;
    private String category;

    public VendorResponseDto(Integer id, String name, Integer age, String email, String address, String category) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.category = category;
    }
}
