import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public void execute() {

        logger.info("Application Started");

        logger.debug("Debug Message");

        logger.warn("Warning Message");

        logger.error("Error Message");

        logger.info("Application Finished");
    }
}