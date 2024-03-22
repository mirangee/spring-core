package com.spring.core.lombok;

import org.junit.jupiter.api.Test;


class PersonTest {
    
    @Test // main 메서드 없어도 테스트 진행 가능
    void lombokTest() {
        Person p = new Person();
        p.setName("김철수");
        p.setAge(30);

        String name = p.getName();
        int age = p.getAge();

        System.out.println("p = " + p);

        Person p2 = new Person("박영희", 46);
        System.out.println("p2 = " + p2);

    }
}