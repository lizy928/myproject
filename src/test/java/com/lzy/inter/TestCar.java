package com.lzy.inter;

/**
 * Created By Lizhengyuan on 18-11-13
 */
public class TestCar {

    private static Car car;

    private static Car1 car1;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    TestCar(Car car){
        this.car = car;
    }

    public static void main(String[] args) {
        car = car1;
        car.getVoice();
    }

}
