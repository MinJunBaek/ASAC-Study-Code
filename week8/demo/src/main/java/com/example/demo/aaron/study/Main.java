package aaron.study;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        list.add(new Member(0, "Aaron", 10, "Aaron@naver.com"));
        list.add(new Member(2, "Caron", 30, "Caron@naver.com"));
        list.add(new Member(3, "Daron", 40, "Daron@naver.com"));
        list.add(new Member(1, "Baron", 20, "Baron@naver.com"));

        list.sort((o1, o2) -> o1.getId().compareTo(o2.getId()));
//        System.out.println(list);
        // 비교는 기본적으로 equals()로 대부분 비슷하다

        Member member = new Member(null, null, null, null);
//        Optional<Member> memberExist = Optional.ofNullable(member);
//        Optional<Member> memberNotExist = Optional.ofNullable(null);

        // System.out.println(memberExist); // 내용이 있으면 toString으로 해당내용을 반환해준다.
        // System.out.println(memberNotExist); // empty반환하면 널이다

//        System.out.println(memberExist.get()); // get()으로 값을 가져온다.

    }

    private static Member anyName() {
        return new Member(null, "이름없음", null, "이메일없음");
    }

}
