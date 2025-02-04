package study10;

public class Member {
    public Long id;
    public String name;
    public Address address;

    public Member(long id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return id + " | " + name + " | " + address;
    }
}