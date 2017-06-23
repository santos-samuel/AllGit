package defaultMethods;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;

public class FloatingCarTest {
    private Car car;

    @Before
    public void setup() {
        this.car = new FloatingCar();
    }

    @Test
    public void shouldReturnDrive() throws Exception {
        String drive = car.drive();
        Assert.assertThat(drive, equalTo("Drive"));
    }

    @Test
    public void shouldReturnSail() throws Exception {
        String sail = car.sail();
        Assert.assertThat(sail, equalTo("Sail"));
    }
}