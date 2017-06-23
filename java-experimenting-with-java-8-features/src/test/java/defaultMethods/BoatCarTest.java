package defaultMethods;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;

public class BoatCarTest {

    private BoatCar boatCar;

    @Before
    public void setup() {
        this.boatCar = new BoatCar();
    }

    @Test
    public void testSail() throws Exception {
        String sail = boatCar.sail();
        Assert.assertThat(sail, equalTo("Sail"));
    }
}