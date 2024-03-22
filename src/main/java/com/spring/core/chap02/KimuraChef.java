package com.spring.core.chap02;

import org.springframework.stereotype.Component;

@Component("kc")
public class KimuraChef implements Chef {

    public void cook() {
        System.out.println("기무라 셰프가 요리를 합니다.");
    }
}
