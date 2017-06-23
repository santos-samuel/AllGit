package defaultMethods;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class NormalCarTest {
    private Car car;

    @Before
    public void setup() {
        this.car = new NormalCar();
    }

    @Test
    public void shouldReturnDrive() throws Exception {
        String drive = car.drive();
        Assert.assertThat(drive, equalTo("Drive"));
    }

    @Test
    public void shouldReturnCannotSail() throws Exception {
        String sail = car.sail();
        Assert.assertThat(sail, equalTo("Cannot sail"));
    }
}