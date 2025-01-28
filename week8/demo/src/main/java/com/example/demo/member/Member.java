package com.example.demo.member;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Member {

    private volatile static Member instance;

    protected Integer id;     // Reference Type 주소를 담는 그릇 : 객체가 담기며, NULL 이 들어갈 수 있다.
    protected String name;
    protected int age;        // Primitive Type 값을 담는 그릇 : 값 그 자체가 담기며, NULL 이 들어갈 수 없다. (무조건 값이 있어야하기에 기본값 존재)
    protected String email;

    public static Member getInstance() {
        synchronized (Member.class) {
            if (Objects.isNull(instance)) {
                instance = new Member();
            }
        }
        return instance;
    }
}