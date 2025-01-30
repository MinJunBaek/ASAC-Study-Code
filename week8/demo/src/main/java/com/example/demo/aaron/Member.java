package aaron;

import java.util.Comparator;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@ToString
@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Member {
    Integer id;
    String name;
    int age;
    String email;

    public int compareTo(Member o2) {
        return this.name.compareTo(o2.name);
    }

    public static int compareTo(Member o1, Member o2) {
        return o1.name.compareTo(o2.name);
    }

    public boolean equals(Member o2) {
        return this.id.equals(o2.id)
            && this.name.equals(o2.name)
            && this.age == o2.age
            && this.email.equals(o2.email);
    }

    public static boolean equals(Member o1, Member o2) {
        return o1.id.equals(o2.id)
            && o1.name.equals(o2.name)
            && o1.age == o2.age
            && o1.email.equals(o2.email);
    }

//      boolean isEqual = Member.equals(c, d);
    // boolean isEqual = c.equals(d);

//      list.sort((o1, o2) -> Member.compareTo(o1, o2));
//      list.sort((o1, o2) -> o1.compareTo(o2));
//      list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    // list.sort(Comparator.comparing(Member::getName));
}