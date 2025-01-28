package level1;

import level1.dto.Member;

public class main {

    public static void main(String[] args) {
        MemberRepository repository = new MemberRepository();

        Member member0 = new Member("홍길동", 10, "hong@naver.com");
        Member member1 = new Member("박길동", 20, "park@naver.com");
        Member member2 = new Member("김길동", 30, "kim@naver.com");
        Member member3 = new Member("고길동", 40, "go@naver.com");

        System.out.println("객체 생성");
        repository.create(member0);
        repository.create(member1);
        repository.create(member2);
        repository.create(member3);
        System.out.println();

        System.out.println("삭제");
        repository.delete(0);
        System.out.println();

        System.out.println("업데이트");
        member3.setName("조길동");
        member3.setEmail("jo@naver.com");
        repository.update(member3);
        System.out.println();

        System.out.println("조회");
        System.out.println(repository.read(1));
        System.out.println(repository.read(2));
        System.out.println(repository.read(3));
        System.out.println();

        System.out.println("모두 조회");
        repository.allRead();
    }

}
