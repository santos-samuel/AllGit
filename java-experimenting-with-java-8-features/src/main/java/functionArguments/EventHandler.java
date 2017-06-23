package functionArguments;

import java.util.logging.Logger;

public class EventHandler {

    private final static Logger LOG = Logger.getLogger(EventHandler.class.getName());

    public void EventHandler(Runnable event) {
        String eventName = event.getClass().getName();

        LOG.info("Executing event: " + eventName);
        event.run();
        LOG.info("Done executing event: " + eventName);
    }


}
