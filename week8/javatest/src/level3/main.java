package level3;

import level3.dto.Member;
import level3.dto.MemberResponseDto;
import level3.dto.Vendor;
import level3.dto.VendorResponseDto;

public class main {

    public static void main(String[] args) {
        MemberRepository memberRepository = new MemberRepository();

        // 객체 생성
        System.out.println("객체 생성");
        memberRepository.create(new Member("박길동", 20, "park@naver.com"));
        memberRepository.create(new Member("고길동", 30, "go@naver.com"));
        memberRepository.create(new Member("홍길동", 10, "hong@naver.com"));
        memberRepository.create(new Member("장길동", 40, "jang@naver.com"));
        memberRepository.create(new Member("조길동", 50, "jo@naver.com"));
        memberRepository.create(new Member("최길동", 60, "choi@naver.com"));

        // 전체 조회
        System.out.println("전체 조회");
        System.out.println(memberRepository.read()
            .stream()
            .map(member -> new MemberResponseDto(member.getId(), member.getName(), member.getAge(), member.getEmail()))
            .toList()
        );

        // 삭제
        System.out.println("삭제");
        memberRepository.delete(0);
        // System.out.println("없는 값 삭제");
        // repository.delete(0);

        // 업데이트
        System.out.println("업데이트");
        memberRepository.update(1, new Member("박길떵", 30, "park@naver.com"));
        // System.out.println("없는 값 업데이트");==
        // repository.update(0, new Member("홍", 10, "Hong"));

        // 조회
        System.out.println("개별 조회");
        System.out.println(memberRepository.read(1));
        System.out.println(memberRepository.read(2));

        // System.out.println("없는값 조회");
        // System.out.println(repository.read(0));


        // Vendor
        VendorRepository vendorRepository = new VendorRepository();

        vendorRepository.create(new Vendor("박길동", 20, "park@naver.com", "서울", "주문생산"));
        vendorRepository.create(new Vendor("고길동", 30, "go@naver.com", "충남", "재고생산"));
        vendorRepository.create(new Vendor("홍길동", 10, "hong@naver.com", "대전", "MTA"));

        System.out.println(vendorRepository.read().stream()
            .map(vendor -> new VendorResponseDto(vendor.getId(), vendor.getName(), vendor.getAge(), vendor.getEmail(), vendor.getAddress(),
                vendor.getCategory()))
            .toList()
        );
    }

}
