package level3.dto;

public class Human {

    private Integer id;
    private String name;
    private boolean isDeleted = false;

    public Human(String name) {
        this.name = name;
    }

    public Human(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Human(Integer id, String name, boolean isDeleted) {
        this.id = id;
        this.name = name;
        this.isDeleted = isDeleted;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean getIsDeleted() {
        return this.isDeleted;
    }

}
