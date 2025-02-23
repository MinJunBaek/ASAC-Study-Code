package com.example.demo;

import com.example.demo.hero.AgilityHero;
import com.example.demo.hero.IntelligenceHero;
import com.example.demo.hero.StrengthHero;
import com.example.demo.hero.common.Hero;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    Hero strength = new StrengthHero();
    Hero agility = new AgilityHero();
    Hero intelligence = new IntelligenceHero();

    System.out.println("- 🟥 힘 속성 영웅");
    strength.attack();
    strength.ultimate();
    ((StrengthHero) strength).berserk(); // 인터페이스 공통 형상 메서드만 호출 가능 = 인터페이스 다형성(Polymorphism)

    System.out.println("- 🟩 민첩 속성 영웅");
    agility.attack();
    agility.ultimate();

    System.out.println("- 🟦 지능 속성 영웅");
    intelligence.attack();
    intelligence.ultimate();

    /* Collection 1) Array 배열 */
//  String[] string_array = new String[3];                      // 길이 기반 Array 선언 (String 요소)
    String[] string_array = new String[]{"1", "2", "3"};        // 값 기반 Array 선언 (String 요소)
    System.out.println(string_array.length);

//  Integer[] integer_array = new Integer[3];                   // 길이 기반 Array 선언 (Integer 요소)
    Integer[] integer_array = new Integer[]{1, 2, 3};           // 값 기반 Array 선언 (Integer 요소)
    System.out.println(integer_array.length);

    System.out.println(string_array);
    System.out.println(integer_array);

    /* Collection 2) List 리스트 */
    List<String> string_list = new ArrayList<>();
    string_list.add("1");
    string_list.add("2");
    string_list.add("3");
    List<String> string_list_number = Arrays.asList("1", "2", "3");         // 이렇게 선언하면 고정된 배열크기를 리스트로 단순히 감싸는것임(수정이 안됨)
    // List<String> modifiableList = new ArrayList<>(Arrays.asList("1", "2", "3")); // 이렇게 선언해야 할수 있음
    System.out.println(string_list_number.get(2));                                  // 조회 : 3출력
    // string_list_number.add("4");                                                 // 추가 : 안됨
    string_list_number.set(2, "5");                                                 // 수정 : 3을 5로 변경
    System.out.println(string_list_number);                                         // 조회 : [1, 2, 5]
    // string_list_number.remove(0);                                                // 삭제 : 안됨
    System.out.println(string_list_number.subList(0, 1));                           // 부분조회 : 1
    string_list_number.sort(String::compareTo);                                     // 나열
    System.out.println(string_list_number.contains("1"));                           // 포함여부 확인 : 존재
    // string_list_number.clear();                                                  // 리셋 : 안됨
    System.out.println(string_list_number.isEmpty());                               // 비어 있는지 검사
    System.out.println(string_list_number.size());                                  // 개수

    System.out.println("----------------------------------");

    List<Integer> integer_list = new ArrayList<>();
    integer_list.add(1);
    integer_list.add(2);
    integer_list.add(3);
    List<Integer> integer_list_number = Arrays.asList(1, 2, 3);
    System.out.println(integer_list_number.get(2));                                 // 조회 : 3출력
    // integer_list_number.add(4);                                                  // 추가 : 안됨
    integer_list_number.set(2, 5);                                                  // 수정 : 3을 5로 변경
    System.out.println(integer_list_number);                                        // 조회 : [1, 2, 5]
    // integer_list.remove(3);                                                      // 삭제 : 안됨
    System.out.println(integer_list_number.subList(0, 1));                          // 부분조회 : 1
    integer_list.sort(Integer::compareTo);                                          // 나열
    System.out.println(integer_list_number.contains(1));                            // 포함
    // integer_list_number.clear();                                                 // 리셋 : 안됨
    System.out.println(integer_list_number.isEmpty());                              // 비어 있는지 검사
    System.out.println(integer_list_number.size());                                 // 개수

    System.out.println(string_list_number);
    System.out.println(integer_list_number);
  }

}
