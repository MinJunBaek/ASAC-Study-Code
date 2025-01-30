package level2.dto;

public class Human {

    protected Integer id;
    protected String name;
    protected boolean isDeleted = false;

    public Human(String name) {
        this.name = name;
    }
}