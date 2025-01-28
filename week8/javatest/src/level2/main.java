package level2;

import level2.dto.Member;

public class main {

    public static void main(String[] args) {
        MemberRepository repository = new MemberRepository();

        // 객체 생성
        System.out.println("객체 생성");
        repository.create(new Member("홍길동", 10, "hong@naver.com"));
        repository.create(new Member("박길동", 20, "park@naver.com"));
        repository.create(new Member("고길동", 30, "go@naver.com"));
        repository.create(new Member("장길동", 40, "jang@naver.com"));
        repository.create(new Member("조길동", 50, "jo@naver.com"));
        repository.create(new Member("최길동", 60, "choi@naver.com"));

        // 전체 조회
        System.out.println("전체 조회");
        System.out.println(repository.read());

        // 삭제
        System.out.println("삭제");
        repository.delete(0);
        // System.out.println("없는 값 삭제");
        // repository.delete(0);

        // 업데이트
        System.out.println("업데이트");
        repository.update(1, new Member("박길떵", 30, "park@naver.com"));
        // System.out.println("없는 값 업데이트");==
        // repository.update(0, new Member("홍", 10, "Hong"));

        // 조회
        System.out.println("개별 조회");
        System.out.println(repository.read(1));
        System.out.println(repository.read(2));

        // System.out.println("없는값 조회");
        // System.out.println(repository.read(0));

    }
}
