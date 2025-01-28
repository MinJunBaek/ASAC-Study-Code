package study10;

public class Member {
    public Long id;
    public String name;
    public Address address;

    public String toString(){
        return id + " | " + name + " | " + address;
    }
}
