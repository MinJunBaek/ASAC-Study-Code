package com.example.demo;

import com.example.demo.hero.AgilityHero;
import com.example.demo.hero.IntelligenceHero;
import com.example.demo.hero.StrengthHero;
import com.example.demo.hero.common.Hero;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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

    System.out.println("----------------------------------");

    /* Collection 3) Set 세트 */
    // Set<String> string_set = new HashSet<>();                  // 빈 Set 선언 (String 요소)
    // string_set.add("1");
    // string_set.add("2");
    // string_set.add("3");
    Set<String> string_set = new HashSet<>(Arrays.asList("1", "2", "3"));
    string_set.add("4");                                // 추가
    string_set.remove("1");                          // 삭제
    System.out.println(string_set.contains("1"));       // 포함여부 확인
    string_set.clear();                                 // 리셋
    System.out.println(string_set.isEmpty());           // 비어있는지 검사
    System.out.println(string_set.size());              // 개수
    // Set<Integer> integer_set = new HashSet<>();                // 빈 Set 선언 (Integer 요소)
    // integer_set.add(1);
    // integer_set.add(2);
    // integer_set.add(3);
    Set<Integer> integer_set = new HashSet<>(Arrays.asList(1, 2, 3));
    integer_set.add(1);                                  // 추가
    integer_set.remove(3);                            // 삭제
    System.out.println(integer_set.contains(1));         // 포함여부 확인
    integer_set.clear();                                 // 리셋
    System.out.println(integer_set.isEmpty());           // 비어있는지 검사
    System.out.println(integer_set.size());              // 개수 확인

    System.out.println(string_set);
    System.out.println(integer_set);

    System.out.println("----------------------------------");

    Map<Integer, String> string_map = new HashMap<>();            // 빈 Map 선언 (String 요소)
    string_map.put(1, "1");
    string_map.put(2, "2");
    string_map.put(3, "3");
    /* 주의 : Arrays.asList 와 Map.of 으로 생성되는 Collection 은 Immutable 불변성이기에 수정 불가 - get, put, remove 등 불가 */
    // Map<Integer, String> string_map = Map.of(1, "1", 2, "2", 3, "3");
    System.out.println(string_map.get(3));                        // 조회
    string_map.put(4, "4");                                       // 추가
    string_map.replace(4, "5");                                   // 수정
    System.out.println(string_map);
    string_map.remove(3);                                    // 삭제
    System.out.println(string_map.containsKey(1));                // 포함
    System.out.println(string_map.containsKey("1"));              // 포함
    System.out.println(string_map.entrySet());                    // - Entry = [Key, Value] (Set)
    System.out.println(string_map.keySet());                      // - Key (Set)
    System.out.println(string_map.values());                      // - Value (List)
    string_map.clear();                                           // 리셋
    System.out.println(string_map.isEmpty());                     // 검사
    System.out.println(string_map.size());                        // 개수

    Map<Integer, Integer> integer_map = new HashMap<>();        // 빈 Map 선언 (Integer 요소)
    integer_map.put(1, 1);
    integer_map.put(2, 2);
    integer_map.put(3, 3);
    /* 주의 : Arrays.asList 와 Map.of 으로 생성되는 Collection 은 Immutable 불변성이기에 수정 불가 - get, put, remove 등 불가 */
    // Map<Integer, Integer> integer_map = Map.of(1, 1, 2, 2, 3, 3);
    System.out.println(integer_map.get(3));                       // 조회
    integer_map.put(4, 4);                                        // 추가
    integer_map.replace(4, 5);                                    // 수정
    integer_map.remove(3);                                   // 삭제
    System.out.println(integer_map.containsKey(1));               // 포함
    System.out.println(integer_map.containsValue(1));             // 포함
    System.out.println(integer_map.entrySet());                   // - Entry = [Key, Value] (Set)
    System.out.println(integer_map.keySet());                     // - Key (Set)
    System.out.println(integer_map.values());                     // - Value (List)
    integer_map.clear();                                          // 리셋
    System.out.println(integer_map.isEmpty());                    // 검사
    System.out.println(integer_map.size());                       // 개수

    System.out.println(string_map);
    System.out.println(integer_map);
  }

}
