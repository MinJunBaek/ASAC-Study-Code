package study10;

import java.util.Optional;

public class main {

    public static void main(String[] args) {
        System.out.println("객체가 존재한 Member");
        Member member1 = new Member();
        Optional<Member> optionalMember1 = Optional.of(member1); // 맴버 객체 자체가 있어서 오류가 없음
        System.out.println(optionalMember1);

        System.out.println("null값을 가진 Member");
        Member member2 = null;
        Optional<Member> optionalMember2 = Optional.ofNullable(member2);
        System.out.println(optionalMember2);

        Optional<Member> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        System.out.println(Optional.ofNullable(new Member()));
        System.out.println();

        Optional<Member> memberExist = Optional.ofNullable(new Member());
        Optional<Member> memberNotExist = Optional.ofNullable(null);

        System.out.println(memberExist);
        System.out.println(memberNotExist);
        System.out.println();

        System.out.println("확인");
        optionalMember1.orElse(new Member(0, ""));

        Member member = optionalMember2.orElseThrow(() -> {return new RuntimeException("유저 정보가 없습니다");});
        System.out.println(member);
        System.out.println();
    }

}
