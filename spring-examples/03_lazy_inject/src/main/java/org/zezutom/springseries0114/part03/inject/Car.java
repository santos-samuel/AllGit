package org.zezutom.springseries0114.part03.inject;

@Component
public class Car {

    private Seat driver;

    private Seat passenger;

    @Inject
    public Car(Provider<Seat> seatProvider) {
        driver =    seatProvider.get();
        passenger = seatProvider.get();
    }

    public Seat getDriver() {
        return driver;
    }

    public Seat getPassenger() {
        return passenger;
    }
}
