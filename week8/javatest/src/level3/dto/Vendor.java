package level3.dto;

public class Vendor extends Human {

    private Integer age;
    private String email;
    private String address;
    private String category;

    public Vendor(String name, Integer age, String email, String address, String category) {
        super(name);
        this.age = age;
        this.email = email;
        this.address = address;
        this.category = category;
    }

    public Vendor(Integer id, String name, Integer age, String email, String address, String category) {
        super(id, name);
        this.age = age;
        this.email = email;
        this.address = address;
        this.category = category;
    }

    public Vendor(Integer id, String name, boolean isDeleted, Integer age, String email, String address, String category) {
        super(id, name, isDeleted);
        this.age = age;
        this.email = email;
        this.address = address;
        this.category = category;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCategory() {
        return this.category;
    }

    @Override
    public String toString() {
        return this.getId() + " | "
            + this.getName() + " | "
            + this.getAge() + " | "
            + this.getEmail() + " | "
            + this.address + " | "
            + this.category + " | "
            + this.getIsDeleted() + " | ";
    }
}
