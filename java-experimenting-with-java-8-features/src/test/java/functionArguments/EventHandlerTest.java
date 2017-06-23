package functionArguments;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

public class EventHandlerTest {

    private EventHandler eventHandler;

    @Before
    public void setup() {
        this.eventHandler = new EventHandler();
    }

    @Test
    public void testEventHandler() throws Exception {
        System.out.println(LocalTime.now());
        Runnable runnable = () -> System.out.println(LocalTime.now());

        Thread.sleep(2000);
        eventHandler.EventHandler(runnable);
    }
}
