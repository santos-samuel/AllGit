package org.zezutom.springseries0114.part03.lazy;

@Component(value = "lazyCar")
public class Car {

    @Autowired
    @Lazy
    private Seat driver;

    @Autowired
    @Lazy
    private Seat passenger;

    public Seat getDriver() {
        return driver;
    }

    public Seat getPassenger() {
        return passenger;
    }
}
