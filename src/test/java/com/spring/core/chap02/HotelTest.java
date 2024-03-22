package com.spring.core.chap02;

import com.spring.core.config.HotelManager;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
    // 스프링 컨테이너를 읽어오는 객체
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(HotelManager.class);
    // 우리가 만든 호텔 매니저 객체를 전달해 등록된 빈을 가지고 오라고 지정


    @Test
    void hotelAutoTest() {
//        Hotel hotel = new Hotel();
        Hotel hotel = ctx.getBean(Hotel.class); // hotel 타입의 객체를 찾아서 나에게 반환해줘.
        hotel.reserve();
    }
}