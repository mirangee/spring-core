package com.spring.core.chap01;

public class Hotel {
    // Hotel과 Restaurant 객체는 의존 관계다.
    // 의존관계: 어떤 객체가 정상 동작하기 위해 다른 객체를 필요로 하는 것.
    private Restaurant restaurant;
    private Chef chef;

    // 의존 주입하는 두 가지(개발자가 직접 하는 경우)
    // 1. 생성자 활용
    public Hotel(Restaurant restaurant, Chef chef) {
        this.restaurant = restaurant;
        this.chef = chef;
    }

    //2. getter, setter 활용

    // restaurant 예약 기능
    public void reserve() {
        System.out.printf("우리 호텔의 레스토랑은 %s입니다. 셰프는 %s입니다.", restaurant.getClass().getSimpleName(), chef.getClass().getSimpleName());
        // 예약을 수행하려면 레스토랑에 연락해서 예약을 넣어야 함.
        restaurant.order();
    }

}
