package org.zezutom.springseries0114.part03.inject;

@Configuration
public class SeatProvider implements Provider<Seat> {

    @Override
    @Bean
    @Scope(value = "prototype")
    public Seat get() {
        return new Seat();
    }
}
